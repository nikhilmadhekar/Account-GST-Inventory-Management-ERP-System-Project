/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

/**
 *
 * @author Innovatus Tech
 */
public class ValidateInvoice
{
    
    
    public String isValidInvoiceNO(String str)
    {
        str=str.toUpperCase();
        String res="";
        
        if(str.isEmpty())
        {
            res="Invoice can not be empty \n Please Enter the Invoice number";
        }
        else if(str.length()>16)
        {
            res="Invoice Number can not be more than 16 Characters ";
        }
        else
        {
            boolean flag=false;
            for (int i = 0; i < str.length(); i++)
            {
                char ch=(char)str.charAt(i);
                int x=(int)ch;
                if(x>=48 && x<=57)
                {
                    flag=true;
                    break;
                }
                
            }
            if(flag==false)
            {
                res="Invoice Number Does not contain any Digits"; 
            }
                
            else
            {
            //-/
               boolean ff=true;
            for (int i = 0; i < str.length(); i++)
            {
                char ch=(char)str.charAt(i);
                int x=(int)ch;
                if((x>=65 && x<=90) || (x>=48 && x<=57) || (x==47) || (x==45) )
                {
//                    flag=true;
//                    break;
                }
                else
                {
                    ff=false;
                    break;
                }
                
                
            }
            if(ff==false)
            {
                res="Invalid Invoice number"; 
            }
                
            }
        }
        
        
        
        return res;
    }
}
