/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TableOperation;

import static java.awt.Component.CENTER_ALIGNMENT;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTable;
import static javax.swing.SwingConstants.LEFT;
import static javax.swing.SwingConstants.RIGHT;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VOSTRO2557
 */
public class InsertDataToTable {
    

    
      public void getDataInsertedLEFT( JTable table, int cnumber, ArrayList info, int rowheight)
    {
        
        
         
            
       DefaultTableCellRenderer rendar1 = new DefaultTableCellRenderer();
        rendar1.setHorizontalAlignment(LEFT);
         table.getColumnModel().getColumn(1).setCellRenderer(rendar1);
        table.getColumnModel().getColumn(2).setCellRenderer(rendar1);
        
         DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
        rendar.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        
          table.getColumnModel().getColumn(0).setCellRenderer(rendar);
        table.getColumnModel().getColumn(3).setCellRenderer(rendar);
        table.getColumnModel().getColumn(4).setCellRenderer(rendar);
        table.getColumnModel().getColumn(5).setCellRenderer(rendar);
           table.getColumnModel().getColumn(6).setCellRenderer(rendar);     

        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        table.setRowHeight(rowheight);
        
        Object rowData[] = new Object[cnumber];
        model.setRowCount(0);
      //  System.out.println("Row count = "+model);
       
         for(int i=0;i<info.size();i++)
         {
            
             ArrayList temp=(ArrayList) info.get(i);
             
             
             
             for(int j=0;j<temp.size();j++)
             {
             String str=(String) temp.get(j);
//             System.out.println(str);
             rowData[j]=str;
             }
             
           //  rowData[rowData.length-1]=false;
             model.addRow(rowData);
         }
        
        
    }
    
     public void getSearchPurchaseFrameDataInserted( JTable table, int cnumber, ArrayList info, int rowheight)
    {
        
        
         
            
       DefaultTableCellRenderer rendar1 = new DefaultTableCellRenderer();
        rendar1.setHorizontalAlignment(LEFT);
         table.getColumnModel().getColumn(1).setCellRenderer(rendar1);
        table.getColumnModel().getColumn(2).setCellRenderer(rendar1);
        
         DefaultTableCellRenderer rendar2 = new DefaultTableCellRenderer();
        rendar2.setHorizontalAlignment(RIGHT);
              
        
         DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
        rendar.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        
        table.getColumnModel().getColumn(0).setCellRenderer(rendar);
        table.getColumnModel().getColumn(1).setCellRenderer(rendar1);
        table.getColumnModel().getColumn(2).setCellRenderer(rendar1);
        table.getColumnModel().getColumn(3).setCellRenderer(rendar1);
        table.getColumnModel().getColumn(4).setCellRenderer(rendar1); 
        table.getColumnModel().getColumn(5).setCellRenderer(rendar2); 
        table.getColumnModel().getColumn(6).setCellRenderer(rendar2); 
        table.getColumnModel().getColumn(7).setCellRenderer(rendar2); 
        table.getColumnModel().getColumn(8).setCellRenderer(rendar2); 
        table.getColumnModel().getColumn(9).setCellRenderer(rendar2);
        table.getColumnModel().getColumn(10).setCellRenderer(rendar1);

        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        table.setRowHeight(rowheight);
        
        Object rowData[] = new Object[cnumber];
        model.setRowCount(0);
      //  System.out.println("Row count = "+model);
       
         for(int i=0;i<info.size();i++)
         {
            
             ArrayList temp=(ArrayList) info.get(i);
             
             
             
             for(int j=0;j<temp.size();j++)
             {
             String str=(String) temp.get(j);
//             System.out.println(str);
             rowData[j]=str;
             }
             
           //  rowData[rowData.length-1]=false;
             model.addRow(rowData);
         }
        
        
    }
    public void getDataInserted( JTable table, int cnumber, ArrayList info, int rowheight)
    {
        
        
         
            
        DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
        rendar.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        
     //    table.getColumnModel().getColumn(0).setCellRenderer(rendar); 
//          table.getColumnModel().getColumn(2).setCellRenderer(rendar); 
        
        int x=table.getColumnCount();
        for(int i=0;i<x;i++)
        {
            table.getColumnModel().getColumn(i).setCellRenderer(rendar); 
        }
        
        
      
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        table.setRowHeight(rowheight);
        
        Object rowData[] = new Object[cnumber];
        model.setRowCount(0);
      //  System.out.println("Row count = "+model);
       
         for(int i=0;i<info.size();i++)
         {
            
             ArrayList temp=(ArrayList) info.get(i);
             
             
             
             for(int j=0;j<temp.size();j++)
             {
             String str=(String) temp.get(j);
//             System.out.println(str);
             rowData[j]=str;
             }
             
             
             model.addRow(rowData);
         }
        
        
    }
    
}
