/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagerGUI;

import CeoGUI.PurchaseChartApplet;
import CeoGUI.PurchaseGraphChart;
import CeoGUI.SaleChartApplet;
import CeoGUI.SaleGraphChart;
import TableOperation.HomeCompanyDB;
import TableOperation.InsertDataToTable;
import dboperation.HomeCompanyDBOperation;
import dboperation.PurchaseDBOperation;
import dboperation.SaleDBOperation;
import java.util.HashSet;

import TableOperation.InsertDataToTable;
import dboperation.HomeCompanyDBOperation;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import validation.GSTStateCode;
import validation.GSTValidator;
import validation.IFSCValidator;
import validation.PANValidator;
import validation.Validator;

/**
 *
 * @author welcome
 */
public class EditHomeCompanyProfileFrame extends javax.swing.JFrame {

    ArrayList bankdetail = new ArrayList();
    ArrayList accnum = new ArrayList();
    public String gst = null;
    public String email = "No Emailid";
    String centers = "";
    String costcenters = "No Cost Center";

    String dbankacc = "";
    public  String logoname="logoimage", signaturename="signatureimage";
    //public  String path1=null;
   // public  String path2=null;
    
    public byte arr1[];
    public byte arr2[];
    FileInputStream fis1=null;
    FileInputStream fis2=null;
    
     
    
