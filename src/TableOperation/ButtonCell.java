/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TableOperation;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author 1450
 */
 public class ButtonCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer{

        private JButton btn;

        ButtonCell(){
            btn = new JButton();
            btn.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                  //  System.out.println("clicked");
                }

                
            });
        }

        @Override
        public Object getCellEditorValue() {
            return null;
        }

        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus, int row,
                int column) {
            if(value instanceof Icon){
               btn.setBackground(Color.white);
                btn.setIcon((Icon) value);
            } else {
                btn.setIcon(null);
            }
            return btn;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table,
                Object value, boolean isSelected, int row, int column) {
            if(value instanceof Icon){
               btn.setBackground(Color.white);
                btn.setIcon((Icon) value);
               
            } else {
                btn.setIcon(null);
            }
            return btn;
        }
 }
