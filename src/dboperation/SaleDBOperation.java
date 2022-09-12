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
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author VOSTRO2557
 */
public class SaleDBOperation {
    
    
    
    
    public ArrayList getPartyNames()
    {
        ArrayList names=new ArrayList();
        try
           {
             Statement st= new DBDriver().getStatment();
             String query="Select *from partyinfo";
              ResultSet rs1=st.executeQuery(query);
         
             while(rs1.next())
            {

                ArrayList name=new ArrayList();
             String party=rs1.getString(1);
             String gst=rs1.getString(9);
            
             //names.toLowerCase();
             name.add(party);
             name.add(gst);
             names.add(name);
             
             
            }
             st.close();
             
                  
              }
              
           catch (Exception e)
           {
               System.out.println("Exception in SaleDBOperation Class and mathod is getPartyNames(): "+e);
           }
       
        return names;
        
    }
    
      public ArrayList getCostCentersNames()
    {
        ArrayList costcentre=new ArrayList();
        try
           {
             Statement st= new DBDriver().getStatment();
             String query="Select *from homecompanyinfo";
              ResultSet rs1=st.executeQuery(query);
              
              costcentre.add("Select");
         
             while(rs1.next())
            {

               
              String centers=rs1.getString(16);
              String str[]=centers.split(",");
               for (int i = 0; i <str.length; i++) 
               {
                   String name=str[i];
                   name=name.trim();
                   costcentre.add(name);
                   
               }
            
            
          
             
            }
             
            //   System.out.println("Cost Centers: "+costcentre);
             st.close();
             
                  
              }
              
           catch (Exception e)
           {
               System.out.println("Exception in SaleDBOperation Class and methid is getPartyNames(): "+e);
           }
       
        return costcentre;
        
    }
    
