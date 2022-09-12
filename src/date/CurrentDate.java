/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.*;

 public class CurrentDate
{
public String getDate()
 {
 Calendar cal = Calendar.getInstance();
 DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
 String p=dateFormat.format(cal.getTime());
 // System.out.println("Today's date is "+p);
  return p;
}
}