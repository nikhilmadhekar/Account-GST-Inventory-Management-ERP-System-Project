

package dbdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBDriver 
{
   
    public Statement getStatment()
    {
       
    Statement st=null;
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/accountsoftware", "root", "root");
            st = conn.createStatement();
            
           
            
         }
        
        catch(Exception e)
        {
            System.out.println("Exeption in DBDriver Class is: "+e);
           
        }
        
        
        
       return  st;
      
    
    }
    
     
    public Connection getConnection()
    {
       
  Connection conn=null;
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountsoftware", "root", "root");
            
            
         }
        
        catch(Exception e)
        {
            System.out.println("Exeption in DBDriver Class is: "+e);
           
        }
        
        
        
       return  conn;
      
    
    }
    
}
