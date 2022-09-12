/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TableOperation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author 1450
 */
public class InsertComboBoxToJtable 
{
  public void getComboBoxInserted(ArrayList itemname, JTable table, String colname)
  {
      String[] itemslist = new String[itemname.size()];
      itemslist = (String[]) itemname.toArray(itemslist);
    //  String []positions={"Unknown", "Cash", "Cheque", "e-Payment"};
       JComboBox combo= new JComboBox<String>(itemslist);
       
//       table.getColumn("Payment Mode").setCellRenderer(new DefaultCellEditor(combo));
//       TableColumn col=table.getColumnModel().getColumn(5);
       table.getColumn(colname).setCellEditor(new DefaultCellEditor(combo));
       
     
       
      
       
  }
    
}
