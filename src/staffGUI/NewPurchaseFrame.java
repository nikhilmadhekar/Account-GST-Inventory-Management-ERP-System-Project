package staffGUI;

import ManagerGUI.CurrentDateTime;
import ManagerGUI.LoginFrame;
import SearchOperation.ItemNameSearchFilter;
import SearchOperation.PartyNameSearchFilter;
import TableOperation.InsertComboBoxToJtable;
import dboperation.PurchaseDBOperation;
import dboperation.StockDBOperation;
import java.awt.Color;
import static java.awt.Component.TOP_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.RIGHT;
import static javax.swing.SwingConstants.LEFT;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import purchase.EmptyRowIdentifier;
import purchase.PurchaseDB;
import validation.GSTStateCode;
import validation.GSTValidator;
import validation.ValidateInvoice;
import dboperation.ManageProfileDBOperation;

public class NewPurchaseFrame extends javax.swing.JFrame {
    
    public int mouseclickedstatus=0;
    public static String logoutdatetime=new CurrentDateTime().getDateTime();
    
    String placeofsupply=""; // place of supply 
    public static String bankdetails=""; // Bank Details of the Party from whom purchase is being done
    
    public static int partyselectionframevalue=0;
    public static int itemselectionframevalue=0;
    public  static int partygstcode=0;

  
    public static ArrayList uniqueitems=null;
    public static ArrayList iteminfo=null;
   
 
  
    public NewPurchaseFrame() {
        super("NEW PURCHASE  Login By"+" "+LoginFrame.uname);
        initComponents();
     ((DefaultTableCellRenderer)jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment((int) TOP_ALIGNMENT);
    ((DefaultTableCellRenderer)jTable3.getTableHeader().getDefaultRenderer()).setHorizontalAlignment((int) TOP_ALIGNMENT);
      
        DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
        rendar.setHorizontalAlignment(RIGHT);
              
        DefaultTableCellRenderer rendar1 = new DefaultTableCellRenderer();
        rendar1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        
        
        DefaultTableCellRenderer rendarL = new DefaultTableCellRenderer();
        rendarL.setHorizontalAlignment(LEFT);
        
        jTable1.getColumnModel().getColumn(0).setCellRenderer(rendarL);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(rendar1);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rendarL);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rendar);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rendar1);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(rendar);
        jTable1.getColumnModel().getColumn(6).setCellRenderer(rendar);
        jTable1.getColumnModel().getColumn(7).setCellRenderer(rendar);
        jTable1.getColumnModel().getColumn(8).setCellRenderer(rendar);
        jTable1.getColumnModel().getColumn(9).setCellRenderer(rendar);
        jTable1.getColumnModel().getColumn(10).setCellRenderer(rendar);
        jTable1.getColumnModel().getColumn(11).setCellRenderer(rendar);
        jTable1.getColumnModel().getColumn(12).setCellRenderer(rendar);
        jTable1.getColumnModel().getColumn(13).setCellRenderer(rendar);
        
        bankdetails = "";
        
        partyselectionframevalue = 0;
        itemselectionframevalue = 0;
        partygstcode = 0;
        
        uniqueitems = new ArrayList();
        iteminfo = new ArrayList();
      
       
        
       String gstnum= new PurchaseDBOperation().getHomeCompanyGST();
       
       if(!gstnum.equals("Unregistered") )
       {
             String substr1 = gstnum.substring(0, 2);
             substr1=substr1.trim();
        ArrayList statecode = new GSTStateCode().getStateCode();
        String sc="";
        for (int i = 0; i < statecode.size(); i++)
        {   
            String str = (String) statecode.get(i);
            String substr2 = str.substring(0, 2);
            substr2=substr2.trim();
          
            if (substr2.equals(substr1))
            {
                sc = str;
                break;
            }
          }
        //  System.out.println("GST Code is :"+sc);
        jComboBox3.setSelectedItem(sc);
       }
      
       
      
        
