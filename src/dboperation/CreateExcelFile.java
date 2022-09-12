/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dboperation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import jxl.Cell;
import jxl.CellView;
import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author 1450
 */
public class CreateExcelFile {
   
    
    public void getExcelFile(ArrayList data, String path) throws IOException, WriteException 
    {
        
        
        
         WritableWorkbook workbook = Workbook.createWorkbook(new File(path+".xls"));
        WritableSheet sheet = workbook.createSheet("My Sheet", 0);
        
         
    
    // Create cell font and format
    WritableFont cellFont = new WritableFont(WritableFont.TIMES, 12);
    // cellFont.setColour(Colour.BLUE);
    
    WritableCellFormat cellFormat = new WritableCellFormat(cellFont);
  //  cellFormat.setBackground(Colour.ORANGE);
   //cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
     
    
    Label lable = null;
    
    
    for (int i = 0 ; i <data.size() ; i ++) 
    {
      ArrayList temp=(ArrayList) data.get(i);
      sheet.insertRow(i); //Insert new row at row 2 [Moves the row 2 to next row]
      
        for (int j = 0; j <temp.size(); j++) 
        {
            
            lable = new Label(j, i, temp.get(j).toString(), cellFormat);
             
            sheet.addCell(lable);
            
        }
      
    }
    
    //Writes out the data held in this workbook in Excel format
    workbook.write(); 
    
    //Close and free allocated memory 
    workbook.close(); 
  }
         
    }
    
   

       
    

