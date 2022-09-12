/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableOperation;

import dbdriver.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;


public class PartyDB 
{
    
    public boolean isPartyExisted(String pname)
    {
        boolean flag=false;
         try
        {
            Statement st= new DBDriver().getStatment();
             String query="Select * from partyinfo where Name='"+pname+"' ";
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
    
    
    public boolean isGSTINExisted(String gstno)
    {
        boolean flag=false;
        
        if(gstno.equals("Unregistered"))
        {
            flag=false;
        }
        else
        {
         try
        {
            Statement st= new DBDriver().getStatment();
             String query="Select * from partyinfo where GSTIN='"+gstno+"' ";
             ResultSet rs=st.executeQuery(query);
             if(rs.next())
            {
             flag=true;   
            }
           else
             {
                 flag=false;
             }
                     
           st.close();
        }
        catch(Exception e)
        {
            System.out.println("Exeption in PartyDB class and method isGSTINExisted(): "+e);
            flag=false;
        }
          return flag;
    }
        return flag;
    }
}