//    

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Search Party:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(15, 20, 96, 23);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 60, 185, 25);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Place of Supply:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 100, 120, 23);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("GSTIN:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(15, 100, 50, 23);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel5);
        jLabel5.setBounds(400, 20, 227, 70);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 100, 185, 25);

        jLabel36.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel36.setText("Name:");
        jPanel1.add(jLabel36);
        jLabel36.setBounds(15, 60, 49, 23);

        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(120, 20, 185, 27);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Address:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(330, 20, 62, 23);

        jComboBox3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State ", "01 Jammu & Kashmir", "02 Himachal Pradesh", "03 Punjab", "04 Chandigarh", "05 Uttarakhand", "06 Haryana", "07 Delhi", "08 Rajasthan", "09 Uttar Pradesh", "10 Bihar", "11 Sikkim", "12 Arunachal Pradesh", "13 Nagaland", "14 Manipur", "15 Mizoram", "16 Tripura", "17 Meghalaya", "18 Assam", "19 West Bengal", "20 Jharkhand", "21 Orissa", "22 Chhattisgarh", "23 Madhya Pradesh", "24 Gujarat", "25 Daman & Diu", "26 Dadra & Nagar Haveli", "27 Maharashtra", "28 Andhra Pradesh", "29 Karnataka", "30 Goa", "31 Lakshadweep", "32 Kerala", "33 Tamil Nadu", "34 Puducherry", "35 Andaman & Nicobar Islands", "36 Telengana", "37 Andrapradesh(New)" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jComboBox3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox3KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(460, 100, 170, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(12, 10, 650, 140);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Invoice No:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 60, 84, 23);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("Invoice Date:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(250, 60, 100, 23);

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(100, 60, 140, 25);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("Purchase Type:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 10, 120, 23);

        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(555, 60, 90, 25);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setText("Payment Term (Days):");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 100, 160, 23);

        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(180, 100, 50, 22);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setText("Payment Due Date:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(250, 100, 141, 23);

        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(400, 100, 145, 22);

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setText("PO No:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(490, 60, 52, 23);

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "By Company" }));
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(535, 10, 110, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Purchase", " " }));
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2KeyPressed(evt);
            }
        });
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(130, 10, 110, 30);

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setText("Sale Ref:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(465, 10, 70, 23);

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setText("Cost Centre:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(245, 10, 100, 23);

        jComboBox4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select State ", "01 Jammu & Kashmir", "02 Himachal Pradesh", "03 Punjab", "04 Chandigarh", "05 Uttarakhand", "06 Haryana", "07 Delhi", "08 Rajasthan", "09 Uttar Pradesh", "10 Bihar", "11 Sikkim", "12 Arunachal Pradesh", "13 Nagaland", "14 Manipur", "15 Mizoram", "16 Tripura", "17 Meghalaya", "18 Assam", "19 West Bengal", "20 Jharkhand", "21 Orissa", "22 Chhattisgarh", "23 Madhya Pradesh", "24 Gujarat", "25 Daman & Diu", "26 Dadra & Nagar Haveli", "27 Maharashtra", "28 Andhra Pradesh", "29 Karnataka", "30 Goa", "31 Lakshadweep", "32 Kerala", "33 Tamil Nadu", "34 Puducherry", "35 Andaman & Nicobar Islands", "36 Telengana", "37 Andrapradesh(New)" }));
        jComboBox4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox4KeyPressed(evt);
            }
        });
        jPanel2.add(jComboBox4);
        jComboBox4.setBounds(350, 10, 110, 30);

        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(350, 60, 120, 25);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setText("[ dd/mm/yyyy]");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(430, 120, 90, 16);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setText("[ dd/mm/yyyy]");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(260, 80, 90, 13);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(685, 10, 660, 140);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(1317, 305));
        jPanel3.setLayout(null);

        jTable1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Name", "Description", "HSN/SAC", "GST Rate", "Unit", "Quantity", "Rate", "Amount", "Discount(%)", "Taxable Amount", "CGST", "SGST", "IGST", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true, true, false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(15, 16, 1305, 180);

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jButton5.setText(" Row");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(15, 210, 90, 30);

        jButton6.setBackground(new java.awt.Color(0, 51, 102));
        jButton6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jButton6.setText(" Row");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(123, 210, 90, 30);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel28);
        jLabel28.setBounds(1250, 215, 70, 25);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel29);
        jLabel29.setBounds(960, 215, 70, 25);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel30);
        jLabel30.setBounds(1055, 215, 70, 25);

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel31);
        jLabel31.setBounds(1150, 215, 70, 25);

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel32);
        jLabel32.setBounds(680, 215, 70, 25);

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/truck.png"))); // NOI18N
        jButton1.setText("Transport Charges");
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
        jPanel3.add(jButton1);
        jButton1.setBounds(240, 210, 170, 30);

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/packaging.png"))); // NOI18N
        jButton2.setText("Packaging Charges");
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
        jPanel3.add(jButton2);
        jButton2.setBounds(435, 210, 170, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(12, 165, 1335, 250);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setText("GST Table");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(15, 16, 72, 23);

        jTable2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rate", "CGST", "SGST", "IGST", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(15, 46, 615, 112);

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setText("Total");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(25, 165, 50, 23);

        jTextField24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jTextField24);
        jTextField24.setBounds(160, 166, 70, 18);

        jTextField25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jTextField25);
        jTextField25.setBounds(290, 166, 70, 18);

        jTextField19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jTextField19);
        jTextField19.setBounds(420, 166, 70, 18);

        jTextField26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jTextField26);
        jTextField26.setBounds(530, 166, 92, 18);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(12, 380, 0, 0);

        jButton9.setBackground(new java.awt.Color(0, 51, 102));
        jButton9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        jButton9.setText("Save");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton9KeyPressed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(12, 610, 90, 35);

        jButton13.setBackground(new java.awt.Color(0, 51, 102));
        jButton13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jButton13.setText("Clear");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jButton13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton13KeyPressed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(110, 610, 90, 35);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel23.setText("Narration:");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(330, 10, 76, 23);

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(jLabel14);
        jLabel14.setBounds(15, 40, 300, 110);

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel25.setText("Bank Details :");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(15, 10, 99, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea1FocusLost(evt);
            }
        });
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTextArea1);

        jPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(330, 40, 300, 110);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(685, 430, 660, 160);

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(null);

        jTable3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GST  Rate", "CGST", "SGST", "IGST", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 630, 100);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jLabel20);
        jLabel20.setBounds(520, 120, 100, 25);

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jLabel33);
        jLabel33.setBounds(170, 120, 70, 25);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jLabel34);
        jLabel34.setBounds(290, 120, 70, 25);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jLabel35);
        jLabel35.setBounds(400, 120, 70, 25);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(12, 430, 650, 160);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(479, 50));

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manageparty.png"))); // NOI18N
        jMenu4.setText("Manage Client");
        jMenu4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jMenuItem8.setText("Add Client");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editcompany.png"))); // NOI18N
        jMenuItem10.setText("Edit / Search Client");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manageitem.png"))); // NOI18N
        jMenu2.setText("Manage Item");
        jMenu2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jMenuItem1.setText("Add Item");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editcompany.png"))); // NOI18N
        jMenuItem15.setText("Edit / Search Item");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stock.png"))); // NOI18N
        jMenuItem9.setText("Stock Register");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N
        jMenu5.setText("Purchase");
        jMenu5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        jMenuItem11.setText("New Purchase");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jMenuItem16.setText("Search Purchase");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchasepayment.png"))); // NOI18N
        jMenuItem17.setText("Purchase Payment");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/advancepayment.png"))); // NOI18N
        jMenuItem18.setText("Advance Payment");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sale.png"))); // NOI18N
        jMenu7.setText("Sale");
        jMenu7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        jMenuItem19.setText("New Sale");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem19);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jMenuItem20.setText("Search Sale");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem20);

        jMenuBar1.add(jMenu7);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jMenu6.setText("Logout");
        jMenu6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        jMenuItem12.setText("Exit");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         // int emprows=new EmptyRowIdentifier().getEmptyRows(jTable1); // here we check there are no Empty Rows
           // if(emprows==0)
        {
        jTable1.setRowHeight(30);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{null,null,null,null});
          
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
         int totrows = jTable1.getRowCount();
            if(totrows>0)
             {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int row=jTable1.getSelectedRow();
                 System.out.println("Selected Row to Delete "+row);
                String itemname = (String) jTable1.getValueAt(row, 0);
                  if(itemname!=null)
                  {
                      uniqueitems.remove(itemname);
                       model.removeRow(row);
                        
                        int ind = getTrasportationIndex();
                      if (ind != -1)
                      {
                        
                          int big = getHighestGSTRateForTransportation();
                          if (big != -1) 
                          {
                             
                              String st = Integer.toString(big) + "%";
                              jTable1.setValueAt(st, ind, 3);
                            //  System.out.println("Index is "+ind+ "  --  "+st);
                          }
                          else
                          {
                              String st = Integer.toString(18) + "%";
                              jTable1.setValueAt(st, ind, 3);
                          }
                          String stva = (String) jTable1.getValueAt(ind, 9);
                          double dtaxamt=Double.parseDouble(stva);
                       
                          DecimalFormat df = new DecimalFormat("0.000");
                          String s = df.format(dtaxamt);
                          dtaxamt = Double.parseDouble(s);

                          taxEvalaution(ind, dtaxamt);
                          evaluateTotal();
                          addIntoGSTPercentageTable();
                      } 
                      else
                      {
                          evaluateTotal();
                          addIntoGSTPercentageTable();
                      }
                       
                       
                       
                       if (itemname.equals("Transportation")) {
                          jButton1.setEnabled(true);
                      }
                      if (itemname.equals("Packaging")) {
                          jButton2.setEnabled(true);
                      }
                      
                      
                  }
                  else
                  {
                      model.removeRow(row);
                  }
                
                
                
               
             }
             else
            {
                JOptionPane.showMessageDialog(null, "No Rows to Delete");
            }
                 
     
    }//GEN-LAST:event_jButton6ActionPerformed

    
    
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

        ArrayList mas=new ArrayList();
        ArrayList gstinfo=new ArrayList();
        String partyname=jLabel2.getText();
        String partygst=jLabel6.getText();
        String splace=(String) jComboBox3.getSelectedItem();
        String purchasetypes=(String) jComboBox2.getSelectedItem();
        String costcentres=(String) jComboBox4.getSelectedItem();
        String salerefs= (String) jComboBox1.getSelectedItem();
        String invoicenum=jTextField1.getText();
        String  invoicedate = jTextField6.getText();
        String ponum=jTextField2.getText();      
        String paytermmdays=jTextField3.getText();  
        String payduedate=jTextField4.getText();      
       
        String bankinfo=bankdetails;   
        String narrations=jTextArea1.getText();
       
               
        
        String totalinamount=jLabel28.getText();
        String totaltaxamount=jLabel20.getText();
        String totalcgst=jLabel29.getText();
        String totalsgst=jLabel30.getText();
        String totaligst=jLabel31.getText();
         
                 
            
       
        
      
        
        if(ponum.length()==0)
        {
            ponum="NIL";
        }
        if(paytermmdays.length()==0)
        {
            paytermmdays="0";
            
           payduedate= invoicedate;
        }
        
        
        if(narrations.length()==0)
        {
            narrations="No Narration";
        }

//===========Get Data From Purchase Table=================================
        int rowcount=jTable1.getRowCount();
        int colcount=jTable1.getColumnCount();
        
      //  System.out.println("Row Count "+rowcount);
        
        double tamount1=0.0;
        if (uniqueitems.size() > 0)
        {
            for (int i = 0; i < rowcount; i++) {
                ArrayList temp = new ArrayList();
                for (int j = 0; j < colcount; j++) {
                    String str = (String) jTable1.getValueAt(i, j);
                    temp.add(str);
                }

                mas.add(temp);
            }
        }
      
         
       //  System.out.println("Total Tax Amount: "+totaltaxamount);
         //===========Get Data From GST Table=================================
         
         
//              int rowcount1=jTable3.getRowCount();
//        int colcount1=jTable3.getColumnCount();
//
//         for(int i=0;i<rowcount1;i++)
//        {
//            ArrayList temp=new ArrayList();
//
//            for (int j = 0; j < colcount1; j++)
//            {
//               // String str=(String) jTable3.getValueAt(i, 0);
//                String gsttable= (String) jTable3.getValueAt(i, j);
//                temp.add(gsttable);
//
//            }
//
//                if(!temp.isEmpty())
//                gstinfo.add(temp);
//         }
//             
         
      //  System.out.println("GSTinfo Size: "+gstinfo.size());
//==============================validation starts =============================4

        System.out.println("supplyplace "+splace);
         
         
         
        splace = splace.trim();
        purchasetypes = purchasetypes.trim();
        String invoicevalidstr = new ValidateInvoice().isValidInvoiceNO(invoicenum);
        if(partyname.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Party Name Cannot be Empty");
        }
       
        else if (!partygst.equals("Unregistered") && !validGST(partygst).equals("VALID GST"))
        {
           JOptionPane.showMessageDialog(null, "GSTIN Number is not Valid Please Try Again");
        }
        
        else if(splace.equals("Select State"))
        {
             JOptionPane.showMessageDialog(null, "Please Select Place of Supply");
        }
               else if(purchasetypes.equals("Select"))
        {
             JOptionPane.showMessageDialog(null, "Please Select the Purchase type");
        }
        else if(!invoicevalidstr.isEmpty())
        {
            JOptionPane.showMessageDialog(null, invoicevalidstr);
        }
        else if(invoicedate.isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Invoice Date Cannot be Empty");   
        }
        
