/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package purchase;

import javax.swing.JTable;

/**
 *
 * @author Innovatus Tech
 */
public class EmptyRowIdentifier 
{
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
}
