/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dboperation;



import dbdriver.DBDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author VOSTRO2557
 */
public class CEOProfileDBOperation {
    
    public boolean checkPassword(String pass)
    {
        boolean flag=true;

        try
        {

            Statement st= new DBDriver().getStatment();

            String query="Select * from ceoinfo where password='"+pass+"'";

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
            System.out.println("Exception in CEOProfileDBOperation Class in checkPassword method() is: "+e);
            flag=false;
        }




        return flag;
    }
    
    public boolean updatePassword(String uname, String pass, String loginby, String logindate)
    {
        boolean flag=true;
        
        

        try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Update ceoinfo set Password='"+pass+"',Login_By='"+loginby+"',Login_Date='"+logindate+"' where Username='"+uname+"'";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          
            st.close();
        }

        catch(Exception e)
        {
            System.out.println("Exception in CEOProfileDBOperation Class in updatePassword method() is: "+e);
            flag=false;
        }




        return flag;
    }
    
   
    
}
