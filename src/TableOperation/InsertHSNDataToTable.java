/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TableOperation;

import static java.awt.Component.CENTER_ALIGNMENT;
import static java.awt.Component.LEFT_ALIGNMENT;
import static java.awt.Component.RIGHT_ALIGNMENT;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VOSTRO2557
 */
public class InsertHSNDataToTable {
    

    
    public void getDataInserted( JTable table, int cnumber, ArrayList info, int rowheight)
    {
        
        
         
            
        DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
        rendar.setHorizontalAlignment((int) LEFT_ALIGNMENT);
//         table.getColumnModel().getColumn(0).setCellRenderer(rendar); 
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
