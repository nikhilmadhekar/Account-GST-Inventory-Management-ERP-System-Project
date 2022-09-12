/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validation;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 2491
 */
public class Validator {
    
    public static String isValidUserName(String username)
    {
        
        String str="";
        if(username.isEmpty())
        {
                    str="Username Cannot be Empty";
                    
        }
        
        return str;
    }
    
     public static String isValidPassword(String pass)
    {
        
        String str="";
        if(pass.isEmpty())
        {
                    str="Password Cannot be Empty";
                    
        }
        
        return str;
    }
    
       public static String isValidConfirmPassword(String cpass)
    {
        
        String str="";
        if(cpass.isEmpty())
        {
                    str="Confirm Password Cannot be Empty";
                    
        }
        
        return str;
    }
    
   public static String isValidPasswords(String pass , String cpass)
    {
        
        String str="";
        if(!cpass.equals(pass))
        {
                    str="Password and Confirm Password Doesn't Match Please Try Again";
                    
        }
        
        return str;
    }
   
    public static String isValidName(String name)
    {
        
        String str="";
        if(name.isEmpty())
        {
                    str="Name Cannot be Empty";
                    
        }
        
        return str;
    }
    
    public static String isValidEmail(String email)
    {
            String str="";
        
        if(email.isEmpty())
        {
            
            str="Email ID Cannot be Empty";
        }
        else if(!email.contains("@"))
        {
            
                 str="Email ID does not contains '@' Please try Again";
            
        }
        else if(!email.contains("."))
        {
            
                 str="Email ID does not contains '.' Please try Again";
            
        }
        
        return str;
    }
       public static String isValidMobile(String mobile)
       {
           String str="";
           
           if(mobile.isEmpty())
           {
               str="Mobile Number Cannot be Empty";
               
           } 
           else if (mobile.length()!=10)
           {
               str="Mobile Number  should be of 10 Digits "; 
                     
           }  
           else if(isDigitMobileno(mobile))
           {
                str="Mobile Number is not Valid Please Try Again"; 
           }
           
           
           return str;
       }
       
         public static boolean isDigitMobileno(String mobile)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(mobile);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
         
         
         public static String isValidDateTime(String dt)
    {
        
        String str="";
        if(dt.isEmpty())
        {
                    str="Date/Time Cannot be Empty";
                    
        }
        
        return str;
    }
         public static String isValidAddress(String add)
    {
        
        String str="";
        if(add.isEmpty())
        {
                    str="Address Cannot be Empty";
                    
        }
        
        return str;
    }
         public static String isValidCity(String city)
    {
        
        String str="";
        if(city.isEmpty())
        {
                    str="City Cannot be Empty";
                    
        }
        
        return str;
    }
         
         public static String isValidPin(String pin)
    {
        
        String str="";
        if(pin.isEmpty())
        {
                    str="Pin Code Cannot be Empty";
                    
        }
        else if (pin.length()!=6)
           {
               str="Pin Code should be of 6 Digits "; 
                     
           } 
        else if (!isValidPinint(pin))
           {
               str="Pin Code is not Valid Please Try Again"; 
                     
           } 
        
        
        
        
        return str;
    }
 public static  boolean isValidPinint(String pin)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(pin);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
         
         public static String isValidNatureOB(String nob)
    {
        
        String str="";
        if(nob.isEmpty())
        {
                    str="Nature of Business  Cannot be Empty";
                    
        }
        
        return str;
    }
         
         
         public static String isValidRegNo(String reg)
    {
        
        String str="";
        if(reg.isEmpty())
        {
                    str="Registration Number  Cannot be Empty";
                    
        }
        else if (!isValidRegNumber(reg))
           {
               str="Registration Number is not Valid Please Try Again"; 
                     
           } 
        
        return str;
    }
         
         
         public static  boolean isValidRegNumber(String reg)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(reg);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
         
         
         public static String isValidPan(String pan)
    {
        
        String str="";
        if(pan.isEmpty())
        {
                    str="Pancard Number  Cannot be Empty";
                    
        }
        else if (pan.length()!=10)
           {
               str="Pancard Number is not Valid Please Try Again"; 
                     
           } 
        
        return str;
    }
         
         
         public static String isValidGST(String gst)
    {
        
        String str="";
        if(gst.isEmpty())
        {
                    str="GSTIN Number  Cannot be Empty";
                    
        }
        else if (gst.length()!=15)
           {
               str="GSTIN Number is not Valid Please Try Again"; 
                     
           } 
        
        return str;
    }
         
         public static String isValidBank(String bank)
    {
        
        String str="";
        if(bank.isEmpty())
        {
                    str="Bank Name Cannot be Empty";
                    
        }
       
        
        return str;
    }
         
         public static String isValidAcc(String acc)
    {
        
        String str="";
        if(acc.isEmpty())
        {
                    str="Account Number Cannot be Empty";
                    
        }
        else if(!isValidAccNumber(acc))
        {
                str="Account Number is not valid";
        }
        return str;
    }
         
          
          
  public static  boolean isValidAccNumber(String acc)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(acc);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
  
  
         public static String isValidIFSC(String ifsc)
    {
        
        String str="";
        if(ifsc.isEmpty())
        {
                    str="IFSC Code Cannot be Empty";
                    
        }
        else if(ifsc.length()!=11)
        {
                str="IFSC Code is not valid";
        }
        return str;
    }
         
