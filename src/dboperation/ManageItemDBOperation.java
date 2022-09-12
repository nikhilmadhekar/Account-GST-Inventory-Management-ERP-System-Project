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
public class ManageItemDBOperation {
    
   
    
    public boolean addItemInfo(String type, String iname, String pdescrip, String unit1, String unit2, String hsnsac, String gstrate)
    {
        boolean flag=true;

        try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Insert into iteminfo values('"+type+"','"+iname+"','"+pdescrip+"','"+unit1+"','"+unit2+"','"+hsnsac+"' ,'"+gstrate+"')";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
            
            st.close();
          

        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManageItemDBOperation Class is in addItemInfo(): "+e);
            flag=false;
        }




        return flag;
    }
    
    
    public ArrayList getAllItemInfo()
    {

      ArrayList searchinfo=new ArrayList();       
       
      

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from iteminfo";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             ArrayList iteminfo=new ArrayList(); 
             String type=  rs1.getString(1); 
             String itemname=rs1.getString(2);
             String pdescrip=rs1.getString(3);
             String unit1=rs1.getString(4);
             String unit2=rs1.getString(5);
             String hsnsaccode=rs1.getString(6);
             String gst=rs1.getString(7);
             
            
              
              iteminfo.add(type);
              iteminfo.add(itemname);
              iteminfo.add(pdescrip);
              iteminfo.add(unit1);
              iteminfo.add(unit2);
              iteminfo.add(hsnsaccode);
              iteminfo.add(gst);
              
              searchinfo.add(iteminfo);
              

            }
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManageItemDBOperation Class is in getAllItemInfo(): "+e);

        }

       return searchinfo;
    }    
    
    
    public ArrayList getItemInfo(String itemname)
    {

       ArrayList iteminfo=new ArrayList();

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from iteminfo where Item_Name='"+itemname+"'";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             String type=  rs1.getString(1); 
             String iname=rs1.getString(2);
             String pdescrip=rs1.getString(3);
             String unit1=rs1.getString(4);
             String unit2=rs1.getString(5);
             String hsnsaccode=rs1.getString(6);
             String gst=rs1.getString(7);
            
              
              iteminfo.add(type);
              iteminfo.add(itemname);
              iteminfo.add(pdescrip);
              iteminfo.add(unit1);
              iteminfo.add(unit2);
              iteminfo.add(hsnsaccode);
              iteminfo.add(gst);

            }
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManageItemDBOperation Class is in getItemInfo(): "+e);

        }

       return iteminfo;
    }    
    
    
     public boolean updateIteminfo(String type, String iname, String pdescrip, String unit1, String unit2, String hsnsac, String gstrate)
    {
        boolean flag=true;
         try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Update iteminfo set Type='"+type+"',Product_Description='"+pdescrip+"',Unit_1='"+unit1+"',Unit_2='"+unit2+"',HSN_SAC_Code='"+hsnsac+"' ,GST_Rate='"+gstrate+"'where Item_Name='"+iname+"'";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
            
            st.close();
          

        }

        catch(Exception e)
        {
            System.out.println("Exeption in ManageItemDBOperation Class is in updateIteminfo(): "+e);
            flag=false;
        }
        
        return flag;
    }
     
     public boolean deleteIteminfo(String iname)
    {
        boolean flag=true;
        
        try
        {
            
            
              Statement st= new DBDriver().getStatment();
             String query=" delete from iteminfo where Item_Name='"+iname+"'";

            
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
            System.out.println("Exeption in ManageItemDBOperation Class is in deleteIteminfo(): "+e);
            flag=false;
        }
        
        
        
        
        return flag;
    }
     
     
      
}
    
    
     

