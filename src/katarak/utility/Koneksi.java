/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katarak.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Koneksi {
    public Connection con;
    public Statement stm;
    private static String hashfin;
    private static String mkfin;
    private static String mhsfin;
    private static String actpnlfin = "pilihmk";
    private static String ketkoneksi;
    private static String refreshcmb;
    
    public static LoadGUI memuat = new LoadGUI();
    
    // 1 untuk online, 2 untuk offline
    // 1. jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12328086", "sql12328086", "D5qmAqGle1"
    // 2. jdbc:mysql://localhost:3300/katarak", "root", ""
    public void config() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3300/katarak", "root", "");
            stm = con.createStatement();
            ketkoneksi = "Database terkoneksi";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal. Pesan error : " + e.getMessage());
            ketkoneksi = "Database tidak terkoneksi";
        }
    }
    
    public void setSession(String hash) {
        this.hashfin = hash;
    }
    
    public String getSession() {
        return hashfin;
    }
    
    public void setSelectedMK(String mkpilih) {
        this.mkfin = mkpilih;
    }
    
    public String getSelectedMK() {
        return mkfin;
    }
    
    public void setSelectedMhs(String mhspilih) {
        this.mhsfin = mhspilih;
    }
    
    public String getSelectedMhs() {
        return mhsfin;
    }
    
    public void setActivePanel(String actpnl) {
        this.actpnlfin = actpnl;
    }
    
    public String getActivePanel() {
        return actpnlfin;
    }
    
    public String getConStatus() {
        return ketkoneksi;
    }
    
    public void setRefreshCmb(String refresh) {
        this.refreshcmb = refresh;
    }
    
    public String getRefreshCmb() {
        return refreshcmb;
    }
}