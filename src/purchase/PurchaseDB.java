/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;

import dbdriver.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Innovatus Tech
 */
public class PurchaseDB 

{
   
    public boolean isInvoiceExisted(String inv)
    {
        boolean flag=false;
         try
        {
            Statement st= new DBDriver().getStatment();
             String query="Select * from purchaseinfo where Invoice_Number='"+inv+"' ";
             ResultSet rs=st.executeQuery(query);
             if(rs.next())
            {
             flag=true;   
            }
           st.close();
        }
        catch(Exception e)
        {
            System.out.println("Exeption in PartyDB class and method isPartyExisted(): "+e);
            flag=false;
        }
          return flag;
    }    
    
}
