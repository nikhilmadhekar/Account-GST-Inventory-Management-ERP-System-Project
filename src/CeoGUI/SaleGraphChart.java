/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CeoGUI;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class SaleGraphChart
{
    
    public void intiateSimulation()
    {
        
           SaleChartApplet theApplet = new SaleChartApplet();
        theApplet.init();         // Needed if overridden in applet
        theApplet.start();        // Needed if overridden in applet


        JFrame window = new JFrame(SaleChartApplet.message);
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.pack();
        //System.out.println(theApplet.getSize());
        window.setSize(1000, 600);
        window.setLocationRelativeTo(null);
        //window.setLocation(0,50);
        window.setVisible(true);
    }
}
