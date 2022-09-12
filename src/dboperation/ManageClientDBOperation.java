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
public class ManageClientDBOperation {
    
   
    
    public boolean addPartyInfo(String name, String add, String city, String pin, String state, String mob, String email, String pan, String gst, String gstscode, String ptype, String bankdetails, String cpname, String cpmob, String cpemail, String loginby, String logindate)
    {
        boolean flag=true;

        try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Insert into partyinfo values('"+name+"','"+add+"','"+city+"','"+pin+"','"+state+"','"+mob+"','"+email+"' ,'"+pan+"','"+gst+"','"+gstscode+"','"+ptype+"','"+bankdetails+"', '"+cpname+"','"+cpmob+"','"+cpemail+"','"+loginby+"','"+logindate+"')";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          
            st.close();

        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManagePartyDBOperation Class is in addPartyInfo(): "+e);
            flag=false;
        }




        return flag;
    }
    
    
   
    
    
    public ArrayList getPartyInfo(String pname)
    {

       ArrayList hcinfo=new ArrayList();

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from partyinfo where Name='"+pname+"'";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             String address=rs1.getString(2);
             String city=rs1.getString(3);
             String pin=rs1.getString(4);
             String state=rs1.getString(5);
             String mob=rs1.getString(6);
             String email=rs1.getString(7);
             String pan=rs1.getString(8);
             String gst=rs1.getString(9);
             String gstscode=rs1.getString(10);
             String ptype=rs1.getString(11);
             String bankdetails=rs1.getString(12);
             String cpname=rs1.getString(13);
             String cpmob=rs1.getString(14);
             String cpemail=rs1.getString(15);
             
             
            
              
              hcinfo.add(address);
              hcinfo.add(city);
              hcinfo.add(pin);
              hcinfo.add(state);
              hcinfo.add(mob);
              hcinfo.add(email);
              hcinfo.add(pan);
              hcinfo.add(gst);
              hcinfo.add(gstscode);
              hcinfo.add(ptype);
              hcinfo.add(bankdetails);
              hcinfo.add(cpname);
              hcinfo.add(cpmob);
              hcinfo.add(cpemail);

            }
              st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManagePartyDBOperation Class is in getPartyInfo(): "+e);

        }

       return hcinfo;
    }    
    
    
     public boolean updatePartyinfo(String name, String add, String city, String pin, String state, String mob, String email, String pan, String gst, String gstscode, String ptype, String bankdetails, String cpname, String cpmob, String cpemail, String loginby, String logindate)
    {
        boolean flag=true;
         try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Update partyinfo set Address='"+add+"',City='"+city+"',Pin='"+pin+"',State='"+state+"',Contact_Number='"+mob+"',Email_Id='"+email+"',PAN_Number='"+pan+"' ,GSTIN='"+gst+"',GST_State_Code='"+gstscode+"',Party_Type='"+ptype+"',Bank_Details='"+bankdetails+"',Contact_Person_Name='"+cpname+"',Contact_Person_Number='"+cpmob+"',Contact_Person_Email='"+cpemail+"',Login_By='"+cpemail+"',Login_Date='"+cpemail+"'where Name='"+name+"'";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
            
             st.close();
          

        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManagePartyDBOperation Class is in updatePartyinfo(): "+e);
            flag=false;
        }
        
        return flag;
    }
     
     public boolean deletePartyinfo(String pname)
    {
        boolean flag=true;
        
        try
        {
            
            
              Statement st= new DBDriver().getStatment();
             String query=" delete from partyinfo where Name='"+pname+"'";

            
//            
            
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
            
             st.close();
            
        }
        
        catch(Exception e)
        {
            System.out.println("Exeption in ManagePartyDBOperation Class is in deletePartyinfo(): "+e);
            flag=false;
        }
        
        
        
        
        return flag;
    }
     
     
      public ArrayList getAllPartyInfo()
    {

      ArrayList searchinfo=new ArrayList();       
       
       int i=0;

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from partyinfo";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             ArrayList partyinfo=new ArrayList(); 
             String pname=  rs1.getString(1); 
             String address=rs1.getString(2);
             String mob=rs1.getString(6);
             String email=rs1.getString(7);
             String gst=rs1.getString(9);
             String gstscode=rs1.getString(10);
             String bankdetails=rs1.getString(12);
             
             String banks="";
             if(!bankdetails.equals("No Bank Info"))
             {
                 String[] str = bankdetails.split("#");
                 String details = str[0];

                 String[] str1 = details.split(",");

                  banks = str1[1] + "," + str1[0];
                 
             }
             else
             {
                 banks=bankdetails;
             }
             
             
             
                
             
             
            
              partyinfo.add(Integer.toString(i+1));
              partyinfo.add(pname);
              partyinfo.add(address);
              partyinfo.add(mob);
              partyinfo.add(email);
              partyinfo.add(gst);
              partyinfo.add(gstscode);
              partyinfo.add(banks);
              
              searchinfo.add(partyinfo);
              
              i++;

            }
              st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManagePartyDBOperation Class is in getAllPartyInfo(): "+e);

        }

       return searchinfo;
    }    
      
      public ArrayList getPartyGSTInfo(String gstnum)
    {

      ArrayList searchinfo=new ArrayList();       
       
       int i=0;

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from partyinfo where GSTIN='"+gstnum+"'";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             ArrayList partyinfo=new ArrayList(); 
             
             String pname=  rs1.getString(1); 
             String address=rs1.getString(2);
             String mob=rs1.getString(6);
             String email=rs1.getString(7);
             String gst=rs1.getString(9);
             String gstscode=rs1.getString(10);
             String bankdetails=rs1.getString(12);
            
              partyinfo.add(Integer.toString(i+1));
              partyinfo.add(pname);
              partyinfo.add(address);
              partyinfo.add(mob);
              partyinfo.add(email);
              partyinfo.add(gst);
              partyinfo.add(gstscode);
              partyinfo.add(bankdetails);
              
              searchinfo.add(partyinfo);

            }
             
              st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManagePartyDBOperation Class is in getPartyGSTInfo(): "+e);

        }

       return searchinfo;
    }    
}
    
    
     