    public EditHomeCompanyProfileFrame() 
    {

        super("EDIT HOME COMPANY PROFILE Login By" + " " + LoginFrame.uname);
        initComponents();

        ((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment((int) TOP_ALIGNMENT);

      //  ArrayList hcname = new HomeCompanyDBOperation().getAllHomeCompanyName();
//         System.out.println(staffname);
     //   jComboBox5.setModel(new DefaultComboBoxModel<String>((String[]) hcname.toArray(new String[0])));

        jTextField16.setEditable(false);
         
        //  String hcname = (String) jComboBox5.getSelectedItem();
jTextField18.setEditable(false);
            jTextField18.setBackground(Color.lightGray);
        ArrayList banks = new ArrayList();

//        if (hcname.isEmpty()) 
//        {
//            JOptionPane.showMessageDialog(null, "Please Select Name");
//        }
//        else 
        
            HomeCompanyDBOperation ho = new HomeCompanyDBOperation();
            ArrayList hcinfo = ho.getHomeCompanyInfo();
          
               
               
               
            //   System.out.println("Company Details: "+hcinfo);
            String bankdetails = (String) hcinfo.get(13);
            String[] bankinfo = bankdetails.split(",");

            for (int i = 1; i < bankinfo.length; i++) 
            {
                ArrayList temp = new ArrayList();
                String str = bankinfo[i];
                //     System.out.println(str);
                String[] str1 = str.split("#");

                for (int j = 0; j < str1.length; j++) 
                {

                    temp.add(str1[j].toString());

                }
                  //   System.out.println(temp);

                banks.add(temp);
                bankdetail.add(temp);
            }
             //   System.out.println(bankdetail);

            for (int i = 0; i < bankdetail.size(); i++) {
                ArrayList row = (ArrayList) bankdetail.get(i);
                accnum.add(row.get(1));
            }

            int rowheight = 30;

            String fdetails = (String) hcinfo.get(6);
            //   System.out.println("Formation Details: "+fdetails);
             
            centers= hcinfo.get(14).toString();
                    
            int colsize = jTable1.getColumnCount();
            jTextField18.setText(hcinfo.get(15).toString());
            jTextArea1.setText(hcinfo.get(0).toString());
            jTextField4.setText(hcinfo.get(1).toString());
            jTextField5.setText(hcinfo.get(2).toString());
            jComboBox1.setSelectedItem(hcinfo.get(3).toString());
            jTextField6.setText(hcinfo.get(4).toString());
            jTextField7.setText(hcinfo.get(5).toString());
            jComboBox2.setSelectedItem(fdetails);
            
              
            
          
            jTextField8.setText(hcinfo.get(7).toString());
            jComboBox6.setSelectedItem(hcinfo.get(8).toString());
            jTextField9.setText(hcinfo.get(9).toString());
            jTextField10.setText(hcinfo.get(10).toString());
            jTextField11.setText(hcinfo.get(11).toString());
              jComboBox3.setSelectedItem(hcinfo.get(12).toString());
            jTextField16.setText(bankinfo[0].toString());
            InsertDataToTable it = new InsertDataToTable();
            it.getDataInserted(jTable1, colsize, banks, rowheight);
             //  bankdetail=new ArrayList();
            
            byte[] barr1 = (byte[]) hcinfo.get(17);
            
            ImageIcon icon1 = new ImageIcon(new ImageIcon(barr1).getImage().getScaledInstance(193, 80, Image.SCALE_DEFAULT));
            jLabel5.setIcon(icon1);
           
               byte[] barr2 = (byte[]) hcinfo.get(19);
            ImageIcon icon2 = new ImageIcon(new ImageIcon(barr2).getImage().getScaledInstance(193, 80, Image.SCALE_DEFAULT));
            jLabel26.setIcon(icon2);
            
            
            System.out.println("Barr1 Length is "+barr1.length);
            System.out.println("Barr2 Length is "+barr2.length);
            if(barr1.length>9)
                
            {
             arr1=barr1;
            }
            else
            {
                String str = "logoimage";
                arr1 = str.getBytes();
            }
           
            
             if(barr2.length>14)
                
            {
                arr2=barr2;
            }
            else
             {
                  String str = "signatureimage";
                  arr2 = str.getBytes();
             }
                   
             String stat=hcinfo.get(8).toString();
//             if(stat.equals("Unregistered"))
//             {
//                 jComboBox3.setEnabled(false);
//             }
//             else
//             {
//                 jComboBox3.setEnabled(true);
//                
//             }
                 
          


    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField18 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField15 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Address:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("City:");

        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("State:");

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Andaman and Nicobar Islands", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chandigarh", "Chhattisgarh", "Dadra and Nagar Haveli", "Daman and Diu ", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Ladakh", "Lakshadweep", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya\t", "Mizoram", "Nagaland", "National Capital Territory of Delhi ", "Odisha", "Puducherry", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" }));
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("Contact No.");

        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("Email ID:");

        jTextField7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setText("Formation Details:");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setText("Nature of Business:");

        jTextField8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel24.setText("Pin:");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        });
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Firm", "Proprietorship", "Private", "Public", "Limited", " " }));
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2KeyPressed(evt);
            }
        });

        jTextField18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField18FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField18FocusLost(evt);
            }
        });
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(jTextField18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(141, 141, 141)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel24)
                        .addGap(19, 19, 19)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(131, 131, 131)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(85, 85, 85)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 33, 650, 390);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setText("Statutory Details:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 428, 136, 22);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel19.setText("Bank Name:");

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel20.setText("Account Number:");

        jTextField12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField12FocusLost(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setText("IFSC Code:");

        jTextField13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField13FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField13FocusLost(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setText("Account Name:");

        jTextField14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField14FocusLost(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel23.setText("Account Type:");

        jComboBox4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Saving", "Current" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jComboBox4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox4KeyPressed(evt);
            }
        });

        jTextField15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField15FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField15FocusLost(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bank Name", "Account Number", "IFSC Code", "Account Name", "Account Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jScrollPane2.setViewportView(jTable1);

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel25.setText("Default Bank Account No:");

        jTextField16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField16FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField16FocusLost(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jButton5.setText("Add Bank");
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

        jButton6.setBackground(new java.awt.Color(0, 51, 102));
        jButton6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/default.png"))); // NOI18N
        jButton6.setText("Set As Default");
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

        jLabel27.setText("[Click on the account number which you want to set as default]");

        jButton7.setBackground(new java.awt.Color(0, 51, 102));
        jButton7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete1.png"))); // NOI18N
        jButton7.setText("Delete Row");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(28, 28, 28)
                        .addComponent(jButton7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(64, 64, 64)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(25, 25, 25)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(75, 75, 75)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(49, 49, 49)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(12, 12, 12)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton7)))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton5)))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel25))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6)))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(690, 33, 650, 390);

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setText("Bank Details:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(690, 10, 97, 23);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("General Information:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 170, 17);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(375, 0));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Logo:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel5FocusGained(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Signature:");

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton10.setBackground(new java.awt.Color(0, 51, 102));
        jButton10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jButton10.setText("Add");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 51, 102));
        jButton11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jButton11.setText("Add");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 51, 102));
        jButton12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jButton12.setText("Remove");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 51, 102));
        jButton13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jButton13.setText("Remove");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13))
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(690, 456, 650, 141);

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
        jButton9.setBounds(10, 610, 90, 35);

        jButton15.setBackground(new java.awt.Color(0, 51, 102));
        jButton15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jButton15.setText("Clear");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jButton15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton15KeyPressed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(110, 610, 90, 35);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setText("Registration Number:");

        jTextField9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setText("PAN Number:");

        jTextField10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField10FocusLost(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setText("GSTIN:");

        jTextField11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField11FocusLost(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setText("State Code:");

        jComboBox3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State GST Code", "01 Jammu & Kashmir", "02 Himachal Pradesh", "03 Punjab", "04 Chandigarh", "05 Uttarakhand", "06 Haryana", "07 Delhi", "08 Rajasthan", "09 Uttar Pradesh", "10 Bihar", "11 Sikkim", "12 Arunachal Pradesh", "13 Nagaland", "14 Manipur", "15 Mizoram", "16 Tripura", "17 Meghalaya", "18 Assam", "19 West Bengal", "20 Jharkhand", "21 Orissa", "22 Chhattisgarh", "23 Madhya Pradesh", "24 Gujarat", "25 Daman & Diu", "26 Dadra & Nagar Haveli", "27 Maharashtra", "28 Andhra Pradesh", "29 Karnataka", "30 Goa", "31 Lakshadweep", "32 Kerala", "33 Tamil Nadu", "34 Puducherry", "35 Andaman & Nicobar Islands", "36 Telengana", "37 Andrapradesh(New)" }));
        jComboBox3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox3KeyPressed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel28.setText("Party Type:");

        jComboBox6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Unregistered", "Registered Business-Regular", "Registered Business-Composition" }));
        jComboBox6.setBorder(null);
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jComboBox6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel28)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(jTextField9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField11)
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 456, 650, 141);

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jMenuBar2.setPreferredSize(new java.awt.Dimension(479, 50));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editicon.png"))); // NOI18N
        jMenu1.setText("Edit Profile");
        jMenu1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editadmin.png"))); // NOI18N
        jMenuItem7.setText("Change Password");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar2.add(jMenu1);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/homecompany.png"))); // NOI18N
        jMenu8.setText("Home");
        jMenu8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu8KeyPressed(evt);
            }
        });

        jMenuItem2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jMenuItem2.setText("Add Home Company");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editcompany.png"))); // NOI18N
        jMenuItem3.setText("Edit Home Company");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem3);

        jMenuBar2.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/staff.png"))); // NOI18N
        jMenu9.setText("Staff");
        jMenu9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jMenuItem9.setText("New Staff");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem9);

        jMenuItem13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editcompany.png"))); // NOI18N
        jMenuItem13.setText("Edit / Search Staff");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem13);

        jMenuItem4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jMenuItem4.setText("Staff Report");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenuBar2.add(jMenu9);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manageitem.png"))); // NOI18N
        jMenu2.setText(" Report");
        jMenu2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sale.png"))); // NOI18N
        jMenuItem1.setText("View Sale Report");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N
        jMenuItem15.setText("View Purchase Report");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuBar2.add(jMenu2);

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

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed
public boolean isValidIFSC(String name)
    {
        boolean flag=true;
        
        for (int i = 0; i < name.length(); i++)
        {
            char ch=name.charAt(i);
            int x=(int)ch;
            
            if((x>=48 && x<=57) || (x>=65 && x<=90) || (x>=97 && x<=122))
            {
                flag=true;
            }
            else
            {
                flag=false;
                break;
            }
        }
        
        
        
        return flag;
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

       String bankname = jTextField12.getText();
        String accountnum = jTextField13.getText();
        String ifsccode = jTextField14.getText();
        String accname = jTextField15.getText();
        String acctype = (String) jComboBox4.getSelectedItem();
String result1=new IFSCValidator().isValidIFSC(ifsccode);
        if (bankname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bank Name Cannot be Empty");
        } else if (accountnum.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Account Number Cannot be Empty");
        } else if (Validator.isValidAccNumber(accountnum) == false) {
            JOptionPane.showMessageDialog(null, "Account Number is not valid");
        } 
         else if(!result1.isEmpty())
        {
             JOptionPane.showMessageDialog(null, result1);
        }
//        else if (ifsccode.isEmpty()) 
//        {
//            JOptionPane.showMessageDialog(null, "IFSC Code Cannot be Empty");
//        } 
//        else if (ifsccode.length() != 11) 
//        {
//            JOptionPane.showMessageDialog(null, "IFSC Code is not valid");
//        } else if (!isValidIFSC(ifsccode)) {
//            JOptionPane.showMessageDialog(null, "IFSC Code  should  be in Alpha numeric only");
//        } 
        else if (accname.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Account Name Cannot be Empty");
        } else if (acctype.equals("Select")) {
            JOptionPane.showMessageDialog(null, "Please Select Account Type");
        } else {

            ArrayList bankinfo = new ArrayList();

            bankinfo.add(bankname);
            bankinfo.add(accountnum);
            bankinfo.add(ifsccode);
            bankinfo.add(accname);
            bankinfo.add(acctype);

            System.out.println("accnum : "+accnum);
            System.out.println("bankdetails : "+bankdetail);
            
            System.out.println("==========================================\n");
            if (!accnum.contains(accountnum)) 
            {
                bankdetail.add(bankinfo);
                accnum.add(accountnum);

                //    System.out.println("Bank Details: "+bankdetails);  
                int rowheight = 30;
                int columncount = jTable1.getColumnCount();
                InsertDataToTable it = new InsertDataToTable();
                it.getDataInserted(jTable1, columncount, bankdetail, rowheight);
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
                jComboBox4.setSelectedItem("Select");

            } else {
                JOptionPane.showMessageDialog(null, "Account number Already Existed !");
            }

        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
       
        if(col!=-1&& row!=-1)
        {

        
       
        {
            String accname = (String) jTable1.getValueAt(row, 1);
            jTextField16.setText(accname);

        }

        String bname=(String) jTable1.getValueAt(row, 0);
        String accnum=(String) jTable1.getValueAt(row, 1);
        String ifsc=(String) jTable1.getValueAt(row, 2);
        String accname=(String) jTable1.getValueAt(row, 3);
        String acctype=(String) jTable1.getValueAt(row, 4);
        if(bname.length()!=0&&accnum.length()!=0&&ifsc.length()!=0&&accname.length()!=0&&acctype.length()!=0)
        {
            jTextField12.setText(bname);
        jTextField13.setText(accnum);
        jTextField14.setText(ifsc);
        jTextField15.setText(accname);
        jComboBox4.setSelectedItem(acctype);
            
        }
        }
        javax.swing.ToolTipManager.sharedInstance().setInitialDelay(1);
            
        String str=(String) jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn());
       // System.out.println("Tool Tip Text is "+str);
        jTable1.setToolTipText(str);
        
        
        

      //  System.out.println (accname);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:

        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
       
        if(col!=-1&& row!=-1)
        {

        if (col == 1) 
        {

            String accname = (String) jTable1.getValueAt(row, 1);
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                jTextField16.setText(accname);
            }
        }

        String bname=(String) jTable1.getValueAt(row, 0);
        String accnum=(String) jTable1.getValueAt(row, 1);
        String ifsc=(String) jTable1.getValueAt(row, 2);
        String accname=(String) jTable1.getValueAt(row, 3);
        String acctype=(String) jTable1.getValueAt(row, 4);
        if(bname.length()!=0&&accnum.length()!=0&&ifsc.length()!=0&&accname.length()!=0&&acctype.length()!=0)
        {
            jTextField12.setText(bname);
        jTextField13.setText(accnum);
        jTextField14.setText(ifsc);
        jTextField15.setText(accname);
        jComboBox4.setSelectedItem(acctype);
            
        }
        }
        

        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (evt.getModifiers() > 0) {
                jTable1.transferFocusBackward();
            } else {
                jTable1.transferFocus();
            }
            evt.consume();
        }

    //    System.out.println (accname);

    }//GEN-LAST:event_jTable1KeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        dbankacc = jTextField16.getText();
        if (dbankacc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Default Bank Account Cannot be Empty");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        bankdetail = new ArrayList();
                accnum = new ArrayList();
                jTextField18.setText("");
                jTextArea1.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jComboBox1.setSelectedItem("Select");
                jTextField6.setText("");
                jTextField7.setText("");
                jComboBox2.setSelectedItem("Select");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jComboBox3.setSelectedItem("Select State GST Code");
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
                jComboBox4.setSelectedItem("Select");
                jComboBox6.setSelectedItem("Select");
                jTextField16.setText("");
            
                 jLabel5.setIcon(null);
                jLabel26.setIcon(null);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (evt.getModifiers() > 0) {
                jTextArea1.transferFocusBackward();
            } else {
                jTextArea1.transferFocus();
            }
            evt.consume();
        }
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        // TODO add your handling code here:
        jComboBox1.showPopup();
        String text = (String) jComboBox1.getSelectedItem();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox1.setSelectedItem(text);
        }
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        // TODO add your handling code here:

        String pan = jTextField10.getText();
        pan = pan.toUpperCase();
        jTextField10.setText(pan);

    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        // TODO add your handling code here:st=

        String gst = jTextField11.getText();

        String substr1 = "";
        gst = gst.trim();

        String scode = "";

        if (gst.length() > 2) {
            substr1 = gst.substring(0, 2);
        }
        substr1 = substr1.trim();
        //  System.out.println("GST 1: " + substr1);

        ArrayList statecode = new GSTStateCode().getStateCode();
        for (int i = 0; i < statecode.size(); i++) {
            String str = (String) statecode.get(i);
            String substr2 = str.substring(0, 2);
            substr2 = substr2.trim();
            //  System.out.println("GST 1: " + substr1);
            //  System.out.println("GST 2: " + substr2);
            if (substr2.equals(substr1)) {
                scode = str;
                break;
            }
        }
        jComboBox3.setSelectedItem(scode);

        //  System.out.println(state);
        //        jComboBox3.setSelectedItem(substr.startsWith(substr));

    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        // TODO add your handling code here:

        String gst=jTextField11.getText();
        gst=gst.toUpperCase();
        jTextField11.setText(gst);
        String pan="";
        if(gst.length()>=15)
        {
            String ngst=gst.substring(0,15);
             pan=ngst.substring(2, 12);
              jTextField11.setText(ngst);
            jTextField10.setText(pan);
        }
        
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jComboBox3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox3KeyPressed
        // TODO add your handling code here:
        jComboBox3.showPopup();
        String text = (String) jComboBox3.getSelectedItem();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox3.setSelectedItem(text);
        }

    }//GEN-LAST:event_jComboBox3KeyPressed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:

        String partytype = (String) jComboBox6.getSelectedItem();

         
        if(partytype.equals("Unregistered"))
        {
            jTextField10.setEditable(true);
            jTextField11.setEditable(false);
            jTextField10.setBackground(Color.WHITE);
            jTextField11.setBackground(Color.lightGray);
            jTextField11.setText("");
            jComboBox3.setSelectedIndex(0);
            jTextField10.setText("");
            gst="Unregistered";
            gst=gst.trim();
           // jComboBox3.setEnabled(false);
           //
            
        }
        
        else if(partytype.equals("Registered Business-Regular"))
        {
            jTextField10.setEditable(false);
            jTextField10.setBackground(Color.lightGray);
            jTextField11.setEditable(true);
            jTextField11.setText("");   
            jTextField10.setText("");
             jComboBox3.setSelectedIndex(0);
             jTextField11.setBackground(Color.WHITE);
              //jComboBox3.setEnabled(true);
        }
        else if(partytype.equals("Registered Business-Composition"))
        {
            jTextField10.setEditable(false);
            jTextField10.setBackground(Color.lightGray);
            jTextField11.setEditable(true);
            jTextField11.setText("");
            jTextField10.setText("");
             jComboBox3.setSelectedIndex(0);
             jTextField11.setBackground(Color.WHITE);
            //  jComboBox3.setEnabled(true);
        }
        

    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox6KeyPressed
        // TODO add your handling code here:

        jComboBox6.showPopup();
        String partytype = (String) jComboBox6.getSelectedItem();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox6.setSelectedItem(partytype);
            if(partytype.equals("Unregistered"))
        {
            jTextField10.setEditable(true);
            jTextField11.setEditable(false);
            jTextField10.setBackground(Color.WHITE);
            jTextField11.setBackground(Color.lightGray);
            jTextField11.setText("");
            jComboBox3.setSelectedIndex(0);
            jTextField10.setText("");
            gst="Unregistered";
            gst=gst.trim();
           // jComboBox3.setEnabled(false);
           //
            
        }
        
        else if(partytype.equals("Registered Business-Regular"))
        {
            jTextField10.setEditable(false);
            jTextField10.setBackground(Color.lightGray);
            jTextField11.setEditable(true);
            jTextField11.setText("");   
            jTextField10.setText("");
             jComboBox3.setSelectedIndex(0);
             jTextField11.setBackground(Color.WHITE);
              //jComboBox3.setEnabled(true);
        }
        else if(partytype.equals("Registered Business-Composition"))
        {
            jTextField10.setEditable(false);
            jTextField10.setBackground(Color.lightGray);
            jTextField11.setEditable(true);
            jTextField11.setText("");
            jTextField10.setText("");
             jComboBox3.setSelectedIndex(0);
             jTextField11.setBackground(Color.WHITE);
            //  jComboBox3.setEnabled(true);
        }
           
        }
    }//GEN-LAST:event_jComboBox6KeyPressed

    private void jButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton9KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
             String name = jTextField18.getText();
        String address = jTextArea1.getText();
        String city = jTextField4.getText();
        String pin = jTextField5.getText();
        String state = (String) jComboBox1.getSelectedItem();
        String mob = jTextField6.getText();
        String emailid = jTextField7.getText();
        String fdetails = (String) jComboBox2.getSelectedItem();
       
    
        String nbusiness = jTextField8.getText();
        String ptype = (String) jComboBox6.getSelectedItem();
        String rnum = jTextField9.getText();
        String gstnumber = jTextField11.getText();
        String pan = jTextField10.getText();
        String gstscode = (String) jComboBox3.getSelectedItem();
        String bankname = jTextField12.getText();
        String accountnum = jTextField13.getText();
        String ifsccode = jTextField14.getText();
        String accname = jTextField15.getText();
        String acctype = (String) jComboBox4.getSelectedItem();
        String defaultaccount = jTextField16.getText();
        String banks = "";

        if (emailid.length() == 0) {
            emailid = email;

        }
       
        if(gstnumber.length()==0)
         {
           gstnumber=gst; 
         }
         
          if(pan.length()==0)
         {
           pan="No pan Details"; 
         }

        for (int i = 0; i < bankdetail.size(); i++) 
        {
            String str = "";
            ArrayList temp = (ArrayList) bankdetail.get(i);
            for (int j = 0; j < temp.size(); j++) {
                str = str + temp.get(j).toString() + "#";

            }
            banks = banks + str + ",";
        }
        String bankinfo = defaultaccount + "," + banks;
         String pandetails="";
        
       if(!pan.equals("No pan Details"))
        {
            System.out.println("Pan Number is validated");
              pandetails=new PANValidator().isValidPAN(pan);
      
        }

 System.out.println("Name: "+name);
        System.out.println("Adress: "+address);
        System.out.println("City: "+city);
        System.out.println("Pin: "+pin);
        System.out.println("State: "+state);
        System.out.println("Contact No: "+mob);
        System.out.println("Email: "+email);
        System.out.println("Formation Details: "+fdetails);
        System.out.println("Nature of Business: "+nbusiness);
        System.out.println("Registration Number: "+rnum);
        System.out.println("PAN No: "+pan);
        System.out.println("GST Number: "+gstnumber);
        System.out.println("GST State Code: "+gstscode);
          System.out.println("Default Bank Account: "+dbankacc);
          System.out.println("Bank Details: "+bankinfo);
          
          System.out.println("\n\n===================================================\n\n");
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name Cannot be Empty");

        } else if (address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Address Cannot be Empty");
        } else if (city.isEmpty()) {
            JOptionPane.showMessageDialog(null, "City Name Cannot be Empty");
        } else if (pin.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pin Code Cannot be Empty");
        } else if (pin.length() != 6) {
            JOptionPane.showMessageDialog(null, "Pin Code should be of 6 Digits ");
        } else if (Validator.isValidPinint(pin) == false) {
            JOptionPane.showMessageDialog(null, "Pin Code is not Valid Please Try Again");
        } else if (state.equals("Select")) {
            JOptionPane.showMessageDialog(null, "Please Select State");
        } else if (mob.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mobile Number Cannot be Empty");
        } else if (mob.length() != 10) {
            JOptionPane.showMessageDialog(null, "Mobile Number should be of 10 Digits");
        } else if (Validator.isDigitMobileno(mob) == false) {
            JOptionPane.showMessageDialog(null, "Mobile Number is not Valid Please Try Again");
        } else if (!emailid.equals("No Emailid") && !emailid.contains("@")) {
            JOptionPane.showMessageDialog(null, "Email ID does not contains '@' Please try Again");

        } else if (!emailid.equals("No Emailid") && !emailid.contains(".")) {
            JOptionPane.showMessageDialog(null, "Email ID does not contains '.' Please try Again");

        } else if (ptype.equals("Select")) {
            JOptionPane.showMessageDialog(null, "Please Select Party Type");
        } else if (fdetails.equals("Select")) {
            JOptionPane.showMessageDialog(null, "Please Select Formation Details");
        } else if (nbusiness.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nature of Business Cannot be Empty");

        } else if (defaultaccount.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Default Account Cannot be Empty");
        } else if (rnum.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registration Number Cannot be Empty");
        } 
      
        else if (gstscode.equals("Select State GST Code")) 
        {
            JOptionPane.showMessageDialog(null, "Please Select GST State Code");
        } 
         else if (!gstnumber.equals("Unregistered") && !validGST(gstnumber).equals("VALID GST") )
        {

            JOptionPane.showMessageDialog(null, "GSTIN Number is not Valid Please Try Again");

        }
        else if(!pandetails.isEmpty() )
        {
            System.out.println("Inside Pan Details");
           JOptionPane.showMessageDialog(null, pandetails);
        }
        
        
        else {

            HomeCompanyDBOperation hd = new HomeCompanyDBOperation();
            if (hd.updateHomeCompanyinfo(name, address, city, pin, state, mob, emailid, fdetails, nbusiness, ptype, rnum, pan, gstnumber, gstscode, bankinfo,  LoginFrame.uname, LoginFrame.date,arr1,fis1,arr2,fis2)) 
            {
                JOptionPane.showMessageDialog(null, "Home Company Information Updated Successfully");
                bankdetail = new ArrayList();
                accnum = new ArrayList();
                jTextField18.setText("");
                jTextArea1.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jComboBox1.setSelectedItem("Select");
                jTextField6.setText("");
                jTextField7.setText("");
                jComboBox2.setSelectedItem("Select");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jComboBox3.setSelectedItem("Select State GST Code");
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
                jComboBox4.setSelectedItem("Select");
                jComboBox6.setSelectedItem("Select");
                jTextField16.setText("");
              
                 jLabel5.setIcon(null);
                jLabel26.setIcon(null);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

            } else {
                JOptionPane.showMessageDialog(null, "Oops There is Some Error Please Try Again");
            }

            //        System.out.println("Name: "+name);
            //        System.out.println("Adress: "+address);
            //        System.out.println("City: "+city);
            //        System.out.println("Pin: "+pin);
            //        System.out.println("State: "+state);
            //        System.out.println("Contact No: "+mob);
            //        System.out.println("Email: "+emailid);
            //        System.out.println("Formation Details: "+fdetails);
            //        System.out.println("Nature of Business: "+nbusiness);
            //        System.out.println("Registration Number: "+rnum);
            //        System.out.println("PAN No: "+pan);
            //        System.out.println("GST Number: "+gst);
            //        System.out.println("GST State Code: "+gstscode);
            //          System.out.println("Default Bank Account: "+dbankacc);
            //          System.out.println("Bank Details: "+bankinfo);
        }
        }

    }//GEN-LAST:event_jButton9KeyPressed
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
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

        String name = jTextField18.getText();
        String address = jTextArea1.getText();
        String city = jTextField4.getText();
        String pin = jTextField5.getText();
        String state = (String) jComboBox1.getSelectedItem();
        String mob = jTextField6.getText();
        String emailid = jTextField7.getText();
        String fdetails = (String) jComboBox2.getSelectedItem();
       
    
        String nbusiness = jTextField8.getText();
        String ptype = (String) jComboBox6.getSelectedItem();
        String rnum = jTextField9.getText();
        String gstnumber = jTextField11.getText();
        String pan = jTextField10.getText();
        String gstscode = (String) jComboBox3.getSelectedItem();
        String bankname = jTextField12.getText();
        String accountnum = jTextField13.getText();
        String ifsccode = jTextField14.getText();
        String accname = jTextField15.getText();
        String acctype = (String) jComboBox4.getSelectedItem();
        String defaultaccount = jTextField16.getText();
        String banks = "";

        if (emailid.length() == 0) {
            emailid = email;

        }
       
        if(gstnumber.length()==0)
         {
           gstnumber=gst; 
         }
         
          if(pan.length()==0)
         {
           pan="No pan Details"; 
         }

        for (int i = 0; i < bankdetail.size(); i++) 
        {
            String str = "";
            ArrayList temp = (ArrayList) bankdetail.get(i);
            for (int j = 0; j < temp.size(); j++) {
                str = str + temp.get(j).toString() + "#";

            }
            banks = banks + str + ",";
        }
        String bankinfo = defaultaccount + "," + banks;
         String pandetails="";
        
       if(!pan.equals("No pan Details"))
        {
            System.out.println("Pan Number is validated");
              pandetails=new PANValidator().isValidPAN(pan);
      
        }

 System.out.println("Name: "+name);
        System.out.println("Adress: "+address);
        System.out.println("City: "+city);
        System.out.println("Pin: "+pin);
        System.out.println("State: "+state);
        System.out.println("Contact No: "+mob);
        System.out.println("Email: "+email);
        System.out.println("Formation Details: "+fdetails);
        System.out.println("Nature of Business: "+nbusiness);
        System.out.println("Registration Number: "+rnum);
        System.out.println("PAN No: "+pan);
        System.out.println("GST Number: "+gstnumber);
        System.out.println("GST State Code: "+gstscode);
          System.out.println("Default Bank Account: "+dbankacc);
          System.out.println("Bank Details: "+bankinfo);
          
          System.out.println("\n\n===================================================\n\n");
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name Cannot be Empty");

        } else if (address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Address Cannot be Empty");
        } else if (city.isEmpty()) {
            JOptionPane.showMessageDialog(null, "City Name Cannot be Empty");
        } else if (pin.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pin Code Cannot be Empty");
        } else if (pin.length() != 6) {
            JOptionPane.showMessageDialog(null, "Pin Code should be of 6 Digits ");
        } else if (Validator.isValidPinint(pin) == false) {
            JOptionPane.showMessageDialog(null, "Pin Code is not Valid Please Try Again");
        } else if (state.equals("Select")) {
            JOptionPane.showMessageDialog(null, "Please Select State");
        } else if (mob.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mobile Number Cannot be Empty");
        } else if (mob.length() != 10) {
            JOptionPane.showMessageDialog(null, "Mobile Number should be of 10 Digits");
        } else if (Validator.isDigitMobileno(mob) == false) {
            JOptionPane.showMessageDialog(null, "Mobile Number is not Valid Please Try Again");
        } else if (!emailid.equals("No Emailid") && !emailid.contains("@")) {
            JOptionPane.showMessageDialog(null, "Email ID does not contains '@' Please try Again");

        } else if (!emailid.equals("No Emailid") && !emailid.contains(".")) {
            JOptionPane.showMessageDialog(null, "Email ID does not contains '.' Please try Again");

        } else if (ptype.equals("Select")) {
            JOptionPane.showMessageDialog(null, "Please Select Party Type");
        } else if (fdetails.equals("Select")) {
            JOptionPane.showMessageDialog(null, "Please Select Formation Details");
        } else if (nbusiness.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nature of Business Cannot be Empty");

        } else if (defaultaccount.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Default Account Cannot be Empty");
        } else if (rnum.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registration Number Cannot be Empty");
        } 
      
        else if (gstscode.equals("Select State GST Code")) 
        {
            JOptionPane.showMessageDialog(null, "Please Select GST State Code");
        } 
         else if (!gstnumber.equals("Unregistered") && !validGST(gstnumber).equals("VALID GST") )
        {

            JOptionPane.showMessageDialog(null, "GSTIN Number is not Valid Please Try Again");

        }
        else if(!pandetails.isEmpty() )
        {
            System.out.println("Inside Pan Details");
           JOptionPane.showMessageDialog(null, pandetails);
        }
        
        
        else {

            HomeCompanyDBOperation hd = new HomeCompanyDBOperation();
            if (hd.updateHomeCompanyinfo(name, address, city, pin, state, mob, emailid, fdetails, nbusiness, ptype, rnum, pan, gstnumber, gstscode, bankinfo,  LoginFrame.uname, LoginFrame.date,arr1,fis1,arr2,fis2)) 
            {
                JOptionPane.showMessageDialog(null, "Home Company Information Updated Successfully");
                bankdetail = new ArrayList();
                accnum = new ArrayList();
                jTextField18.setText("");
                jTextArea1.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jComboBox1.setSelectedItem("Select");
                jTextField6.setText("");
                jTextField7.setText("");
                jComboBox2.setSelectedItem("Select");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jComboBox3.setSelectedItem("Select State GST Code");
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
                jComboBox4.setSelectedItem("Select");
                jComboBox6.setSelectedItem("Select");
                jTextField16.setText("");
            
                 jLabel5.setIcon(null);
                jLabel26.setIcon(null);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

            } else {
                JOptionPane.showMessageDialog(null, "Oops There is Some Error Please Try Again");
            }

            //        System.out.println("Name: "+name);
            //        System.out.println("Adress: "+address);
            //        System.out.println("City: "+city);
            //        System.out.println("Pin: "+pin);
            //        System.out.println("State: "+state);
            //        System.out.println("Contact No: "+mob);
            //        System.out.println("Email: "+emailid);
            //        System.out.println("Formation Details: "+fdetails);
            //        System.out.println("Nature of Business: "+nbusiness);
            //        System.out.println("Registration Number: "+rnum);
            //        System.out.println("PAN No: "+pan);
            //        System.out.println("GST Number: "+gst);
            //        System.out.println("GST State Code: "+gstscode);
            //          System.out.println("Default Bank Account: "+dbankacc);
            //          System.out.println("Bank Details: "+bankinfo);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox4KeyPressed
        // TODO add your handling code here:
        jComboBox4.showPopup();
        String text = (String) jComboBox4.getSelectedItem();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox4.setSelectedItem(text);
        }

    }//GEN-LAST:event_jComboBox4KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
       int row=jTable1.getSelectedRow();
        System.out.println("Row is "+row);
         if(row!=-1)
         {
              System.out.println("accnum : "+accnum);
            System.out.println("bankdetails : "+bankdetail);
            
            System.out.println("==========================================\n");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
       String accountno=(String) jTable1.getValueAt(row, 1);
        accnum.remove(accountno);
       int index=-1;
             System.out.println("Account Number 1: "+accountno);
        for (int i = 0; i <  bankdetail.size(); i++)
        {
            ArrayList temp=(ArrayList)bankdetail.get(i);
            String acn=(String)temp.get(1);
             System.out.println("ACN: "+acn);
            if(acn.equals(accountno))
            {
                index=i;
                break;
                
            }
        }
             System.out.println("Index: "+index);
        bankdetail.remove(index);
         
       model.removeRow(row);
       
       jTextField12.setText("");
       jTextField13.setText("");
       jTextField14.setText("");
       jTextField15.setText("");
         jTextField16.setText("");
       jComboBox4.setSelectedItem("Select");
       
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Please Select a row to be Delete");
         }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
        // TODO add your handling code here:

        jComboBox2.showPopup();
        String text = (String) jComboBox2.getSelectedItem();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox2.setSelectedItem(text);
        }
    }//GEN-LAST:event_jComboBox2KeyPressed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
             int row=jTable1.getSelectedRow();
        System.out.println("Row is "+row);
         if(row!=-1)
         {
              System.out.println("accnum : "+accnum);
            System.out.println("bankdetails : "+bankdetail);
            
            System.out.println("==========================================\n");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
       String accountno=(String) jTable1.getValueAt(row, 1);
        accnum.remove(accountno);
       int index=-1;
             System.out.println("Account Number 1: "+accountno);
        for (int i = 0; i <  bankdetail.size(); i++)
        {
            ArrayList temp=(ArrayList)bankdetail.get(i);
            String acn=(String)temp.get(1);
             System.out.println("ACN: "+acn);
            if(acn.equals(accountno))
            {
                index=i;
                break;
                
            }
        }
             System.out.println("Index: "+index);
        bankdetail.remove(index);
         
       model.removeRow(row);
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Please Select a row to be Delete");
         }
        }
    }//GEN-LAST:event_jButton7KeyPressed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        String bankname = jTextField12.getText();
        String accountnum = jTextField13.getText();
        String ifsccode = jTextField14.getText();
        String accname = jTextField15.getText();
        String acctype = (String) jComboBox4.getSelectedItem();
 String result1=new IFSCValidator().isValidIFSC(ifsccode);
        if (bankname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bank Name Cannot be Empty");
        } else if (accountnum.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Account Number Cannot be Empty");
        } 
        else if (Validator.isValidAccNumber(accountnum) == false) 
        {
            JOptionPane.showMessageDialog(null, "Account Number is not valid");
        }
         else if(!result1.isEmpty())
        {
             JOptionPane.showMessageDialog(null, result1);
        }
        else if (accname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Account Name Cannot be Empty");
        } else if (acctype.equals("Select")) {
            JOptionPane.showMessageDialog(null, "Please Select Account Type");
        } else {

            ArrayList bankinfo = new ArrayList();

            bankinfo.add(bankname);
            bankinfo.add(accountnum);
            bankinfo.add(ifsccode);
            bankinfo.add(accname);
            bankinfo.add(acctype);

            System.out.println("accnum : "+accnum);
            System.out.println("bankdetails : "+bankdetail);
            
            System.out.println("==========================================\n");
            if (!accnum.contains(accountnum)) 
            {
                bankdetail.add(bankinfo);
                accnum.add(accountnum);

                //    System.out.println("Bank Details: "+bankdetails);  
                int rowheight = 30;
                int columncount = jTable1.getColumnCount();
                InsertDataToTable it = new InsertDataToTable();
                it.getDataInserted(jTable1, columncount, bankdetail, rowheight);
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
                jComboBox4.setSelectedItem("Select");

            } else {
                JOptionPane.showMessageDialog(null, "Account number Already Existed !");
            }

        }   

        }
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dbankacc = jTextField16.getText();
            if (dbankacc.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Default Bank Account Cannot be Empty");
            }
        }
    }//GEN-LAST:event_jButton6KeyPressed

    private void jButton15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton15KeyPressed
        // TODO add your handling code here:
        bankdetail = new ArrayList();
                accnum = new ArrayList();
                jTextField18.setText("");
                jTextArea1.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jComboBox1.setSelectedItem("Select");
                jTextField6.setText("");
                jTextField7.setText("");
                jComboBox2.setSelectedItem("Select");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jComboBox3.setSelectedItem("Select State GST Code");
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
                jComboBox4.setSelectedItem("Select");
                jComboBox6.setSelectedItem("Select");
                jTextField16.setText("");
            
                 jLabel5.setIcon(null);
                jLabel26.setIcon(null);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
    }//GEN-LAST:event_jButton15KeyPressed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextArea1.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        // TODO add your handling code here:
        jTextArea1.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextArea1FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField4.setBorder(new LineBorder(clr, 1));
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        jTextField4.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField5.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        // TODO add your handling code here:
        jTextField5.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField6.setBorder(new LineBorder(clr, 2));

    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
        jTextField6.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField7.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        // TODO add your handling code here:
        jTextField7.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField8.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost
        // TODO add your handling code here:
        jTextField8.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField8FocusLost

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField9.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextField9FocusGained

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        // TODO add your handling code here:
        jTextField9.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField11.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextField11FocusGained

    private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
        // TODO add your handling code here:
        jTextField11.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField11FocusLost

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField10.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
        // TODO add your handling code here:
        jTextField10.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField10FocusLost

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1FocusGained

    private void jTextField12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField12.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextField12FocusGained

    private void jTextField12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusLost
        // TODO add your handling code here:
        jTextField12.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField12FocusLost

    private void jTextField13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField13.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextField13FocusGained

    private void jTextField13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusLost
        // TODO add your handling code here:
        jTextField13.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField13FocusLost

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField14.setBorder(new LineBorder(clr, 2));

    }//GEN-LAST:event_jTextField14FocusGained

    private void jTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusLost
        // TODO add your handling code here:
        jTextField14.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField14FocusLost

    private void jTextField15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusGained
        // TODO add your handling code here:
         Color clr = new Color(51, 161, 222);
        jTextField15.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextField15FocusGained

    private void jTextField15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusLost
        // TODO add your handling code here:
        jTextField15.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField15FocusLost

    private void jTextField16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField16.setBorder(new LineBorder(clr, 2));
    }//GEN-LAST:event_jTextField16FocusGained

    private void jTextField16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusLost
        // TODO add your handling code here:
        jTextField16.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField16FocusLost

    private void jLabel5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel5FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel5FocusGained

    private void jTextField18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField18FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18FocusGained

    private void jTextField18FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField18FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18FocusLost

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
          JFileChooser js=new JFileChooser();
        js.showOpenDialog(js);
        File f=js.getSelectedFile();
       String  path = f.getAbsolutePath();
        try {
            fis1=new FileInputStream(path);
           
             

            
            
                  } catch (FileNotFoundException ex) {
            Logger.getLogger(EditHomeCompanyProfileFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditHomeCompanyProfileFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        logoname = f.getName();
       if(path.endsWith("jpg") || path.endsWith("JPG") || path.endsWith("JPEG") || path.endsWith("png") || path.endsWith("PNG"))
       {
          ImageIcon icon = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(193, 80, Image.SCALE_DEFAULT));
        jLabel5.setIcon(icon); 
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Please Select Image with JPG or png format only");
       }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        JFileChooser js=new JFileChooser();
        js.showOpenDialog(js);
        File f=js.getSelectedFile();
       String  path = f.getAbsolutePath();
        signaturename = f.getName();
        try {
            fis2=new FileInputStream(path);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EditHomeCompanyProfileFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       if(path.endsWith("jpg") || path.endsWith("JPG") || path.endsWith("JPEG") || path.endsWith("png") || path.endsWith("PNG"))
       {
          ImageIcon icon = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(193, 80, Image.SCALE_DEFAULT));
        jLabel26.setIcon(icon); 
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Please Select Image with JPG  or png format only");
       }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
        arr1=null;
         String str = "logoimage";
         arr1 = str.getBytes();
        jLabel5.setIcon(null);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         arr2=null;
          String str = "signatureimage";
           arr2 = str.getBytes();
        jLabel26.setIcon(null);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased
        // TODO add your handling code here:
         String ifsc=jTextField14.getText();
        ifsc=ifsc.toUpperCase();
         jTextField14.setText(ifsc);
    }//GEN-LAST:event_jTextField14KeyReleased

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        ManagerEditFrame nf=new ManagerEditFrame();
        nf.setVisible(true);
        nf.setSize(d);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        AddHomeCompanyProfileFrame af = new AddHomeCompanyProfileFrame();
        af.setVisible(true);
        af.setSize(d);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        HomeCompanyDBOperation ho = new HomeCompanyDBOperation();
        ArrayList hcinfo = ho.getHomeCompanyInfo();
        if(!hcinfo.isEmpty())
        {

            this.dispose();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            EditHomeCompanyProfileFrame af = new EditHomeCompanyProfileFrame();
            af.setVisible(true);
            af.setSize(d);
        }

        else
        {
            JOptionPane.showMessageDialog(null,"No Home company Information is  added \n Please add the Home Company information First to edit the same");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu8KeyPressed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        NewStaffCreationFrame nf=new NewStaffCreationFrame();
        nf.setVisible(true);
        nf.setSize(d);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        ViewAllStaffFrame vf=new ViewAllStaffFrame();
        vf.setVisible(true);
        vf.setSize(d);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        ViewAllStaffReportFrame vf=new ViewAllStaffReportFrame();
        vf.setVisible(true);
        vf.setSize(d);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        ArrayList saleinfo=new SaleDBOperation().getAllSaleItemInfo();

        System.out.println("Saleinfo: "+saleinfo);

        ArrayList item=new ArrayList();

        for (int i = 0; i <saleinfo.size(); i++)
        {
            ArrayList temp=(ArrayList) saleinfo.get(i);
            item.add(temp.get(0));
        }

        HashSet hs=new HashSet();
        hs.addAll(item);
        item.clear();
        item.addAll(hs);

        ArrayList salebar=new ArrayList();

        for (int i = 0; i <item.size();i++)
        {
            ArrayList temp1=new ArrayList();
            String itemname1=(String) item.get(i);

            int itemcost=0;

            for (int j = 0; j <saleinfo.size(); j++)
            {
                ArrayList temp=(ArrayList) saleinfo.get(j);
                String itemname2=(String) temp.get(0);

                if(itemname1.equals(itemname2))
                {
                    String str=(String) temp.get(1);

                    System.out.println("str: "+str);
                    double cost=Double.parseDouble(str);

                    int amount=(int)cost;
                    //                    System.out.println("cost: "+amount);
                    itemcost=itemcost+amount;
                }

            }

            temp1.add(itemname1);
            temp1.add(Integer.toString(itemcost));
            salebar.add(temp1);
        }

        for (int i = 0; i <salebar.size(); i++)
        {
            ArrayList temp=(ArrayList) salebar.get(i);
            System.out.println("temp: "+temp);
            SaleChartApplet.mas.add(temp);
        }

        SaleChartApplet.message="Sale Graph";

        new SaleGraphChart().intiateSimulation();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        ArrayList purchaseinfo=new PurchaseDBOperation().getAllPurcaseItemInfo();

        System.out.println("purchaseinfo: "+purchaseinfo);

        ArrayList item=new ArrayList();

        for (int i = 0; i <purchaseinfo.size(); i++)
        {
            ArrayList temp=(ArrayList) purchaseinfo.get(i);
            item.add(temp.get(0));
        }

        HashSet hs=new HashSet();
        hs.addAll(item);
        item.clear();
        item.addAll(hs);

        ArrayList salebar=new ArrayList();

        for (int i = 0; i <item.size();i++)
        {
            ArrayList temp1=new ArrayList();
            String itemname1=(String) item.get(i);

            int itemcost=0;

            for (int j = 0; j <purchaseinfo.size(); j++)
            {
                ArrayList temp=(ArrayList) purchaseinfo.get(j);
                String itemname2=(String) temp.get(0);

                if(itemname1.equals(itemname2))
                {
                    String str=(String) temp.get(1);

                    System.out.println("str: "+str);
                    double cost=Double.parseDouble(str);

                    int amount=(int)cost;
                    //                    System.out.println("cost: "+amount);
                    itemcost=itemcost+amount;
                }

            }

            temp1.add(itemname1);
            temp1.add(Integer.toString(itemcost));
            salebar.add(temp1);
        }

        for (int i = 0; i <salebar.size(); i++)
        {
            ArrayList temp=(ArrayList) salebar.get(i);
            System.out.println("temp: "+temp);
            PurchaseChartApplet.mas.add(temp);
        }

        PurchaseChartApplet.message="Purchase Graph";

        new PurchaseGraphChart().intiateSimulation();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        LoginFrame af = new LoginFrame();
        af.setVisible(true);
        af.setSize(d);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(EditHomeCompanyProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditHomeCompanyProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditHomeCompanyProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditHomeCompanyProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditHomeCompanyProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
