/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dboperation;

import dbdriver.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 1450
 */
public class HSNSACCODEDBOperation {
    
     public ArrayList getAllHSNSACCode(String tablename)
    {

       ArrayList name=new ArrayList();
        try
           {
             Statement st= new DBDriver().getStatment();
             String query="Select *from " + tablename;
              ResultSet rs1=st.executeQuery(query);
         
             while(rs1.next())
            {

             ArrayList temp=new ArrayList();   
             String hsnsaccode=rs1.getString(1);
             String description=rs1.getString(2);
            
             
             temp.add(hsnsaccode);
             temp.add(description);
            
             name.add(temp);
             
             
            }
             st.close();
             
                  
              }
              
           catch (Exception e)
           {
               System.out.println("Exeption in HSNSACCODEDBOperation Class is in getAllHSNSACCode() : "+e);
           }
       
        return name;
    }    
    
}
