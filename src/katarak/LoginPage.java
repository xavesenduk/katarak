/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katarak;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import katarak.utility.Koneksi;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class LoginPage extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    int posX=0,posY=0;
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        String psnkoneksi = DB.getConStatus();
        LblPsnKoneksi.setText(psnkoneksi);
        if(psnkoneksi=="Database terkoneksi") {
            LblPsnKoneksi.setForeground(Color.green);
        }
        
        this.pack();
        this.setLocationRelativeTo(null);
        
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                posX=e.getX();
                posY=e.getY();
            }
        });
        
        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent evt) {
                setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
            }
        });
        
        InputNIP.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                    LoginButton();
                }
            }
        });
        
        InputPass.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                LblPsnLogin.setText("");
                if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                    LoginButton();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InputNIP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BtnNewAcc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BtnFrgtPass = new javax.swing.JButton();
        LblPsnLogin = new javax.swing.JLabel();
        LblPsnKoneksi = new javax.swing.JLabel();
        InputPass = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Katarak");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/katarak/images/appicon.png")).getImage());
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InputNIP.setBackground(new java.awt.Color(255, 255, 255));
        InputNIP.setToolTipText("");
        jPanel1.add(InputNIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 269, -1));

        jLabel3.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nomor Induk Pegawai");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Kata Sandi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        BtnLogin.setBackground(new java.awt.Color(255, 204, 0));
        BtnLogin.setFont(new java.awt.Font("Quicksand Medium", 1, 12)); // NOI18N
        BtnLogin.setText("Masuk >");
        BtnLogin.setBorderPainted(false);
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Quicksand", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Login");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        BtnExit.setBackground(new java.awt.Color(255, 0, 0));
        BtnExit.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        BtnExit.setForeground(new java.awt.Color(255, 255, 255));
        BtnExit.setText("X");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 6, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnNewAcc.setBackground(new java.awt.Color(0, 51, 102));
        BtnNewAcc.setFont(new java.awt.Font("Quicksand Medium", 1, 12)); // NOI18N
        BtnNewAcc.setForeground(new java.awt.Color(255, 255, 255));
        BtnNewAcc.setText("Buat Akun");
        BtnNewAcc.setBorderPainted(false);
        BtnNewAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewAccActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNewAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 22, -1, -1));

        jLabel4.setFont(new java.awt.Font("Quicksand", 1, 8)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Buatlah akun baru jika ini pertama kali anda masuk");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 6, -1, -1));

        BtnFrgtPass.setBackground(new java.awt.Color(0, 51, 102));
        BtnFrgtPass.setFont(new java.awt.Font("Quicksand Medium", 1, 12)); // NOI18N
        BtnFrgtPass.setForeground(new java.awt.Color(255, 255, 255));
        BtnFrgtPass.setText("Lupa Password");
        BtnFrgtPass.setBorderPainted(false);
        BtnFrgtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFrgtPassActionPerformed(evt);
            }
        });
        jPanel2.add(BtnFrgtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 22, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 380, 70));

        LblPsnLogin.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        LblPsnLogin.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(LblPsnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 210, 20));

        LblPsnKoneksi.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        LblPsnKoneksi.setForeground(new java.awt.Color(255, 0, 0));
        LblPsnKoneksi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(LblPsnKoneksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 250, 20));

        InputPass.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(InputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 270, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 380, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Quicksand Light", 0, 68)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("rak");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("temuKAn daTa mahasiswA yang mengontRAK");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Quicksand Light", 0, 68)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("kata");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 140));

        jLabel8.setFont(new java.awt.Font("Quicksand", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Excelsis Deo Lukow (19021106024)");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Quicksand", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("2020");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Quicksand", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Fransiscus Xaverius Senduk (19021106039)");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Quicksand", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Christian Cleavy Sunkudon (19021106038)");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Quicksand", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Mata Kuliah Pengembangan Sistem Perangkat Lunak");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Quicksand", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("yang diampu oleh Stanley D. S. Karouw, S.T, M.TI");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel14.setFont(new java.awt.Font("Quicksand", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Program Studi Teknik Informatika");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Quicksand", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Fakultas Teknik");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel16.setFont(new java.awt.Font("Quicksand", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Universitas Sam Ratulangi");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel17.setFont(new java.awt.Font("Quicksand", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Manado");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNewAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewAccActionPerformed
        new NewAccPage().setVisible(true);
    }//GEN-LAST:event_BtnNewAccActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        LoginButton();
    }//GEN-LAST:event_BtnLoginActionPerformed

    public void LoginButton() {
        try {
            sql = "SELECT * FROM dosen WHERE nip='"+InputNIP.getText()+"' AND pass='"+InputPass.getText()+"'";
            rs = stat.executeQuery(sql);
            if (InputNIP.getText().equals("") || InputPass.getText().equals("")) {
                LblPsnLogin.setText("Masukkan NIP dan password!");
            } else {
                String hash = InputNIP.getText();
                Koneksi nip = new Koneksi();
                if (rs.next()) {
                    if (InputNIP.getText().equals(rs.getString("nip")) && InputPass.getText().equals(rs.getString("pass"))) {
                        JOptionPane.showMessageDialog(null, "Berhasil login " + hash + "!");
                        nip.setSession(hash);
                        new MainWelPage().setVisible(true);
                        this.setVisible(false);
                    }
                } else {
                    LblPsnLogin.setText("NIP atau password salah!");
                }
            }
        } catch (Exception e) {
            String error = e.getMessage();
            if(error==null) {
                LblPsnLogin.setText("Koneksikan database!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan dengan error : " + error);
            }
        }
    }
    
    private void BtnFrgtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFrgtPassActionPerformed
        new FgtPassPage().setVisible(true);
    }//GEN-LAST:event_BtnFrgtPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnFrgtPass;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton BtnNewAcc;
    public javax.swing.JTextField InputNIP;
    private javax.swing.JPasswordField InputPass;
    private javax.swing.JLabel LblPsnKoneksi;
    private javax.swing.JLabel LblPsnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}