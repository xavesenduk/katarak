/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katarak;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import katarak.utility.Koneksi;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class NewAccPage extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    String sql;
    PreparedStatement ps;
    String nama;
    String nip;
    String pass;
    String passlagi;
    int posX=0,posY=0;
    /**
     * Creates new form NewAccPage
     */
    public NewAccPage() {
        initComponents();
        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
        
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
        
        InputKataSandiLagi.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                LblPsnBuatAkun.setText("");
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        InputNIP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InputNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        InputKataSandi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        InputKataSandiLagi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnBuatAkun = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        LblPsnBuatAkun = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buat Akun Baru - Katarak");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/katarak/images/appicon.png")).getImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nomor Induk Pegawai");

        InputNIP.setBackground(new java.awt.Color(255, 255, 255));
        InputNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNIPActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nama");

        InputNama.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Kata Sandi");

        InputKataSandi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Ulangi Kata Sandi");

        InputKataSandiLagi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Quicksand", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Buat Akun");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        BtnBuatAkun.setBackground(new java.awt.Color(255, 204, 0));
        BtnBuatAkun.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        BtnBuatAkun.setForeground(new java.awt.Color(51, 51, 51));
        BtnBuatAkun.setText("Buat Akun");
        BtnBuatAkun.setBorderPainted(false);
        BtnBuatAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuatAkunActionPerformed(evt);
            }
        });

        BtnBatal.setBackground(new java.awt.Color(0, 51, 102));
        BtnBatal.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        BtnBatal.setForeground(new java.awt.Color(255, 255, 255));
        BtnBatal.setText("Batal");
        BtnBatal.setBorderPainted(false);
        BtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BtnBuatAkun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnBatal)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuatAkun)
                    .addComponent(BtnBatal))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        BtnExit.setBackground(new java.awt.Color(255, 0, 0));
        BtnExit.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        BtnExit.setForeground(new java.awt.Color(255, 255, 255));
        BtnExit.setText("X");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Quicksand", 0, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("KATARAK - temuKAn daTa mahasiswA yang mengontRAK");

        LblPsnBuatAkun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        LblPsnBuatAkun.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblPsnBuatAkun)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel1)
                                .addComponent(InputKataSandi, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addComponent(InputNama)
                                .addComponent(InputNIP)
                                .addComponent(InputKataSandiLagi)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(BtnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(InputNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(InputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(InputKataSandi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(InputKataSandiLagi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(LblPsnBuatAkun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuatAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuatAkunActionPerformed
        nama = InputNama.getText();
        nip = InputNIP.getText();
        pass = InputKataSandi.getText();
        passlagi = InputKataSandiLagi.getText();
        if (InputNama.getText().equals("") || InputNIP.getText().equals("") || InputKataSandi.getText().equals("")) {
            LblPsnBuatAkun.setText("Masukkan data anda dengan lengkap!");
        } else {
            if (InputKataSandi.getText().equals(passlagi)) {
                try {
                    sql = "INSERT INTO dosen values('"+nip+"','"+nama+"','"+pass+"')";
                    ps = con.prepareStatement(sql);
                    ps.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Akun baru berhasil dibuat, silahkan login dengan data tersebut.");
                    this.dispose();
                } catch (Exception e) {
                    String error = e.getMessage();
                    if(error==null) {
                        LblPsnBuatAkun.setText("Database tidak terkoneksi!!!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Terjadi kesalahan dengan error : " + error);
                    }
                }
            } else {
                LblPsnBuatAkun.setText("Kata sandi tidak sama!");
            }
        }
    }//GEN-LAST:event_BtnBuatAkunActionPerformed

    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
        dispose();
    }//GEN-LAST:event_BtnBatalActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        dispose();
    }//GEN-LAST:event_BtnExitActionPerformed

    private void InputNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNIPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAccPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnBuatAkun;
    private javax.swing.JButton BtnExit;
    private javax.swing.JTextField InputKataSandi;
    private javax.swing.JTextField InputKataSandiLagi;
    private javax.swing.JTextField InputNIP;
    private javax.swing.JTextField InputNama;
    private javax.swing.JLabel LblPsnBuatAkun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
