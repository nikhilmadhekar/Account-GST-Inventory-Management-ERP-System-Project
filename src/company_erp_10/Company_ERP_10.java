/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_erp_10;

import ManagerGUI.LoginFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.UIManager;


public class Company_ERP_10 {

    public static void main(String[] args) {
        try {
    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            LoginFrame l = new LoginFrame();
            l.setSize(d);
            l.revalidate();
            l.setVisible(true);
               
        }
       
    }
} catch (Exception e) {
    // If Nimbus is not available, fall back to cross-platform
    try {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    } catch (Exception ex) {
        // not worth my time
    }
}
    }
    }
    
