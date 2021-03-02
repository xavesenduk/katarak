/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katarak;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Katarak {
    static final int MY_MINIMUM = 0;
    static final int MY_MAXIMUM = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Splash s = new Splash();
        s.setVisible(true);
        int i;
        for(i = MY_MINIMUM; i <= MY_MAXIMUM; i++) {
            int percent = i;
            try {
                s.barProgress(percent);
                java.lang.Thread.sleep(100);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
}