//            else if(payduedate.isEmpty())
//        {
//          JOptionPane.showMessageDialog(null, "Payment Due Date Cannot be Empty");   
//        }
            
            else if(mas.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Purchase Table  Can not be Empty");
            }
            
            else
            {
                
                if(new PurchaseDB().isInvoiceExisted(invoicenum))
                {
                     JOptionPane.showMessageDialog(null, "Invoice Number Already Existed");
                }
                else
                {
                    
                
                PurchaseDBOperation pd=new PurchaseDBOperation();
                    String status = "payable";
                    String paymentmode = "unknown";
                    String paid = "0.0";
                    String paying = "0.0";
                    String remaniamou = "0.0";
                    String descrip = "yet to be made";
                 
        



                    System.out.println("uniqueitems list is "+uniqueitems);
                    
                    
                    StockDBOperation sd=new StockDBOperation();
                    
             ArrayList stockinfo=sd.getAllStockinfo();
  
            for(int i=0;i<uniqueitems.size();i++)
        {
             ArrayList temp=(ArrayList) mas.get(i);
            
           // System.out.println("Temp length "+temp.size());
           // System.out.println("temp "+temp);
              pd.addPurchaseInfo(partyname, partygst, splace,purchasetypes, costcentres, salerefs,invoicenum, ponum, invoicedate, paytermmdays, payduedate, temp.get(0).toString(), temp.get(1).toString(), temp.get(2).toString(), temp.get(3).toString(), temp.get(4).toString(), temp.get(5).toString(), temp.get(6).toString(), temp.get(7).toString(), temp.get(8).toString(), temp.get(9).toString(), temp.get(10).toString(), temp.get(11).toString(), temp.get(12).toString(),temp.get(13).toString(),totalinamount,bankinfo, narrations, LoginFrame.uname, LoginFrame.date);
           //    sd.addOpeningStockInfo((String) temp.get(0), (String) temp.get(2), (String) temp.get(5), (String) temp.get(4), (String) temp.get(6), (String) temp.get(9),"0.0","0.0","0.0","0.0","0.0","0.0","0.0","0.0",(String) temp.get(5), (String) temp.get(4), (String) temp.get(6), (String) temp.get(9));   
              
               String iname1=(String) temp.get(0);
               iname1=iname1.toLowerCase();
              for (int j = 0; j <stockinfo.size(); j++) 
              {
                ArrayList temp1=(ArrayList) stockinfo.get(j);
                String iname2=(String) temp1.get(1);
                iname2=iname2.toLowerCase();
                
                if(iname1.equals(iname2))
                {
                    String unit=(String) temp1.get(4);
                    String previouquan=(String) temp1.get(3);
                    String quan[]=unit.split(":");
                    double actualunit=Double.parseDouble(quan[0]);
                    double quantiti=Double.parseDouble((String) temp.get(5));            
                    double finalquantity= quantiti * actualunit;
                    finalquantity=Double.parseDouble(previouquan)+finalquantity;     
                    String fquantity=Double.toString(finalquantity);
                    
                    sd.updateStockinfo(iname2, (String) temp.get(2), fquantity, unit);
                }
              }
        }
             
                   
            
             pd.addSearchPurchaseInfo(partyname, partygst, invoicenum, invoicedate, totalinamount, totaltaxamount, totalcgst, totalsgst, totaligst, status, LoginFrame.uname, LoginFrame.date);   
             pd.addPurchasePaymentInfo(partyname, invoicenum, invoicedate, totalinamount, paid,paying, paymentmode, status, remaniamou, descrip, LoginFrame.uname, LoginFrame.date);
               
 JOptionPane.showMessageDialog(null,"Purchase Entry Successfully Stored");
                
  uniqueitems = new ArrayList();
  
  
jTextField5.setText("");

jLabel2.setText("");
jLabel6.setText("");
jLabel5.setText("");
jComboBox3.setSelectedIndex(0);
jComboBox2.setSelectedIndex(0);
jComboBox4.setSelectedIndex(0);
jComboBox1.setSelectedIndex(0);
jLabel28.setText("");
jLabel29.setText("");
jLabel30.setText("");
jLabel31.setText("");
jLabel32.setText("");
jLabel14.setText("");

jLabel16.setText("");
jLabel17.setText("");
jTextArea1.setText("");
jLabel20.setText("");
jLabel33.setText("");
jLabel34.setText("");
jLabel35.setText("");
jTextField1.setText("");
jTextField6.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jButton1.setEnabled(true);
jButton2.setEnabled(true);
DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
model1.setRowCount(3);

for (int i = 0; i < jTable1.getRowCount(); i++)
{
    for (int j = 0; j < jTable1.getColumnCount(); j++)
    {
        jTable1.setValueAt("", i, j);
    }
}
DefaultTableModel model2 = (DefaultTableModel) jTable3.getModel();
model2.setRowCount(0);

            }
           
            }
        
        this.dispose();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        NewPurchaseFrame l = new NewPurchaseFrame();
        l.setSize(d);
        l.revalidate();
        l.setVisible(true);


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
            int selectedrow=jTable1.getSelectedRow();
               
          if(!jLabel2.getText().isEmpty())
          {
          
         if(selectedrow!=-1)
         {
          
                    String itemname= (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                  openItemSelectionFrame();
                   if(itemname!=null)
                  {
                      ArrayList<String> units = getUnitName();
                      String colname = "Unit";
                      new InsertComboBoxToJtable().getComboBoxInserted(units, jTable1, colname);
                      //  jTable1.setValueAt("Unit", index1, 4);
                    //  iteminfo = new PurchaseDBOperation().getItemInfo(itemname);
                      if(!iteminfo.isEmpty())
                      {
                          jTable1.setValueAt(iteminfo.get(0), selectedrow, 1);
                          jTable1.setValueAt(iteminfo.get(1), selectedrow, 2);
                          jTable1.setValueAt(iteminfo.get(2), selectedrow, 3);
                          jTable1.setValueAt("0.00", selectedrow, 5);
                          jTable1.setValueAt("0.00", selectedrow, 6);
                          jTable1.setValueAt("0.00", selectedrow, 7);
                          jTable1.setValueAt("0.00", selectedrow, 8);
                          jTable1.setValueAt("0.00", selectedrow, 13);
                          jTable1.setValueAt("0.00", selectedrow, 10);
                          jTable1.setValueAt("0.00", selectedrow, 11);
                          jTable1.setValueAt("0.00", selectedrow, 12);
                          iteminfo = new ArrayList();
                          System.out.println("Set Data from iteminfo ");
                          mouseclickedstatus=0;
                      }
                      
                       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        { 
                      
                      if(jTable1.getSelectedColumn()==5)
                      {
                          System.out.println("Selected row 5 now");
                      String qtyvalue= (String) jTable1.getValueAt(jTable1.getSelectedRow(), 5);
                      if(qtyvalue.equals("0.00"))
                       jTable1.setValueAt(null, selectedrow, 5);
//                      
                          
                      }
        }         
                    
                        //=====================Get Amount Calculation==============================================
           
                      String quantity = (String) jTable1.getValueAt(selectedrow, 5);
                      String rate = (String) jTable1.getValueAt(selectedrow, 6);
                      double amount = 0.0;
                      if (quantity != null && rate != null) 
                      {
                          amount = Double.parseDouble(quantity) * Double.parseDouble(rate);
                          
                          DecimalFormat df = new DecimalFormat("0.00");
                          String sdd = df.format(amount);
                          amount = Double.parseDouble(sdd);
                          jTable1.setValueAt(Double.toString(amount), selectedrow, 7);
                      }
                      String discount = (String) jTable1.getValueAt(selectedrow, 8);
                      
                      if (rate != null)
                      {
                          double taxable = 0;
                          double dis = Double.parseDouble(discount);
                          double x = (amount / 100) * dis;
                          taxable = amount - x;
                          
                           
                          DecimalFormat df = new DecimalFormat("0.00");
                          String sdd = df.format(taxable);
                          taxable = Double.parseDouble(sdd);
                          jTable1.setValueAt(Double.toString(taxable), selectedrow, 9);
                            // total evaluation ===========================
                          taxEvalaution(selectedrow, taxable);
                          evaluateTotal();
                          addIntoGSTPercentageTable();

                      }
                       int ind = getTrasportationIndex();
                      if (ind != -1)
                      {
                         // 
                         
                         // System.out.println("STVA "+stva);
                          int big = getHighestGSTRateForTransportation();
                          if (big != -1) 
                          {
                             
                              String st = Integer.toString(big) + "%";
                              jTable1.setValueAt(st, ind, 3);
                            //  System.out.println("Index is "+ind+ "  --  "+st);
                          }
                          String stva = (String) jTable1.getValueAt(ind, 9);
                          double dtaxamt=Double.parseDouble(stva);

                          taxEvalaution(ind, dtaxamt);
                          evaluateTotal();
                          addIntoGSTPercentageTable();
                      }
                    
                  }
                   }
                     
         
          }
          else
          {
             JOptionPane.showMessageDialog(null,"Please Select the Party First");
          } // END HERE FOR SLECTED ROW IS NOT -1 , THAT MEANS A VALID ROW IS BEING SELECTED BY THE USER
          
        
    }//GEN-LAST:event_jTable1KeyPressed

    private ArrayList getUnitName()
    {
         ArrayList<String> items = new ArrayList<String>();
        items.add("None");
        items.add("Bags");
        items.add("Bale");
        items.add("Bundles");
        items.add("Buckles");
        items.add("Billions of units");
        items.add("Box");
        items.add("Bottles");
        items.add("Bunches");
        items.add("Cans");
        items.add("Cubic meter");
        items.add("Cubic centimeter");
        items.add("Centimeter");
        items.add("Cartons");
        items.add("Dozen");
        items.add("Drum");
        items.add("Great gross");
        items.add("Grams");
        items.add("Gross");
        items.add("Gross yards");
        items.add("Kilograms");
        items.add("Kiloliter");
        items.add("Kilometre");
        items.add("Millilitre");
        items.add("Meters");
        items.add("Numbers");
        items.add("Packs");
        items.add("Pieces");
        items.add("Pairs");
        items.add("Quintal");
        items.add("Rolls");
        items.add("Sets");
        items.add("Square feet");
        items.add("Square meters");
        items.add("Square yards");
        items.add("Tablets");
        items.add("Ten gross");
        items.add("Thousands");
        items.add("Tonnes");
        items.add("Tubes");
        items.add("Us gallons");
        items.add("Units");
        items.add("Yards");
        items.add("Others");

        
        return items;
        
    }
    // all actions related to the table
    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
       
       
