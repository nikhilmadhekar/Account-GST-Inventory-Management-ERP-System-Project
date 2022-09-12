/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TableOperation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author 1450
 */
public class InsertCheckBoxToJtable 
{
  public void getCheckBoxInserted( JTable table, String colname)
  {
     
       JCheckBox check= new JCheckBox("Selected", true);
     //  table.getColumn(colname).setCellEditor((TableCellEditor) new CheckBoxRenderer());
       table.getColumn(colname).setCellRenderer(new CheckBoxRenderer());
    
       
  }
    
}
