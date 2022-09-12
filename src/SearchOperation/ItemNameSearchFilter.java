/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SearchOperation;

import TableOperation.InsertPartyNameToTable;


import dbdriver.DBDriver;
import dboperation.PurchaseDBOperation;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import staffGUI.AddNewItemFrame;
import staffGUI.NewPurchaseFrame;


public class ItemNameSearchFilter extends javax.swing.JFrame {
    
    public static int row, col;
    
   
    
   public static String existedItem=null;
     

    public ItemNameSearchFilter() {
        initComponents();
        this.insertData();   

    }
    
    private ArrayList getiTemNamesInfo()
    {
        ArrayList info=new ArrayList();
        try
           {
             Statement st= new DBDriver().getStatment();
             String query="Select *from iteminfo";
              ResultSet rs1=st.executeQuery(query);
         
             while(rs1.next())
            {

             String name=rs1.getString(2);
             String hsn=rs1.getString(6);
             ArrayList temp=new ArrayList();
             temp.add(name);
             temp.add(hsn);
            
             //names.toLowerCase();
             info.add(temp);
             
             
            }
             
                  st.close();
              }
              
           catch (SQLException e)
           {
               System.out.println("Exeption in ItemNameSearchFilter Class and method is getiTemNames () "+e);
           }
       
        return info;
        
    }
    
    private void insertData()
    {
        ArrayList iteminfo=getiTemNamesInfo();
        
        
         int columncount = jTable1.getColumnCount();
        InsertPartyNameToTable it = new InsertPartyNameToTable();
        it.getDataInserted(jTable1, columncount, iteminfo,30);
      
    }
    
      
   

    private void searchFilter(String searchTerm)
    {
       
       
      

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) jTable1.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchTerm));
        jTable1.setRowSorter(sorter);

        

    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(440, 500));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Search");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 70, 50, 17);

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(20, 90, 260, 30);

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jButton1.setText("  Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 90, 30);

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 90, 67, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 10, 24, 24);

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "HSN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 350, 340);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        //  String search="";
        searchFilter(jTextField1.getText());
        // String search=jTextField1.getText();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //   TODO add your handling code here:
              NewPurchaseFrame.itemselectionframevalue=0;
           this.dispose();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            AddNewItemFrame l = new AddNewItemFrame();
            l.setSize(d);
            l.revalidate();
            l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
               NewPurchaseFrame.itemselectionframevalue=0;
             this.dispose();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            AddNewItemFrame l = new AddNewItemFrame();
            l.setSize(d);
            l.revalidate();
            l.setVisible(true);
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           String itemname=jTextField1.getText();
           
        //  System.out.println("Selected item is  "+itemname);
           
           
           if(!itemname.isEmpty())
           {
           if(existedItem==null)
           {

           if(!NewPurchaseFrame.uniqueitems.contains(itemname))
           {
               NewPurchaseFrame.uniqueitems.add(itemname);
               NewPurchaseFrame.jTable1.setValueAt(itemname, row, col);
               NewPurchaseFrame.iteminfo = new PurchaseDBOperation().getItemInfo(itemname);
               // NewPurchaseFrame.currentabledata.add(new PurchaseDBOperation().getItemMoreInfo(itemname) );
               NewPurchaseFrame.itemselectionframevalue = 0;
               this.dispose();
               
           }
           else
           {
               String msg="Item : "+itemname+" Already Existed in the Table";
               JOptionPane.showMessageDialog(null, msg);
           }
           }
           else
           {
               NewPurchaseFrame.uniqueitems.remove(existedItem);
               NewPurchaseFrame.uniqueitems.add(itemname);
               NewPurchaseFrame.jTable1.setValueAt(itemname, row, col);

               NewPurchaseFrame.iteminfo = new PurchaseDBOperation().getItemInfo(itemname);
               //  NewPurchaseFrame.currentabledata.add(new PurchaseDBOperation().getItemMoreInfo(itemname) );

               NewPurchaseFrame.itemselectionframevalue = 0;

               this.dispose();
               
               
               
           }
        
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Please Select a Item");
           }
           
          
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
          String itemname=jTextField1.getText();
           
        //  System.out.println("Selected item is  "+itemname);
           
           
           if(!itemname.isEmpty())
           {
           if(existedItem==null)
           {

           if(!NewPurchaseFrame.uniqueitems.contains(itemname))
           {
               NewPurchaseFrame.uniqueitems.add(itemname);
               NewPurchaseFrame.jTable1.setValueAt(itemname, row, col);
               NewPurchaseFrame.iteminfo = new PurchaseDBOperation().getItemInfo(itemname);
               // NewPurchaseFrame.currentabledata.add(new PurchaseDBOperation().getItemMoreInfo(itemname) );
               NewPurchaseFrame.itemselectionframevalue = 0;
               this.dispose();
               
           }
           else
           {
               String msg="Item : "+itemname+" Already Existed in the Table";
               JOptionPane.showMessageDialog(null, msg);
           }
           }
           else
           {
               NewPurchaseFrame.uniqueitems.remove(existedItem);
               NewPurchaseFrame.uniqueitems.add(itemname);
               NewPurchaseFrame.jTable1.setValueAt(itemname, row, col);

               NewPurchaseFrame.iteminfo = new PurchaseDBOperation().getItemInfo(itemname);
               //  NewPurchaseFrame.currentabledata.add(new PurchaseDBOperation().getItemMoreInfo(itemname) );

               NewPurchaseFrame.itemselectionframevalue = 0;

               this.dispose();
               
               
               
           }
        
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Please Select a Item");
           }
           
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        NewPurchaseFrame.itemselectionframevalue=0;
                 this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        // TODO add your handling code here:
 NewPurchaseFrame.itemselectionframevalue=0;
                 this.dispose();
    }//GEN-LAST:event_jLabel2KeyPressed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        // TODO add your handling code here:
//        Color clr = new Color(51,161,222);
//        jTable1.setBorder(new LineBorder(clr,1));
    }//GEN-LAST:event_jTable1FocusGained

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:
//        jTable1.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTable1FocusLost

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index1=jTable1.getSelectedRow();

        String code=(String) jTable1.getValueAt(index1, 0);
        jTextField1.setText(code);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            int index1=jTable1.getSelectedRow();

            String code=(String) jTable1.getValueAt(index1, 0);
            jTextField1.setText(code);

        }
        if(evt.getKeyCode()==KeyEvent.VK_TAB)
        {
            if (evt.getModifiers() > 0) {
                jTable1.transferFocusBackward();
            } else {
                jTable1.transferFocus();
            }
            evt.consume();
        }
    }//GEN-LAST:event_jTable1KeyPressed

     public int getEmptyRows(JTable table)
    {
    int emptyRows = 0;
    rowSearch: for (int row = 0; row < table.getRowCount(); row++)
    { 
        for (int col = 0; col < table.getColumnCount(); col++) 
        { 
            if (table.getValueAt(row, col) != null) 
            { 
                continue rowSearch; 
            }
        }
        emptyRows++; 
    }
    return emptyRows;
}
     
     
     public int getPosition(ArrayList mas,String str)
    {
        
       int pos=-1;
       
        for (int i = 0; i < mas.size(); i++)
        {
         String ele=(String)mas.get(i);
         if(ele.equals(str))
         {
             pos=i;
             break;
         }
        }
        return pos;
    }
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemNameSearchFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemNameSearchFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemNameSearchFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemNameSearchFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemNameSearchFilter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