//          int selectedrow=jTable1.getSelectedRow();
//               
//          if(!jLabel2.getText().isEmpty())
//          {
//          
//         if(selectedrow!=-1)
//         {
//          
//                    String itemname= (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
//                  openItemSelectionFrame();
//                   if(itemname!=null)
//                  {
//                      ArrayList<String> units = getUnitName();
//                      String colname = "Unit";
//                      new InsertComboBoxToJtable().getComboBoxInserted(units, jTable1, colname);
//                      //  jTable1.setValueAt("Unit", index1, 4);
//                    //  iteminfo = new PurchaseDBOperation().getItemInfo(itemname);
//                      if(!iteminfo.isEmpty())
//                      {
//                          jTable1.setValueAt(iteminfo.get(0), selectedrow, 1);
//                          jTable1.setValueAt(iteminfo.get(1), selectedrow, 2);
//                          jTable1.setValueAt(iteminfo.get(2), selectedrow, 3);
//                          jTable1.setValueAt("0.0", selectedrow, 7);
//                          jTable1.setValueAt("0.0", selectedrow, 8);
//                          jTable1.setValueAt("0.0", selectedrow, 13);
//                          jTable1.setValueAt("0.0", selectedrow, 10);
//                          jTable1.setValueAt("0.0", selectedrow, 11);
//                          jTable1.setValueAt("0.0", selectedrow, 12);
//                          iteminfo = new ArrayList();
//                          System.out.println("Set Data from iteminfo ");
//                      }
//                      
//                        //=====================Get Amount Calculation==============================================
//           
//                      String quantity = (String) jTable1.getValueAt(selectedrow, 5);
//                      String rate = (String) jTable1.getValueAt(selectedrow, 6);
//                      double amount = 0.0;
//                      if (quantity != null && rate != null) 
//                      {
//                          amount = Double.parseDouble(quantity) * Double.parseDouble(rate);
//                          
//                          DecimalFormat df = new DecimalFormat("0.00");
//                          String sdd = df.format(amount);
//                          amount = Double.parseDouble(sdd);
//                          jTable1.setValueAt(Double.toString(amount), selectedrow, 7);
//                      }
//                      String discount = (String) jTable1.getValueAt(selectedrow, 8);
//                      
//                      if (rate != null)
//                      {
//                          double taxable = 0;
//                          double dis = Double.parseDouble(discount);
//                          double x = (amount / 100) * dis;
//                          taxable = amount - x;
//                          
//                           
//                          DecimalFormat df = new DecimalFormat("0.00");
//                          String sdd = df.format(taxable);
//                          taxable = Double.parseDouble(sdd);
//                          jTable1.setValueAt(Double.toString(taxable), selectedrow, 9);
//                            // total evaluation ===========================
//                          taxEvalaution(selectedrow, taxable);
//                          evaluateTotal();
//                          addIntoGSTPercentageTable();
//
//                      }
//                       int ind = getTrasportationIndex();
//                      if (ind != -1)
//                      {
//                         // 
//                         
//                         // System.out.println("STVA "+stva);
//                          int big = getHighestGSTRateForTransportation();
//                          if (big != -1) 
//                          {
//                             
//                              String st = Integer.toString(big) + "%";
//                              jTable1.setValueAt(st, ind, 3);
//                            //  System.out.println("Index is "+ind+ "  --  "+st);
//                          }
//                          String stva = (String) jTable1.getValueAt(ind, 9);
//                          double dtaxamt=Double.parseDouble(stva);
//
//                          taxEvalaution(ind, dtaxamt);
//                          evaluateTotal();
//                          addIntoGSTPercentageTable();
//                      }
//                    
//                  }
//                   }
//                     
//         
//          }
//          else
//          {
//             JOptionPane.showMessageDialog(null,"Please Select the Party First");
//          } // END HERE FOR SLECTED ROW IS NOT -1 , THAT MEANS A VALID ROW IS BEING SELECTED BY THE USER
//          
       
    }//GEN-LAST:event_jTable1KeyReleased

     public int getTrasportationIndex()
     {
         int pos=-1;
         for (int row = 0; row < jTable1.getRowCount(); row++)
         {
              if (jTable1.getValueAt(row, 0) != null) 
            { 
                String str=(String) jTable1.getValueAt(row, 0);
                if(str.equals("Transportation"))
                {
                    pos=row;
                }
            }
         }
         return pos;
     }

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
  if(evt.getKeyCode()==KeyEvent.VK_TAB)
        { 
            String ptd=jTextField3.getText();
            if(!ptd.isEmpty())
            {
                boolean flag=false;
                try
                {
                    int xx=Integer.parseInt(ptd);
                    flag=true;
                }
                catch(Exception ex)
                {
                    flag=false;
                }
                if(flag)
                {
                    try {
        Date dd = new SimpleDateFormat("dd/MM/yyyy").parse(jTextField6.getText().trim());
    
         
          
        //  if(ptd.length()!=0)
          {
               ptd= ptd.replaceAll("[^0-9]", "");
              int days = Integer.parseInt(ptd);

              Calendar cal = Calendar.getInstance();
              cal.setTime(dd);
              cal.add(Calendar.DAY_OF_MONTH, days); // Add 30 days
              Date futureDate = cal.getTime();

              DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
              String outD = df.format(futureDate);
              jTextField4.setText(outD);
              
          }
          
           } catch (ParseException ex) {
         Logger.getLogger(NewPurchaseFrame.class.getName()).log(Level.SEVERE, null, ex);
     }
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid Payment Term Days");
                }
                
            }
            else
            {
                jTextField3.setText("0");
                jTextField4.setText(jTextField6.getText());
            }
            
            
            
            jTextField3.setFocusTraversalKeysEnabled(true);
       }
     

    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:

        
