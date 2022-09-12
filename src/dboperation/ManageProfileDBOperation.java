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
public class ManageProfileDBOperation {
    
    public boolean checkPassword(String pass)
    {
        boolean flag=true;

        try
        {

            Statement st= new DBDriver().getStatment();

            String query="Select * from managerinfo where password='"+pass+"'";

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
            System.out.println("Exeption in ManageProfileDBOperation Class in checkPassword method() is: "+e);
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
             String query="Update managerinfo set Password='"+pass+"',Login_By='"+loginby+"',Login_Date='"+logindate+"' where Username='"+uname+"'";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          
            st.close();
        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManageProfileDBOperation Class in updatePassword method() is: "+e);
            flag=false;
        }




        return flag;
    }
    
    public boolean createNewStaff(String name, String dob, String mob, String email, String uname, String pass, String datetime, String loginby, String logindate)
    {
        boolean flag=true;

        try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Insert into newstaffinfo values('"+name+"','"+dob+"','"+mob+"','"+email+"','"+uname+"','"+pass+"','"+datetime+"','"+loginby+"','"+logindate+"')";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          
            st.close();

        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManageProfileDBOperation Class in createNewStaff() is: "+e);
            flag=false;
        }




        return flag;
    }
    
    
    public ArrayList getAllStaffName()
    {

       ArrayList staffname=new ArrayList();

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from newstaffinfo";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             String name=rs1.getString(1);
            
              
              
            staffname.add(name);
            

            }
             
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManageProfileDBOperation Class in getAllStaffName method () is: "+e);

        }

       return staffname;
    }    
    
    
    public ArrayList getStaffInfo(String staffusername)
    {

       ArrayList staffinfo=new ArrayList();

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from newstaffinfo where Username='"+staffusername+"'";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {
            String name=rs1.getString(1);
             String dob=rs1.getString(2);
             String mob=rs1.getString(3);
             String email=rs1.getString(4);
             String username=rs1.getString(5);
               String datetime=rs1.getString(7);
               String password=rs1.getString(6);
            
                staffinfo.add(name);
            staffinfo.add(dob);
            staffinfo.add(mob);
            staffinfo.add(email);
            staffinfo.add(username);
            staffinfo.add(datetime);
              staffinfo.add(password);

            }
             
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManageProfileDBOperation Class is in getStaffInfo() method : "+e);

        }

       return staffinfo;
    }    
    
    
     public boolean updateStaffinfo(String name, String dob, String mob, String email, String uname, String pass, String datetime, String loginby, String logindate)
    {
        boolean flag = true;
        try {

            Statement st = new DBDriver().getStatment();
            String query = "Update newstaffinfo set Date_of_Birth='" + dob + "',Mobile_Number='" + mob + "',Email_Id='" + email + "',Password='" + pass + "',Date_Time='" + datetime + "',Login_By='" + loginby + "',Login_Date='" + logindate + "',Name='" + name + "' where Username='" + uname + "'";
            int x = st.executeUpdate(query);

            if (x > 0) {
                flag = true;
            } else {
                flag = false;
            }

            st.close();
        } catch (Exception e) {
            System.out.println("Exeption in ManageProfileDBOperation Class is in updateStaffinfo() method : " + e);
            flag = false;
        }


        return flag;
    }
     
      public ArrayList getAllStaffInfo()
    {

       ArrayList staffinfo=new ArrayList();

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from newstaffinfo";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             ArrayList temp=new ArrayList();   
             String name=rs1.getString(1);
             String dob=rs1.getString(2);
             String mob=rs1.getString(3);
             String email=rs1.getString(4);
             String uname=rs1.getString(5);
             String pass=rs1.getString(6);
             String datetime=rs1.getString(7);
             
            
             temp.add(name);
             temp.add(dob);
             temp.add(mob);
             temp.add(email);
             temp.add(uname);
             temp.add(pass);
             temp.add(datetime);
             
           
              
              
            staffinfo.add(temp);
            

            }
             
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManageProfileDBOperation Class in getAllStaffInfo() method is: "+e);

        }

       return staffinfo;
    }    
      
       public boolean insertStaffLoginDetails(String uname, String logindatetime, String logoutdatetime)
    {
        boolean flag=true;

        try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Insert into staffreport values('"+uname+"','"+logindatetime+"','"+logoutdatetime+"')";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          
            st.close();

        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManageProfileDBOperation Class in insertStaffLoginDetails() is: "+e);
            flag=false;
        }




        return flag;
    }
       
        public ArrayList getAllStaffReportInfo()
    {

       ArrayList staffinfo=new ArrayList();

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from staffreport";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             ArrayList temp=new ArrayList();   
             String uname=rs1.getString(1);
             String logindatetime=rs1.getString(2);
             String logoutdatetime=rs1.getString(3);
            
             
            
             temp.add(uname);
             temp.add(logindatetime);
             temp.add(logoutdatetime);
          
              
            staffinfo.add(temp);
            

            }
             
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exception in ManageProfileDBOperation Class in getAllStaffReportInfo() method is: "+e);

        }

       return staffinfo;
    }    
    
}
