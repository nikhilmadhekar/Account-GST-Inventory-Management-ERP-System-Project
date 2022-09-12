/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CeoGUI;
import java.applet.*;
import java.awt.*;
import java.util.ArrayList;



public class PurchaseChartApplet extends Applet
{
    public static ArrayList mas=new ArrayList();
    
    public static String message="";
    
    
	int n;
	String label[];
	int value[];
        
        String orgvalue[];

	public void init()
	{
            this.setSize(800, 480);
		n = mas.size();
		label = new String[n];
		value = new int[n];
                orgvalue=new String[n];
                int p=0;
                int max=300;
                ArrayList temp=(ArrayList) mas.get(0);
                String t=(String)temp.get(1);
                int big=Integer.parseInt(t);
                
                for (int i = 1; i < mas.size(); i++) 
                {
                ArrayList row=(ArrayList)mas.get(i);
                 String t1=(String)row.get(1);
                int val=Integer.parseInt(t1);
                if(val>big)
                    big=val;
                
                }
                
                for (int i = 0; i < mas.size(); i++) 
                {
                ArrayList row=(ArrayList)mas.get(i);
                String labstr=(String)row.get(0);
                label[i]=labstr;
                
                 String t1=(String)row.get(1);
                 orgvalue[i]=t1;
                int val=Integer.parseInt(t1);
                System.out.println("val: "+val);
                  val=(val*max)/ big;
                  
                    
                value[i]=val;
                
                }
                
      

	}

	public void paint(Graphics g)
	{
		Font font = new Font("Arial",Font.BOLD,15);
		g.setFont(font);
                
                int sx=0,sy=0;
		for(int i  = 0; i < n; i ++)
		{
			g.setColor(Color.BLUE);
			g.drawString(label[i], 20, i * 50 + 30);
			g.setColor(Color.RED);
			g.fillRect(200, i * 50 + 10, value[i], 40);
                        
                       
                       
			g.drawString(String.valueOf(orgvalue[i]) + "", 200+value[i]+50, i * 50 + 35);
                        sx=200;
                        sy=i * 50 + 10;
                        
                    //    System.out.println("sy "+sy);
		}
                
                sy=sy+100;

		
		g.setColor(Color.darkGray);

		font = new Font("Arial",Font.BOLD,20);
		g.setFont(font);
		g.drawString(message, sx, sy);
	}
}