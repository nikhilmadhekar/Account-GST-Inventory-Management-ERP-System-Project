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
public class PurchaseGraphChart
{
    
    public void intiateSimulation()
    {
        
           PurchaseChartApplet theApplet = new PurchaseChartApplet();
        theApplet.init();         // Needed if overridden in applet
        theApplet.start();        // Needed if overridden in applet


        JFrame window = new JFrame(PurchaseChartApplet.message);
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