   public ArrayList getPartyInfo(String pname)
    {

       ArrayList partyinfo=new ArrayList();

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
             String gstin=rs1.getString(9);
             String gstscode=rs1.getString(10);
             String ptype=rs1.getString(11);
             String bankdetails=rs1.getString(12);
             
            
   
              partyinfo.add(address);
              partyinfo.add(city);
              partyinfo.add(pin);
              partyinfo.add(state);
              partyinfo.add(gstin);
              partyinfo.add(gstscode);
              partyinfo.add(ptype);
              partyinfo.add(bankdetails);

              

            }
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation Class  and method is getPartyInfo (): "+e);

        }

       return partyinfo;
    }    
    
    public ArrayList getItemInfo(String itemname)
    {

       ArrayList iteminfo=new ArrayList();

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from iteminfo where Item_Name='"+itemname+"'";
              ResultSet rs1=st.executeQuery(query);
             
             if(rs1.next())
            {

             
             String pdescrip=rs1.getString(3);
             String hsnsaccode=rs1.getString(6);
             String gst=rs1.getString(7);
            
            
          //   String gstcode[]=gst.split("%");
              
              pdescrip=pdescrip.trim();
//              iteminfo.add(itemname);
              iteminfo.add(pdescrip);
              iteminfo.add(hsnsaccode);
              iteminfo.add(gst);
            

            }
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation Class and method getItemInfo() "+e);

        }

       return iteminfo;
    }    
    
    
    
     public ArrayList getItemMoreInfo(String itemname)
    {

       ArrayList iteminfo=new ArrayList();

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from iteminfo where Item_Name='"+itemname+"'";
              ResultSet rs1=st.executeQuery(query);
             
             if(rs1.next())
            {

             
             String pdescrip=rs1.getString(3);
             String hsnsaccode=rs1.getString(6);
             String gst=rs1.getString(7);
            
            
          //   String gstcode[]=gst.split("%");
              
              pdescrip=pdescrip.trim();
              iteminfo.add(itemname);
              iteminfo.add(pdescrip);
              iteminfo.add(hsnsaccode);
              iteminfo.add(gst);
            

            }
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation Class and method getItemInfo() "+e);

        }

       return iteminfo;
    }    
    
     public String getHomeCompanyGST()
    {

      String hcomgst="";

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from homecompanyinfo";
             
             ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

              hcomgst=rs1.getString(13);
            }
             st.close();
        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation Class  and method is getHomeCompanyGST() "+e);

        }
       return hcomgst;
    }    
    
    public boolean addSaleInfo(String pname, String gstin, String supplyplace, String stype, String ccentre, String saleref, String inum, String ponum, String idate, String ptdays, String pduedate, String iname, String idescrip, String hsnsaccode, String gstrate, String unit,String quantity, String rate, String amount, String discount,String taxamount, String cgst, String sgst, String igst,String total, String tiamount, String bdetails, String narration, String loginby, String logindate )
    {
        boolean flag=true;

        try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Insert into saleinfo values('"+pname+"','"+gstin+"','"+supplyplace+"','"+stype+"','"+ccentre+"','"+saleref+"','"+inum+"','"+ponum+"','"+idate+"','"+ptdays+"','"+pduedate+"' ,'"+iname+"','"+idescrip+"','"+hsnsaccode+"','"+gstrate+"','"+unit+"','"+quantity+"', '"+rate+"','"+amount+"','"+discount+"','"+taxamount+"','"+cgst+"','"+sgst+"','"+igst+"','"+total+"','"+tiamount+"','"+bdetails+"','"+narration+"','"+loginby+"','"+logindate+"')";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          
            st.close();

        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation Class and method is addSaleInfo(): "+e);
            flag=false;
        }




        return flag;
    }
    
     public boolean addGSTTableInfo(String pname, String inum, String gstrate,String taxamount, String cgst, String sgst, String igst )
    {
        boolean flag=true;

        try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Insert into gsttable values('"+pname+"','"+inum+"','"+gstrate+"','"+taxamount+"','"+cgst+"','"+sgst+"','"+igst+"')";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          st.close();

        }

        catch(Exception e)
        {
            System.out.println("Exeption in PurchaseDBOperation and method is addGSTTableInfo(): "+e);
            flag=false;
        }




        return flag;
    }
    
      public boolean addSearchSaleInfo(String pname, String gstin, String inum, String idate, String ivalue,String totaltaxamount, String cgst, String sgst, String igst,String paystatus, String loginby, String logindate)
    {
        boolean flag=true;

        try
        {
              //idate=idate.replaceAll("/","-");
              
             String []date1=idate.split("/");
             idate=date1[2]+"-"+date1[1]+"-"+date1[0];
             
          
            System.out.println("idate : "+idate);
             Statement st= new DBDriver().getStatment();
             String query="Insert into searchsaleinfo values('"+pname+"','"+gstin+"','"+inum+"','"+idate+"','"+ivalue+"','"+totaltaxamount+"','"+cgst+"','"+sgst+"','"+igst+"','"+paystatus+"','"+loginby+"','"+logindate+"')";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          st.close();

        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation and method is addSearchSaleInfo(): "+e);
            flag=false;
        }




        return flag;
    }
   
    
     
      public boolean updateGSTinfo(String pname, String inum, String gstrate,String taxamount, String cgst, String sgst, String igst)
    {
        boolean flag=true;
         try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Update gsttable set GST_Rate='"+gstrate+"',Taxable_Amount='"+taxamount+"',CGST='"+cgst+"',SGST='"+sgst+"',IGST='"+igst+"',CGST='"+cgst+"',SGST='"+sgst+"' ,IGST='"+igst+"'where Party_Name='"+pname+"' and Invoice_Num='"+inum+"'";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          st.close();

        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation and method is updateGSTinfo() "+e);
            flag=false;
        }
        
        return flag;
    }

      public boolean updateSearchSaleinfo(String pname, String gstin, String inum, String idate, String ivalue,String totaltaxamount, String cgst, String sgst, String igst,String paystatus, String loginby, String logindate)
    {
        boolean flag=true;
         try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Update searchsaleinfo set Party_Name='"+pname+"',GSTIN='"+gstin+"',Invoice_Date='"+idate+"',Invoice_Value='"+ivalue+"',Taxable_Amount='"+totaltaxamount+"',CGST='"+cgst+"',SGST='"+sgst+"' ,IGST='"+igst+"',Payment_Status='"+paystatus+"',Login_By='"+loginby+"',Login_Date='"+logindate+"'where Invoice_Number='"+inum+"'";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          st.close();

        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation and method is updateSearchSaleinfo() "+e);
            flag=false;
        }
        
        return flag;
    }
    
       public boolean updateSearchPaymentStatusinfo(String pname, String inum, String paystatus, String loginby, String logindate)
    {
        boolean flag=true;
         try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Update searchsaleinfo set Payment_Status='"+paystatus+"',Login_By='"+loginby+"',Login_Date='"+logindate+"'where Invoice_Number='"+inum+"' and Party_Name='"+pname+"'";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          st.close();

        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation and method is updateSearchPaymentStatusinfo() "+e);
            flag=false;
        }
        
        return flag;
    }
  
     
      public ArrayList getAllSearchSaleInfo()
    {

      ArrayList searchinfo=new ArrayList(); 
      int i=0;
       
       

        try
        {

              Statement st= new DBDriver().getStatment();             
              String query1="Select *from searchsaleinfo ";
//              inner join purchasepaymentinfo on Status";
              ResultSet rs1=st.executeQuery(query1);

             
             while(rs1.next())
            {

             
             ArrayList partyinfo=new ArrayList(); 
            
             String pname=  rs1.getString(1); 
             String gstin=  rs1.getString(2);
             String invoiceno=rs1.getString(3);
             String invoicedate=rs1.getString(4);
             String invoiceamount=rs1.getString(5);
             String taxableamount=rs1.getString(6);
             String cgst=rs1.getString(7);
             String sgst=rs1.getString(8);
             String igst=rs1.getString(9);
             String status=rs1.getString(10);
            
             String []date1=invoicedate.split("-");
             invoicedate=date1[2]+"/"+date1[1]+"/"+date1[0];
             
          
             
              partyinfo.add(Integer.toString(i+1));
              partyinfo.add(pname);
              partyinfo.add(gstin);
              partyinfo.add(invoiceno);
              partyinfo.add(invoicedate);
              partyinfo.add(invoiceamount);
              partyinfo.add(taxableamount);
              partyinfo.add(cgst);
              partyinfo.add(sgst);
              partyinfo.add(igst);
              partyinfo.add(status);
            
              
              searchinfo.add(partyinfo);
           
              i++;

            }
             st.close();
        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation and method is getAllSearchSaleInfo() "+e);

        }

       return searchinfo;
    }    
      
     
      public ArrayList getAllSaleInfo()
    {

      ArrayList searchinfo=new ArrayList(); 
      int i=0;
       
       

        try
        {

              Statement st= new DBDriver().getStatment();             
              String query1="Select *from saleinfo ";
//              inner join purchasepaymentinfo on Status";
              ResultSet rs1=st.executeQuery(query1);

             
             while(rs1.next())
            {

             
             ArrayList partyinfo=new ArrayList(); 
            
             String pname=  rs1.getString(1); 
             String gstin=  rs1.getString(2);
             String invoiceno=rs1.getString(7);
             String invoicedate=rs1.getString(9);
             String invoiceamount=rs1.getString(19);
             String taxableamount=rs1.getString(21);
             String cgst=rs1.getString(22);
             String sgst=rs1.getString(23);
             String igst=rs1.getString(24);
           //  String status=rs1.getString(7);
            
             String []date1=invoicedate.split("-");
             invoicedate=date1[2]+"/"+date1[1]+"/"+date1[0];
             
          
             
              partyinfo.add(Integer.toString(i+1));
              partyinfo.add(pname);
              partyinfo.add(gstin);
              partyinfo.add(invoiceno);
              partyinfo.add(invoicedate);
              partyinfo.add(invoiceamount);
              partyinfo.add(taxableamount);
              partyinfo.add(cgst);
              partyinfo.add(sgst);
              partyinfo.add(igst);
           //   partyinfo.add(descrip);
            //  partyinfo.add(paystatus);
              
              searchinfo.add(partyinfo);
           
              i++;

            }
             st.close();
        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation and method is getAllSaleInfo() "+e);

        }

       return searchinfo;
    }    
      
    
    public ArrayList getPartySaleInfo(String name, String inum)
    {

      ArrayList searchinfo=new ArrayList(); 
      int i=0;
       
       

        try
        {

              Statement st= new DBDriver().getStatment();             
              String query="Select *from saleinfo where Party_Name='"+name+"' and Invoice_Number='"+inum+"'";
              ResultSet rs1=st.executeQuery(query);

             
             while(rs1.next())
            {

             
             ArrayList partyinfo=new ArrayList(); 
            
             String pname=  rs1.getString(1); 
             String gstin=  rs1.getString(2);
             String supplyplace=rs1.getString(3);
             String purchasetype= rs1.getString(4);
             String ccentre=rs1.getString(5);
             String sref=rs1.getString(6);
             String invoiceno=rs1.getString(7);
             String pono=rs1.getString(8);
             String invoicedate=rs1.getString(9);
             String payternda=rs1.getString(10);
             String paydudate=rs1.getString(11);
             String iname=rs1.getString(12);
             String itdescr=rs1.getString(13);
             String hsncode=rs1.getString(14);
             String gstrate=rs1.getString(15);
             String unit=rs1.getString(16);
             String quan=rs1.getString(17);
             String rate=rs1.getString(18);
             String invoiceamount=rs1.getString(19);
             String disc=rs1.getString(20);
             String taxableamount=rs1.getString(21);
             String cgst=rs1.getString(22);
             String sgst=rs1.getString(23);
             String igst=rs1.getString(24);
             String total=rs1.getString(25);
             String bankdetails=rs1.getString(27);
             String naration=rs1.getString(28);
             String totalinvoiceamount=rs1.getString(26);
             
          
            
              partyinfo.add(pname);
              partyinfo.add(gstin);
              partyinfo.add(supplyplace);
              partyinfo.add(purchasetype);
              partyinfo.add(ccentre);
              partyinfo.add(sref);
              partyinfo.add(invoiceno);
              partyinfo.add(pono);
              partyinfo.add(invoicedate);
              partyinfo.add(payternda);
              partyinfo.add(paydudate);
              partyinfo.add(iname);
              partyinfo.add(itdescr);
              partyinfo.add(hsncode);
              partyinfo.add(gstrate);
              partyinfo.add(unit);
              partyinfo.add(quan);
              partyinfo.add(rate);
              partyinfo.add(invoiceamount);
              partyinfo.add(disc);
              partyinfo.add(taxableamount);
              partyinfo.add(cgst);
              partyinfo.add(sgst);
              partyinfo.add(igst);
              partyinfo.add(total);
              partyinfo.add(bankdetails);
              partyinfo.add(naration);
              partyinfo.add(totalinvoiceamount);
             
              
              searchinfo.add(partyinfo);
           
              i++;

            }
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation and method is getPartySaleInfo() "+e);

        }

       return searchinfo;
    }      

    
    public ArrayList getPartyGSTInfo(String pname, String inum)
    {

       ArrayList partygstinfo=new ArrayList();

        try
        {

             Statement st= new DBDriver().getStatment();
             String query="Select *from gsttable where Party_Name='"+pname+"' and Invoice_Num='"+inum+"'";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             ArrayList gstinfo=new ArrayList();    
             String gstrate=rs1.getString(3);
             String taxamount=rs1.getString(4);
             String cgst=rs1.getString(5);
             String sgst=rs1.getString(6);
             String igst=rs1.getString(7);
             
            
   
              gstinfo.add(gstrate);
              gstinfo.add(taxamount);
              gstinfo.add(cgst);
              gstinfo.add(sgst);
              gstinfo.add(igst);
              partygstinfo.add(gstinfo);

              

            }
             st.close();
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation Class  and method is getPartyGSTInfo (): "+e);

        }

       return partygstinfo;
    }    
    
    
     public boolean updateNewSaleinfo(String pname, String gstin, String supplyplace, String ptype, String ccentre, String saleref, String inum, String ponum, String idate, String ptdays, String pduedate, String iname, String idescrip, String hsnsaccode, String gstrate, String unit,String quantity, String rate, String amount, String discount,String taxamount, String cgst, String sgst, String igst,String total, String tiamount, String bdetails, String narration, String loginby, String logindate )
    {
        boolean flag=true;
         try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Update saleinfo set GSTIN='"+gstin+"',Place_of_Supply='"+supplyplace+"',Sale_Type='"+ptype+"',Cost_Centre='"+ccentre+"',Sale_Ref='"+saleref+"',PO_Number='"+ponum+"',Invoice_Date='"+idate+"',Payment_Term_Days='"+ptdays+"',Payment_Due_Date='"+pduedate+"',Item_Description='"+idescrip+"',HSN_SAC_Code='"+hsnsaccode+"',GST_Rate='"+gstrate+"',Unit='"+unit+"',Quantity='"+quantity+"',Rate='"+rate+"',Amount='"+amount+"',Discount='"+discount+"',Taxable_Amount='"+taxamount+"',CGST='"+cgst+"',SGST='"+sgst+"',IGST='"+igst+"',Total='"+total+"',Total_Invoice_Amount='"+tiamount+"',Bank_Details='"+bdetails+"',Narration='"+narration+"',Login_By='"+loginby+"',Login_Date='"+logindate+"'where Party_Name='"+pname+"' and Invoice_Number='"+inum+"'and Item_Name='"+iname+"'" ;
                                                                                                                                                                                                                                                                                                                                                                                                                                         
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
                        
                        st.close();
          

        }

        catch(Exception e)
        {
            System.out.println("Exception in updateNewSaleinfo() in SaleDBOperation Class is: "+e);
            flag=false;
        }
        
        return flag;
    }
     
     
     public void deleteInvoiceNumbers(String invoicenum)
     {
         try
        {
           
            
              Statement st= new DBDriver().getStatment();
             String query=" delete from searchsaleinfo where Invoice_Number='"+invoicenum+"'";

            
//            
            
            int x=st.executeUpdate(query);
           
            
        }
        
        catch(Exception e)
        {
            System.out.println("Exception in SaleDBOperation Class and Function is deleteInvoiceNumbers(): "+e);
           
        }
        
        
        
     }
     
     public ArrayList getAllSaleItemInfo()
    {

      ArrayList saleinfo=new ArrayList(); 
      int i=0;
       
       

        try
        {

              Statement st= new DBDriver().getStatment();             
              String query1="Select *from saleinfo ";
//              inner join purchasepaymentinfo on Status";
              ResultSet rs1=st.executeQuery(query1);

             
             while(rs1.next())
            {

             
             ArrayList temp=new ArrayList(); 
            
             String itemname=  rs1.getString(12); 
             itemname=itemname.toLowerCase();
             String tamount=  rs1.getString(25);
            
             temp.add(itemname);
             temp.add(tamount);
             
             saleinfo.add(temp);
             
            }
             st.close();
        }

        catch(Exception e)
        {
            System.out.println("Exeption in SaleDBOperation and method is getAllSaleItemInfo() "+e);

        }

       return saleinfo;
    }    
      
     
    
}
    
    
     