//          Date d=jDateChooser1.getDate();
 String sDate1=jTextField4.getText();
 if(!sDate1.isEmpty())
 {
    
     try {
        Date dd = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
    
          String paytermmdays=jTextField3.getText();
          
          if(paytermmdays.length()!=0)
          {
               paytermmdays= paytermmdays.replaceAll("[^0-9]", "");
              int days = Integer.parseInt(paytermmdays);

              Calendar cal = Calendar.getInstance();
              cal.setTime(dd);
              cal.add(Calendar.DAY_OF_MONTH, days); // Add 30 days
              Date futureDate = cal.getTime();

              DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
              String outD = df.format(futureDate);
              jTextField4.setText(outD);
              
          }
          
           } catch (ParseException ex) {
         Logger.getLogger(NewPurchaseFrame.class.getName()).log(Level.SEVERE, null, ex);
     }
          
     
     
 }



         

    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
        
                  
    }//GEN-LAST:event_jTable1KeyTyped

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1ComponentAdded

    private void jButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton9KeyPressed
        // TODO add your handling code here:

         
    }//GEN-LAST:event_jButton9KeyPressed

    
    
    public void openItemSelectionFrame()
    {
        if(mouseclickedstatus!=1)
        {
           String itemname= (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
           int selcol=jTable1.getSelectedColumn();
           int row=jTable1.getSelectedRow();
        
         if (selcol == 0) 
                   {
            if (itemselectionframevalue == 0) 
            {
                      ItemNameSearchFilter.existedItem=itemname;
                    itemselectionframevalue = 1;
                    ItemNameSearchFilter.row = row;
                    ItemNameSearchFilter.col = selcol;
                    ItemNameSearchFilter l = new ItemNameSearchFilter();
                    l.setVisible(true);
                    l.setSize(375, 475);
                    l.setLocation(125, 255);

             
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Item Selection Frame is Already Opened !!! \n Please Close the last Instance");
            }

        }
        }
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        mouseclickedstatus=1;
           String itemname= (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
           int selcol=jTable1.getSelectedColumn();
           int row=jTable1.getSelectedRow();
        // System.out.println("itemname "+itemname +" "+row+" "+selcol);
            if(!jLabel2.getText().isEmpty())
            {
                   if (selcol == 0) 
                   {
            if (itemselectionframevalue == 0) 
            {
                      ItemNameSearchFilter.existedItem=itemname;
                    itemselectionframevalue = 1;
                    ItemNameSearchFilter.row = row;
                    ItemNameSearchFilter.col = selcol;
                    ItemNameSearchFilter l = new ItemNameSearchFilter();
                    l.setVisible(true);
                    l.setSize(375, 475);
                    l.setLocation(125, 255);

             
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Item Selection Frame is Already Opened !!! \n Please Close the last Instance");
            }

        }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please Select the Party First");
            }

        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         
jTextField5.setText("");

jLabel2.setText("");
jLabel6.setText("");
jLabel5.setText("");
jComboBox3.setSelectedIndex(0);
jComboBox2.setSelectedIndex(0);
jComboBox4.setSelectedIndex(0);
jComboBox1.setSelectedIndex(0);
jLabel28.setText("");
jLabel29.setText("");
jLabel30.setText("");
jLabel31.setText("");
jLabel32.setText("");
jLabel14.setText("");

jLabel16.setText("");
jLabel17.setText("");
jTextArea1.setText("");
jLabel20.setText("");
jLabel33.setText("");
jLabel34.setText("");
jLabel35.setText("");
jTextField1.setText("");
jTextField6.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jButton1.setEnabled(true);
jButton2.setEnabled(true);
DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
model1.setRowCount(3);

for (int i = 0; i < jTable1.getRowCount(); i++)
{
    for (int j = 0; j < jTable1.getColumnCount(); j++)
    {
        jTable1.setValueAt("", i, j);
    }
}
DefaultTableModel model2 = (DefaultTableModel) jTable3.getModel();
model2.setRowCount(0);
         
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
       
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jComboBox3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox3KeyPressed
        // TODO add your handling code here:
        jComboBox3.showPopup();
          placeofsupply=(String) jComboBox3.getSelectedItem();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            jComboBox3.setSelectedItem(placeofsupply);
        }

    }//GEN-LAST:event_jComboBox3KeyPressed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
         placeofsupply=(String) jComboBox3.getSelectedItem();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:

         if(partyselectionframevalue==0)
        {
            partyselectionframevalue=1;
                PartyNameSearchFilter l = new PartyNameSearchFilter();
        l.setVisible(true);
        l.setSize(300, 500);
        l.setLocation(300, 90);
        
      
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Party Selection Frame is Already Opened !!! \n Please Close the last Instance");
        }
    
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        
        
        String invoicenum= jTextField1.getText();
        
          if(invoicenum.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Invoice Number Cannot be Empty");
        }
           else if(invoicenum.length()>16)
        {
            JOptionPane.showMessageDialog(null, "Invoice Number is not Valid Please Try Again");
        }
            
         else if(!invoicenum.matches("[-/a-zA-Z0-9]*"))
        {
            JOptionPane.showMessageDialog(null, "Invoice Number is not Valid Please Try Again");
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton6KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(!jLabel2.getText().isEmpty())
     {
       if(uniqueitems.isEmpty())
       {
                              //"Transportation"
           jTable1.setValueAt("Transportation", 0, 0);
           jTable1.setValueAt("Transportation", 0, 1);
           jTable1.setValueAt("9965", 0, 2);
           jTable1.setValueAt("18%", 0, 3);
           jTable1.setValueAt("Others", 0, 4);
           jTable1.setValueAt("1", 0, 5);
           jTable1.setValueAt("0.0", 0, 6);
           jTable1.setValueAt("0.0", 0, 7);
           jTable1.setValueAt("0.0", 0, 8);
           
           
            jTable1.setValueAt("0.0", 0, 9);
            jTable1.setValueAt("0.0", 0, 10);
           jTable1.setValueAt("0.0", 0, 11);
           jTable1.setValueAt("0.0", 0, 12);
             jTable1.setValueAt("0.0", 0, 13);
           uniqueitems.add("Transportation");
           jButton1.setEnabled(false);
           System.out.println("0th row");
           
      }
       else
       {
            int emprows=new EmptyRowIdentifier().getEmptyRows(jTable1);
         if(emprows==0)
        {
        jTable1.setRowHeight(30);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{null,null,null,null});
         int pos=uniqueitems.size();
        String highestgst= getHighestGSTRate();
         jTable1.setValueAt("Transportation", pos, 0);
           jTable1.setValueAt("Transportation", pos, 1);
           jTable1.setValueAt("9965", pos, 2);
           jTable1.setValueAt(highestgst, pos, 3);
           jTable1.setValueAt("Others", pos, 4);
           jTable1.setValueAt("1", pos, 5);
           
            jTable1.setValueAt("0.0", pos, 6);
           jTable1.setValueAt("0.0", pos, 7);
           jTable1.setValueAt("0.0", pos, 8);
           jTable1.setValueAt("0.0", pos, 9);
           jTable1.setValueAt("0.0", pos, 10);
           jTable1.setValueAt("0.0", pos, 11);
           jTable1.setValueAt("0.0", pos, 12);
           jTable1.setValueAt("0.0", pos, 13);
           uniqueitems.add("Transportation");
           jButton1.setEnabled(false);
            System.out.println("Added Extra Row");
          
        }
         else
         {
              String highestgst= getHighestGSTRate();
             int pos=uniqueitems.size();
         jTable1.setValueAt("Transportation", pos, 0);
           jTable1.setValueAt("Transportation", pos, 1);
           jTable1.setValueAt("9965", pos, 2);
             jTable1.setValueAt(highestgst, pos, 3);
           jTable1.setValueAt("Others", pos, 4);
           jTable1.setValueAt("1", pos, 5);
         jTable1.setValueAt("0.0", pos, 6);
           jTable1.setValueAt("0.0", pos, 7);
           jTable1.setValueAt("0.0", pos, 8);
              jTable1.setValueAt("0.0", pos, 9);
           jTable1.setValueAt("0.0", pos, 10);
           jTable1.setValueAt("0.0", pos, 11);
           jTable1.setValueAt("0.0", pos, 12);
           jTable1.setValueAt("0.0", pos, 13);
           uniqueitems.add("Transportation");
           jButton1.setEnabled(false); 
           System.out.println("Added Transportation Row");
             
         }
        
         
            
       }
     }
     else
     {
          JOptionPane.showMessageDialog(null,"Please Select the Party First");
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
                if(!jLabel2.getText().isEmpty())
     {
       if(uniqueitems.isEmpty())
       {
                              //"Transportation"
           jTable1.setValueAt("Packaging", 0, 0);
           jTable1.setValueAt("Packaging", 0, 1);
           jTable1.setValueAt("9985", 0, 2);
           jTable1.setValueAt("18%", 0, 3);
           jTable1.setValueAt("Others", 0, 4);
           jTable1.setValueAt("1", 0, 5);
           jTable1.setValueAt("0.0", 0, 6);
           jTable1.setValueAt("0.0", 0, 7);
           jTable1.setValueAt("0.0", 0, 8);
           
           
            jTable1.setValueAt("0.0", 0, 9);
            jTable1.setValueAt("0.0", 0, 10);
           jTable1.setValueAt("0.0", 0, 11);
           jTable1.setValueAt("0.0", 0, 12);
           jTable1.setValueAt("0.0", 0, 13);
           uniqueitems.add("Packaging");
           jButton2.setEnabled(false);
           System.out.println("0th row");
           
      }
       else
       {
            int emprows=new EmptyRowIdentifier().getEmptyRows(jTable1);
         if(emprows==0)
        {
        jTable1.setRowHeight(30);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{null,null,null,null});
         int pos=uniqueitems.size();
        
         jTable1.setValueAt("Packaging", pos, 0);
           jTable1.setValueAt("Packaging", pos, 1);
           jTable1.setValueAt("9985", pos, 2);
           jTable1.setValueAt("18%", pos, 3);
           jTable1.setValueAt("Others", pos, 4);
           jTable1.setValueAt("1", pos, 5);
           
            jTable1.setValueAt("0.0", pos, 6);
           jTable1.setValueAt("0.0", pos, 7);
           jTable1.setValueAt("0.0", pos, 8);
           jTable1.setValueAt("0.0", pos, 9);
           jTable1.setValueAt("0.0", pos, 10);
           jTable1.setValueAt("0.0", pos, 11);
           jTable1.setValueAt("0.0", pos, 12);
           jTable1.setValueAt("0.0", pos, 13);
           uniqueitems.add("Packaging");
           jButton2.setEnabled(false);
            System.out.println("Added Extra Row");
          
        }
         else
         {
             
             int pos=uniqueitems.size();
         jTable1.setValueAt("Packaging", pos, 0);
           jTable1.setValueAt("Packaging", pos, 1);
           jTable1.setValueAt("9985", pos, 2);
             jTable1.setValueAt("18%", pos, 3);
           jTable1.setValueAt("Others", pos, 4);
           jTable1.setValueAt("1", pos, 5);
         jTable1.setValueAt("0.0", pos, 6);
           jTable1.setValueAt("0.0", pos, 7);
           jTable1.setValueAt("0.0", pos, 8);
              jTable1.setValueAt("0.0", pos, 9);
           jTable1.setValueAt("0.0", pos, 10);
           jTable1.setValueAt("0.0", pos, 11);
           jTable1.setValueAt("0.0", pos, 12);
           jTable1.setValueAt("0.0", pos, 13);
           uniqueitems.add("Packaging");
           jButton2.setEnabled(false); 
           System.out.println("Added Packaging Row");
             
         }
        
         
            
       }
     }
     else
     {
          JOptionPane.showMessageDialog(null,"Please Select the Party First");
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton13KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
          
jTextField5.setText("");

jLabel2.setText("");
jLabel6.setText("");
jLabel5.setText("");
jComboBox3.setSelectedIndex(0);
jComboBox2.setSelectedIndex(0);
jComboBox4.setSelectedIndex(0);
jComboBox1.setSelectedIndex(0);
jLabel28.setText("");
jLabel29.setText("");
jLabel30.setText("");
jLabel31.setText("");
jLabel32.setText("");
jLabel14.setText("");

jLabel16.setText("");
jLabel17.setText("");
jTextArea1.setText("");
jLabel20.setText("");
jLabel33.setText("");
jLabel34.setText("");
jLabel35.setText("");
jTextField1.setText("");
jTextField6.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jButton1.setEnabled(true);
jButton2.setEnabled(true);
DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
model1.setRowCount(3);

for (int i = 0; i < jTable1.getRowCount(); i++)
{
    for (int j = 0; j < jTable1.getColumnCount(); j++)
    {
        jTable1.setValueAt("", i, j);
    }
}
DefaultTableModel model2 = (DefaultTableModel) jTable3.getModel();
model2.setRowCount(0);
        }
    }//GEN-LAST:event_jButton13KeyPressed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_TAB)
        {
            if (evt.getModifiers() > 0) {
                        jTextArea1.transferFocusBackward();
                    } else {
                        jTextArea1.transferFocus();
                    }
                    evt.consume();
        }

    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        // TODO add your handling code here:
        
        String narration=jTextArea1.getText();
        if(narration.length()>250)
        {
            JOptionPane.showMessageDialog(null, "Maximum character limit is of 250");
        }
        
        System.out.println("Size: "+narration.length());
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
        // TODO add your handling code here:
          
        jComboBox2.showPopup();
         String text=(String) jComboBox2.getSelectedItem();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            jComboBox2.setSelectedItem(text);
        }
    }//GEN-LAST:event_jComboBox2KeyPressed

    private void jComboBox4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox4KeyPressed
        // TODO add your handling code here:
          
        jComboBox4.showPopup();
         String text=(String) jComboBox4.getSelectedItem();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            jComboBox4.setSelectedItem(text);
        }
    }//GEN-LAST:event_jComboBox4KeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        // TODO add your handling code here:
          
        jComboBox1.showPopup();
         String text=(String) jComboBox1.getSelectedItem();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            jComboBox1.setSelectedItem(text);
        }
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
       
    }//GEN-LAST:event_jButton2KeyPressed

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51,161,222);
       jTextField5.setBorder(new LineBorder(clr,2));

    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        // TODO add your handling code here:
        
       jTextField5.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        
        Color clr = new Color(51,161,222);
       jTextField1.setBorder(new LineBorder(clr,2));
         jTextField1.setFocusTraversalKeysEnabled(false);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        jTextField1.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
         Color clr = new Color(51,161,222);
       jTextField2.setBorder(new LineBorder(clr,2));
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        
      jTextField2.setBorder(new EtchedBorder());
        
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51,161,222);
       jTextField3.setBorder(new LineBorder(clr,2));
         jTextField3.setFocusTraversalKeysEnabled(false);
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
         jTextField3.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        
          Color clr = new Color(51,161,222);
       jTextField4.setBorder(new LineBorder(clr,2));
        jTextField4.setFocusTraversalKeysEnabled(false);
        
      
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        jTextField4.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51,161,222);
        jTextArea1.setBorder(new LineBorder(clr,1));
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        // TODO add your handling code here:
       jTextArea1.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextArea1FocusLost

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        
        String str=jTextField1.getText();
        str=str.toUpperCase();
         jTextField1.setText(str);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        
          String str=jTextField6.getText();
        if(str.contains(".") || str.contains("-"))
        {
            str=str.replace(".", "/");
            str=str.replace("-", "/");
            
        }
        
        jTextField6.setText(str);
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        
         String str=jTextField4.getText();
        if(str.contains(".") || str.contains("-"))
        {
            str=str.replace(".", "/");
            str=str.replace("-", "/");
            
        }
        
        jTextField4.setText(str);
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
        
        
           if(evt.getKeyCode()==KeyEvent.VK_TAB)
        { 
            
            System.out.println("Date Validataion");
            String str=jTextField6.getText();
            if(!str.isEmpty())
            {
            String st[]=str.split("/");
            
        if(st.length==3)
        {
            String st1=st[0];
            String st2=st[1];
            String st3=st[2];
            if(st3.length()==2)
            {
                st3="20"+st3;
                String stt=st1+"/"+st2+"/"+st3;
                 jTextField6.setText(stt);
            }
                
            String result1=isValidDate(st1);
            String result2=isValidMonth(st2);
            String result3=isValidYear(st3);
             if(!result1.isEmpty())
             JOptionPane.showMessageDialog(null,result1);
             
           
             if(!result2.isEmpty())
             JOptionPane.showMessageDialog(null,result2);
                if(!result3.isEmpty())
             JOptionPane.showMessageDialog(null,result3);
        }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Date can not be Empty");
            }
            jTextField6.setFocusTraversalKeysEnabled(true);
       }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
        
             if(evt.getKeyCode()==KeyEvent.VK_TAB)
        { 
            String str=jTextField4.getText();
            if(!str.isEmpty())
            {
            String st[]=str.split("/");
        if(st.length==3)
        {
            String st1=st[0];
            String st2=st[1];
            String st3=st[2];
             if(st3.length()==2)
            {
                st3="20"+st3;
                String stt=st1+"/"+st2+"/"+st3;
                 jTextField4.setText(stt);
            }
            String result1=isValidDate(st1);
            String result2=isValidMonth(st2);
            String result3=isValidYear(st3);
             if(!result1.isEmpty())
             JOptionPane.showMessageDialog(null,result1);
             
           
             if(!result2.isEmpty())
             JOptionPane.showMessageDialog(null,result2);
                if(!result3.isEmpty())
             JOptionPane.showMessageDialog(null,result3);
//                
//                String strr=jTextField3.getText();
//               int x=Integer.parseInt(strr);
//              
                    String st6=jTextField6.getText();
                     String st4=jTextField4.getText();
                     if(!st6.equals(st4))
                     {
                         
                         int diff=getDateDiffrence(st6,st4);
                         System.out.println("Diff is "+diff);
                         jTextField3.setText(Integer.toString(diff));
                     }
                     
                   
               
                
        }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Date can not be Empty");
            }
            
            
            jTextField4.setFocusTraversalKeysEnabled(true);
       }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
        
        jTextField6.setFocusTraversalKeysEnabled(false);
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        
        
        
           if(evt.getKeyCode()==KeyEvent.VK_TAB)
        { 
            
            String str=jTextField1.getText();
             String res=new ValidateInvoice().isValidInvoiceNO(str);
             if(!res.isEmpty())
             {
                 JOptionPane.showMessageDialog(null,res);
             }
             
             
            jTextField1.setFocusTraversalKeysEnabled(true);
       }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        AddClientFrame af=new AddClientFrame();
        af.setVisible(true);
        af.setSize(d);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        SearchRegisterPartyFrame sf=new SearchRegisterPartyFrame();
        sf.setVisible(true);
        sf.setSize(d);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        AddItemFrame lf=new AddItemFrame();
        lf.setVisible(true);
        lf.setSize(d);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        SearchItemFrame lf=new SearchItemFrame();
        lf.setVisible(true);
        lf.setSize(d);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        SearchStockFrame lf=new SearchStockFrame();
        lf.setVisible(true);
        lf.setSize(d);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        NewPurchaseFrame nf=new NewPurchaseFrame();
        nf.setVisible(true);
        nf.setSize(d);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        SearchPurchaseFrame lf=new SearchPurchaseFrame();
        lf.setVisible(true);
        lf.setSize(d);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        PurchasePaymentFrame lf = new PurchasePaymentFrame();
        lf.setVisible(true);
        lf.setSize(d);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        AdvancePaymentFrame lf=new AdvancePaymentFrame();
        lf.setVisible(true);
        lf.setSize(d);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        NewSaleFrame lf=new NewSaleFrame();
        lf.setVisible(true);
        lf.setSize(d);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        SearchSaleFrame lf=new SearchSaleFrame();
        lf.setVisible(true);
        lf.setSize(d);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

        new ManageProfileDBOperation().insertStaffLoginDetails(LoginFrame.uname, LoginFrame.logindatetime, logoutdatetime);
        this.dispose();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        LoginFrame af = new LoginFrame();
        af.setVisible(true);
        af.setSize(d);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    public String isValidDate(String str)
     {
         String result="";
         try
         {
             int x=Integer.parseInt(str);
             if(x>31)
             {
                 result="Invalid Date \n Please Re enter ";
             }
         }
         catch(Exception ex)
         {
             result="Date is not a Number";
             System.out.println("Exception ex "+ex);
         }
            return result;
     }
     
      public String isValidMonth(String str)
     {
         String result="";
         try
         {
             int x=Integer.parseInt(str);
             if(x>12)
             {
                 result="Invalid Month \n Please Re enter ";
             }
         }
         catch(Exception ex)
         {
             result="Month is not a Number";
             System.out.println("Exception ex "+ex);
         }
         
         return result;
     }
      
       public String isValidYear(String str)
     {
         String result="";
         try
         {
             int x=Integer.parseInt(str);
//             if(x>12)
//             {
//                 result="Invalid Month \n Please Re enter ";
//             }
         }
         catch(Exception ex)
         {
             result="Year is not a Number";
             System.out.println("Exception ex "+ex);
         }
         
         return result;
     }
    
    public void evaluateTotal()
    {
        
                        
       
                           double amount1=0;
                           double cgsttotal = 0.0;
                           double sgsttotal = 0.0;
                           double igsttotal = 0.0;
                           double fintotal = 0.0;
                           
                               int emprows = new EmptyRowIdentifier().getEmptyRows(jTable1);
                                int totalrows1 = jTable1.getRowCount();
                                int filledrowsfinal = totalrows1 - emprows;
                       //    for (int i = 0; i < uniqueitems.size(); i++)
                             for(int i=0;i<filledrowsfinal;i++)   
                           {
                          
                               String amtstr = (String) jTable1.getValueAt(i, 7);
                               String cgsstr = (String) jTable1.getValueAt(i, 10);
                               String sgsstr = (String) jTable1.getValueAt(i, 11);
                               String igsstr = (String) jTable1.getValueAt(i, 12);
                               String finstr = (String) jTable1.getValueAt(i, 13);
                                                          
                               
                               amount1 = amount1 + Double.parseDouble(amtstr);
                               cgsttotal = cgsttotal + Double.parseDouble(cgsstr);
                               sgsttotal = sgsttotal + Double.parseDouble(sgsstr);
                               igsttotal = igsttotal + Double.parseDouble(igsstr);
                               fintotal = fintotal + Double.parseDouble(finstr);
                           }
                             
                             
                             DecimalFormat df=new DecimalFormat("0.00");
                             String s1=df.format(amount1);
                             String s2=df.format(cgsttotal);
                             String s3=df.format(sgsttotal);
                             String s4=df.format(igsttotal);
                             String s5=df.format(fintotal);
                             
                             amount1=Double.parseDouble(s1);
                             cgsttotal=Double.parseDouble(s2);
                             sgsttotal=Double.parseDouble(s3);
                             igsttotal=Double.parseDouble(s4);
                             fintotal=Double.parseDouble(s5);
                             
                             
                             
       
                           jLabel32.setText(Double.toString(amount1));
                           jLabel29.setText(Double.toString(cgsttotal));
                           jLabel30.setText(Double.toString(sgsttotal));
                           jLabel31.setText(Double.toString(igsttotal));
                           jLabel28.setText(Double.toString(fintotal));
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
    
    public void addIntoGSTPercentageTable()
    {
       
        ArrayList gstrate=new ArrayList();
       ArrayList mrow=new ArrayList();
       
      //  System.out.println("Unique Items are : "+uniqueitems );
        
                               int emprows = new EmptyRowIdentifier().getEmptyRows(jTable1);
                                int totalrows1 = jTable1.getRowCount();
                                int filledrowsfinal = totalrows1 - emprows;
        
       //  for (int i = 0; i < uniqueitems.size(); i++)
                  for(int i=0;i<filledrowsfinal;i++)   
                {    
                    
                      String r_rate= (String) jTable1.getValueAt(i, 3);
                      String r_cgst= (String) jTable1.getValueAt(i, 10);
                      String r_sgst= (String) jTable1.getValueAt(i, 11);
                      String r_igst= (String) jTable1.getValueAt(i, 12);
                      gstrate.add(r_rate);
                    ArrayList temp = new ArrayList();
                    temp.add(r_rate);
                    temp.add(r_cgst);
                    temp.add(r_sgst);
                    temp.add(r_igst);
                   // System.out.println("temp "+temp);
                    mrow.add(temp);
                }
             
         
                         Set hh1 = new HashSet();
                         hh1.addAll(gstrate);
                         gstrate.clear();
                         gstrate.addAll(hh1);
                         
                        //  System.out.println("Unique GST Rate  : "+gstrate );
                          
                       //   System.out.println("=============================");
                         ArrayList gsttabledata=new ArrayList();
                         for (int i = 0; i < gstrate.size(); i++)
                         {
                             String unigst=(String)gstrate.get(i);
                             ArrayList tow=new ArrayList();
                              
                                double cgsttotal=0.0;
                                double sgsttotal=0.0;
                                double igsttotal=0.0;
                               
                                double fintotal=0.0;
                            
                             for (int j = 0; j < mrow.size(); j++)
                             {
                                 ArrayList trow=(ArrayList)mrow.get(j);
                            String mtrate=(String)trow.get(0);
                               if(mtrate.equals(unigst))
                               {
                              String str1=(String)trow.get(1);
                              String str2=(String)trow.get(2);
                              String str3=(String)trow.get(3);
                              
                               cgsttotal = cgsttotal + Double.parseDouble(str1);
                               sgsttotal = sgsttotal + Double.parseDouble(str2);
                               igsttotal = igsttotal + Double.parseDouble(str3);
                               
                                //  System.out.println(cgsttotal+ " "+sgsttotal+" "+igsttotal);
                               double t = cgsttotal+sgsttotal+igsttotal;
                                fintotal=t;   
                                  // System.out.println("fintotal "+fintotal);
                               }
                           
                             }
                             tow.add(unigst);
                             tow.add(Double.toString(cgsttotal));
                             tow.add(Double.toString(sgsttotal));
                             tow.add(Double.toString(igsttotal));
                             tow.add(Double.toString(fintotal));
                             //System.out.println(tow);
                             gsttabledata.add(tow);
                            
                         }
                         
                       //  System.out.println("-------------------------------------------------------------");
             
                
                String colmat[][]=new String[gsttabledata.size()][5];
                double cgsttotal=0,sgsttotal=0,igsttotal=0,total=0;
                for (int i = 0; i < gsttabledata.size(); i++)
                {
                  ArrayList rlist=(ArrayList)gsttabledata.get(i);
                    colmat[i][0]=(String)rlist.get(0);
                    colmat[i][1]=(String)rlist.get(1);
                    colmat[i][2]=(String)rlist.get(2);
                    colmat[i][3]=(String)rlist.get(3);
                    colmat[i][4]=(String)rlist.get(4);
                    cgsttotal=cgsttotal+Double.parseDouble((String)rlist.get(1));
                    sgsttotal=sgsttotal+Double.parseDouble((String)rlist.get(2));
                    igsttotal=igsttotal+Double.parseDouble((String)rlist.get(3));
                    total=total+Double.parseDouble((String)rlist.get(4));
                 
                }
//          
//                   DefaultTableModel dm = (DefaultTableModel)jTable3.getModel();
//                   dm.setRowCount(0);
//                   
//                   int row=jTable3.getRowCount();
//                   System.out.println("Row Count: "+row);
        
                  
             
                
                  String colname[]={"GST Rate", "CGST", "SGST", "IGST"," TOTAL"};
       
        jTable3.setModel(new javax.swing.table.DefaultTableModel(colmat,colname));
         DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
        rendar.setHorizontalAlignment(RIGHT);
        
        jTable3.getColumnModel().getColumn(0).setCellRenderer(rendar);
        jTable3.getColumnModel().getColumn(1).setCellRenderer(rendar);
        jTable3.getColumnModel().getColumn(2).setCellRenderer(rendar);
        jTable3.getColumnModel().getColumn(3).setCellRenderer(rendar);
        jTable3.getColumnModel().getColumn(4).setCellRenderer(rendar);
        
        
         DecimalFormat df=new DecimalFormat("0.00");
        String s1=df.format(cgsttotal);
        String s2=df.format(sgsttotal);
        String s3=df.format(igsttotal);
        String s4=df.format(total);
        
        cgsttotal = Double.parseDouble(s1);
        sgsttotal = Double.parseDouble(s2);
        igsttotal = Double.parseDouble(s3);
        total = Double.parseDouble(s4);

        
        jLabel33.setText(Double.toString(cgsttotal));
        jLabel34.setText(Double.toString(sgsttotal));
        jLabel35.setText(Double.toString(igsttotal));
        jLabel20.setText(Double.toString(total));
        
             
         
                      
             
    }
    
   
    
    public String getHighestGSTRate()
    {
          int big=0;
            for (int i = 0; i < uniqueitems.size(); i++) 
            {
                 String val=(String) jTable1.getValueAt(i, 3);
                 if(val!=null)
                 {
                 val=val.replace("%", "");
                 val=val.trim();
                 int x1=Integer.parseInt(val);
                 if(x1>big)
                     big=x1;
                  
                 }
             
            }
             String highestgstrate=Integer.toString(big)+"%";
             
             return highestgstrate;
    }

    
    public String validGST(String gst)
    {
        String result="";
        if(gst.length()==0)
        {
            result="Please Enter the GST Number";
        }
       
        else
        {
           try {
			if (new GSTValidator().validGSTIN(gst))
				result="VALID GST";
			else
				result="INVALID GST";
		} catch (Exception e) {
			e.printStackTrace();
		}
        }
        
        
        
        return result;
    }
    public int getHighestGSTRateForTransportation()
    {
          int big=-1;
           for (int row = 0; row < jTable1.getRowCount(); row++)
         {
              if (jTable1.getValueAt(row, 0) != null) 
            { 
                String str=(String) jTable1.getValueAt(row, 0);
               // System.out.println("Str is "+str);
                if(!str.equals("Transportation"))
                {
                   String val=(String) jTable1.getValueAt(row, 3);
                 if(val!=null)
                 {
                 val=val.replace("%", "");
                 val=val.trim();
                 int x1=Integer.parseInt(val);
                 if(x1>big)
                     big=x1;
                  
                 }
                }
            }
         }
           
          // System.out.println("Biggest Value is "+big);
             return big;
    }
    
     public int getDateDiffrence(String da1,String da2)
    {
          double daysBetween=0.0;
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
	       Date dateBefore = myFormat.parse(da1);
	       Date dateAfter = myFormat.parse(da2);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	        daysBetween = (difference / (1000*60*60*24));
               /* You can also convert the milliseconds to days using this method
                * float daysBetween = 
                *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
                */
	       //System.out.println("Number of Days between dates: "+daysBetween);
	 } catch (Exception e) {
	       e.printStackTrace();
	 }
        
        int a=(int)daysBetween;
        a=Math.abs(a);
        
    //    System.out.println("Diffrence between "+daysBetween);
        return a;
        
    }
    public void taxEvalaution(int selectedrow ,double taxable)
    {
                          if(partygstcode!=0)
                           {
                               String pss = (String) jComboBox3.getSelectedItem();
                               String substr2 = pss.substring(0, 2);
                               substr2 = substr2.trim();
                               int pos = Integer.parseInt(substr2);
                               if (partygstcode == pos) 
                               {
                                   //  String gstpr=(String)iteminfo.get(2);

                                   String gstpr = (String) jTable1.getValueAt(selectedrow, 3);

                                   gstpr = gstpr.replace("%", "");
                                   double full = (double) Integer.parseInt(gstpr);
                                   double half = (double) Integer.parseInt(gstpr) / 2;
                                   String taxable12 = (String) jTable1.getValueAt(selectedrow, 9);
                                   double x1 = Double.parseDouble(taxable12);
                                   double halfamt = (x1 / 100) * half;
                                   
                                   DecimalFormat df = new DecimalFormat("0.00");
                                   String sdd = df.format(halfamt);
                                   halfamt = Double.parseDouble(sdd);

                                   jTable1.setValueAt(Double.toString(halfamt), selectedrow, 10);
                                   jTable1.setValueAt(Double.toString(halfamt), selectedrow, 11);
                                   jTable1.setValueAt(Double.toString(0), selectedrow, 12);

                                   double t1 = (taxable / 100) * full;
                                   double finamt = taxable + t1;
                                   
                                    DecimalFormat df1 = new DecimalFormat("0.00");
                                   String sdd1 = df1.format(finamt);
                                   finamt = Double.parseDouble(sdd1);
                                   
                                   jTable1.setValueAt(Double.toString(finamt), selectedrow, 13);
                                 }
                                else
                                 {
                                     // String gstpr=(String)iteminfo.get(2);
                                     String gstpr = (String) jTable1.getValueAt(selectedrow, 3);
                                     gstpr = gstpr.replace("%", "");
                                     double full = (double) Integer.parseInt(gstpr);
                                     String taxable12 = (String) jTable1.getValueAt(selectedrow, 9);
                                     double x1 = Double.parseDouble(taxable12);
                                     double fullamt = (x1 / 100) * full;
                                     
                                   DecimalFormat df = new DecimalFormat("0.00");
                                   String sdd = df.format(fullamt);
                                   fullamt = Double.parseDouble(sdd);
                                   
                                     jTable1.setValueAt(Double.toString(0), selectedrow, 10);
                                     jTable1.setValueAt(Double.toString(0), selectedrow, 11);
                                     jTable1.setValueAt(Double.toString(fullamt), selectedrow, 12);

                                     double t1 = (taxable / 100) * full;
                                     double finamt = taxable + t1;
                                     
                                   DecimalFormat df1 = new DecimalFormat("0.00");
                                   String sdd1 = df1.format(finamt);
                                   finamt = Double.parseDouble(sdd1);

                                     jTable1.setValueAt(Double.toString(finamt), selectedrow, 13);
                                 }
                               
                           }
                          
                           
                           else
                           {
                                   jTable1.setValueAt(Double.toString(0), selectedrow, 10);
                                    jTable1.setValueAt(Double.toString(0), selectedrow, 11);
                                    jTable1.setValueAt(Double.toString(0), selectedrow, 12);
                                    jTable1.setValueAt(Double.toString(taxable), selectedrow, 13);
                           }
    }
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
            java.util.logging.Logger.getLogger(NewPurchaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPurchaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPurchaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPurchaseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPurchaseFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    public static javax.swing.JComboBox<String> jComboBox3;
    public static javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    public static javax.swing.JLabel jLabel33;
    public static javax.swing.JLabel jLabel34;
    public static javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