         public static String isValidAccName(String name)
    {
        
        String str="";
        if(name.isEmpty())
        {
                    str="Account Name Cannot be Empty";
        }
       
        return str;
    }
          public static String isValidSearchParty(String party)
    {
        
        String str="";
        if(party.isEmpty())
        {
                    str="Search Party Cannot be Empty";
        }
       
        return str;
    }
          
           public static String isValidItemName (String itname)
    {
        
        String str="";
        if(itname.isEmpty())
        {
                    str="Item Name Cannot be Empty";
        }
       
        return str;
    }
         public static String isValidProDes (String des)
    {
        
        String str="";
        if(des.isEmpty())
        {
                    str="Product Description Cannot be Empty";
        }
       
        return str;
    }
         
          public static String isValidHsnSac (String hsnsac)
    {
        
        String str="";
        if(hsnsac.isEmpty())
        {
                    str="HSN/SAC Cannot be Empty";
        }
        else if(!isDigitHsnSac(hsnsac))
        {
            str="HSN/SAC is not Valid";
        }
        else if(hsnsac.length()!=6)
        {
            str="HSN/SAC is not Valid";
        }
       
        return str;
    }
          
          public static  boolean isDigitHsnSac(String hsnsac)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(hsnsac);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
          
          
          public static String isValidInvoice(String invoice)
    {
        
        String str="";
        if(invoice.isEmpty())
        {
                    str="Invoice Number Cannot be Empty";
        }
        else if(!isDigitHsnSac(invoice))
        {
            str="Invoice Number is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitInvoice(String hsnsac)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(hsnsac);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
           public static String isValidPno(String pno)
    {
        
        String str="";
        if(pno.isEmpty())
        {
                    str="PNO Number Cannot be Empty";
        }
        else if(!isDigitPno(pno))
        {
            str="PNO Number is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitPno(String pno)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(pno);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
           
            public static String isValidPaymentDays(String days)
    {
        
        String str="";
        if(days.isEmpty())
        {
                    str="Days Cannot be Empty";
        }
        else if(!isDigitDays(days))
        {
            str="PNO Number is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitDays(String days)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(days);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
           
            public static String isValidPaymentDue(String due)
    {
        
        String str="";
        if(due.isEmpty())
        {
                    str="Payment Due Cannot be Empty";
        }
        else if(!isDigitDue(due))
        {
            str="Payment Due is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitDue(String due)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(due);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
             public static String isValidQuantity(String qu)
    {
        
        String str="";
        if(qu.isEmpty())
        {
                    str="Quantity Cannot be Empty";
        }
        else if(!isDigitQua(qu))
        {
            str="Quantity is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitQua(String qu)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(qu);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
           public static String isValidRate(String rate)
    {
        
        String str="";
        if(rate.isEmpty())
        {
                    str="Rate Cannot be Empty";
        }
        else if(!isDigitQua(rate))
        {
            str="Rate is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitRate(String rate)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(rate);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
           public static String isValidAmt(String amt)
    {
        
        String str="";
        if(amt.isEmpty())
        {
                    str="Amount Cannot be Empty";
        }
        else if(!isDigitAmt(amt))
        {
            str="Amount is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitAmt(String amt)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(amt);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
           
           
           public static String isValidDis(String dis)
    {
        
        String str="";
        if(dis.isEmpty())
        {
                    str="Discount Cannot be Empty";
        }
        else if(!isDigitAmt(dis))
        {
            str="Discount is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitDis(String dis)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(dis);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
           
           public static String isValidTaxAmt(String tamt)
    {
        
        String str="";
        if(tamt.isEmpty())
        {
                    str="Tax Amount Cannot be Empty";
        }
        else if(!isDigitAmt(tamt))
        {
            str="Tax Amount is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitTaxAmt(String ta)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(ta);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
           
            public static String isValidCGSt(String cgst)
    {
        
        String str="";
        if(cgst.isEmpty())
        {
                    str="CGST Cannot be Empty";
        }
        else if(!isDigitAmt(cgst))
        {
            str="CGST is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitCGST(String cgst)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(cgst);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
           
           
            public static String isValidSGSt(String cgst)
    {
        
        String str="";
        if(cgst.isEmpty())
        {
                    str="SGST Cannot be Empty";
        }
        else if(!isDigitAmt(cgst))
        {
            str="SGST is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitSGST(String cgst)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(cgst);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
            public static String isValidIGSt(String cgst)
    {
        
        String str="";
        if(cgst.isEmpty())
        {
                    str="IGST Cannot be Empty";
        }
        else if(!isDigitAmt(cgst))
        {
            str="IGST is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitIGST(String cgst)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(cgst);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
           
           
            public static String isValidTotal(String total)
    {
        
        String str="";
        if(total.isEmpty())
        {
                    str="Total Cannot be Empty";
        }
        else if(!isDigitAmt(total))
        {
            str="Total is not Valid";
        }
    
        return str;
    }
          
           public static  boolean isDigitTotal(String cgst)
       {
           boolean flag=false;
              try
                  {
                      
                      long num=Long.parseLong(cgst);
                      flag=true;
                      
                  }
                  catch(Exception ex)
                  {
                      
                  }
             
               return flag; 
           }
           
             
}
