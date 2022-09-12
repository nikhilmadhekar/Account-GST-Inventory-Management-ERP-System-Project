/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableOperation;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author 1450
 */
public class  CheckBoxRenderer extends JCheckBox implements TableCellRenderer {

    CheckBoxRenderer() {
      setHorizontalAlignment(JLabel.CENTER);
     // setBackground(Color.BLUE);
    }

    public Component getTableCellRendererComponent(JTable table, Object value,
        boolean isSelected, boolean hasFocus, int row, int column) {

      Object valueInColumn1 = table.getValueAt(row, 1);
      if (valueInColumn1 == null) 
      {
          JLabel x=new JLabel();
          return x;
      } 
      setSelected((value != null && ((Boolean) value).booleanValue()));
      return this;
    }

    
}