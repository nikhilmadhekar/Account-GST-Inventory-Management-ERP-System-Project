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
public class StockDBOperation {
    
    public boolean insertStockInfo(String iname, String hsncode, String quantity, String unit)
    {
        boolean flag=true;

        try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Insert into stockinfo values('"+iname+"','"+hsncode+"','"+quantity+"','"+unit+"')";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          

        }

        catch(Exception e)
        {
            System.out.println("Exeption in StockDBOperation Class is: "+e);
            flag=false;
        }




        return flag;
    }
    
    
    public boolean updateStockinfo(String itemname, String hsncode, String quantity,String unit)
    {
        boolean flag=true;
         try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Update stockinfo set HSN_Code='"+hsncode+"',Quantity='"+quantity+"',Unit='"+unit+"'where Item_Name='"+itemname+"'";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          st.close();

        }

        catch(Exception e)
        {
            System.out.println("Exception in StockDBOperation and method is updateStockinfo() "+e);
            flag=false;
        }
        
        return flag;
    }
    
    public ArrayList getAllStockinfo()
    {

       ArrayList stockinfo=new ArrayList();
       int i=0;

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from stockinfo";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             ArrayList temp=new ArrayList();   
             String iname=rs1.getString(1);
             String hsncode=rs1.getString(2);
             String quan=rs1.getString(3);
             String unit=rs1.getString(4);
                          
            
             temp.add(Integer.toString(i+1));
             temp.add(iname);
             temp.add(hsncode);
             temp.add(quan);
             temp.add(unit);
             stockinfo.add(temp);
             i++;

            }
             
        }

        catch(Exception e)
        {
            System.out.println("Exception in StockDBOperation Class is: "+e);

        }

       return stockinfo;
    }    
    
    public ArrayList getStockinfo()
    {

       ArrayList stockinfo=new ArrayList();
       int i=0;

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from stockinfo";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             ArrayList temp=new ArrayList();   
             String iname=rs1.getString(1);
             String hsncode=rs1.getString(2);
             String quan=rs1.getString(3);
             String unit=rs1.getString(4);
             
             String aunit[]=unit.split(":");
                          
            
             temp.add(Integer.toString(i+1));
             temp.add(iname);
             temp.add(hsncode);
             temp.add(quan);
             temp.add(aunit[1]);
             stockinfo.add(temp);
             i++;

            }
             
        }

        catch(Exception e)
        {
            System.out.println("Exception in StockDBOperation Class is: "+e);

        }

       return stockinfo;
    }    
    
    
}
