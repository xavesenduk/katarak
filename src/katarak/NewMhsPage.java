/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katarak;

import java.awt.Window;
import katarak.utility.Koneksi;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class NewMhsPage extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    Statement stat;
    String sql;
    PreparedStatement ps;
    String nim;
    String nohp;
    String nama;
    String ipk;
    String ttl;
    String email;
    String mk;
    int posX=0,posY=0;
    /**
     * Creates new form NewAccPage
     */
    public NewMhsPage() {
        initComponents();
        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
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
        
        loadmk();
        String activeMK = DB.getSelectedMK();
        if(activeMK==null) {
            CmbMatKul.setSelectedItem(null);
        } else {
            CmbMatKul.setSelectedItem(activeMK);
        }
    }
    
    private void loadmk() {
        String mk = null;
        try {
            Koneksi nip = new Koneksi();
            String hashfin = nip.getSession();
            String showmk = "SELECT namamk FROM detailmatakuliah WHERE otoritas='"+hashfin+"' ORDER BY nama ASC";
            ps = con.prepareStatement(showmk);
            rs = ps.executeQuery(showmk);
            CmbMatKul.removeAllItems();
            while(rs.next()) {
                mk = rs.getString("namamk");
                CmbMatKul.addItem(mk);
            }
            if(mk==null) {
                JOptionPane.showMessageDialog(null, "Tambahkan dulu mata kuliah, kemudian tambahkan mahasiswa");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
        LblNamaMhs = new javax.swing.JLabel();
        InputNIM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        InputNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnSimpan = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        InputIPK = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        InputHp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        InputTTL = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        InputEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CmbMatKul = new javax.swing.JComboBox<>();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buat Akun Baru - Katarak");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/katarak/images/appicon.png")).getImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNamaMhs.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        LblNamaMhs.setForeground(new java.awt.Color(51, 51, 51));
        LblNamaMhs.setText("Mahasiswa");
        jPanel1.add(LblNamaMhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        InputNIM.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(InputNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));

        jLabel4.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nama Mahasiswa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        InputNama.setBackground(new java.awt.Color(255, 255, 255));
        InputNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputNamaFocusLost(evt);
            }
        });
        jPanel1.add(InputNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 340, -1));

        jLabel5.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Indeks Prestasi Kumulatif");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Quicksand", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Input Mahasiswa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSimpan.setBackground(new java.awt.Color(255, 204, 0));
        BtnSimpan.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        BtnSimpan.setForeground(new java.awt.Color(51, 51, 51));
        BtnSimpan.setText("Simpan");
        BtnSimpan.setBorderPainted(false);
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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
        jPanel2.add(BtnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 346, 390, 70));

        BtnExit.setBackground(new java.awt.Color(255, 0, 0));
        BtnExit.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        BtnExit.setForeground(new java.awt.Color(255, 255, 255));
        BtnExit.setText("X");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Quicksand", 0, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("KATARAK - temuKAn daTa mahasiswA yang mengontRAK");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nomor Induk Mahasiswa");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        InputIPK.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(InputIPK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, -1));

        jLabel10.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Mahasiswa :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        InputHp.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(InputHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 160, -1));

        jLabel12.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("No. Handphone");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Tempat, tanggal lahir");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        InputTTL.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(InputTTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 160, -1));

        jLabel14.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Mata Kuliah");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        InputEmail.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(InputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, -1));

        jLabel15.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Alamat e-mail");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        CmbMatKul.setBackground(new java.awt.Color(255, 255, 255));
        CmbMatKul.setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        jPanel1.add(CmbMatKul, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 160, -1));

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

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        Koneksi nip = new Koneksi();
        String hashfin = nip.getSession();
        String mkfin = (String) CmbMatKul.getSelectedItem();
        if(InputNIM.getText().equals("") || InputHp.getText().equals("") || InputNama.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan data dengan lengkap");
        } else {
            try {
                sql = "SELECT * FROM detailmahasiswa WHERE nim='"+InputNIM.getText()+"' and otoritas='"+hashfin+"' and matakuliah='"+mkfin+"'";
                rs = stat.executeQuery(sql);
                if(rs.next()) {
                    JOptionPane.showMessageDialog(null, "Data mahasiswa sudah ada");
                } else {
                    StoreData();
                    
                    Koneksi panel = new Koneksi();
                    String active = "data";
                    panel.setActivePanel(active);
                    this.dispose();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    public void StoreData() {
        Koneksi nip = new Koneksi();
        String hashfin = nip.getSession();
        nim = InputNIM.getText();
        nohp = InputHp.getText();
        nama = InputNama.getText();
        ipk = InputIPK.getText();
        ttl = InputTTL.getText();
        email = InputEmail.getText();
        mk = (String) CmbMatKul.getSelectedItem();
        try {
            String statone = "INSERT INTO detailmahasiswa values('"+nim+" - "+nama+"','"+nim+"','"+nama+"','"+nohp+"','"+ipk+"','"+ttl+"','"+email+"','"+mk+"','"+hashfin+"')";
            ps = con.prepareStatement(statone);
            ps.executeUpdate(statone);
            JOptionPane.showMessageDialog(null, "Mahasiswa berhasil ditambahkan");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan : " + e.getMessage());
        }
    }
    
    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
        dispose();
    }//GEN-LAST:event_BtnBatalActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        dispose();
    }//GEN-LAST:event_BtnExitActionPerformed

    private void InputNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputNamaFocusLost
        String namamhs = InputNIM.getText()+" - "+InputNama.getText();
        LblNamaMhs.setText(namamhs);
    }//GEN-LAST:event_InputNamaFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMhsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JComboBox<String> CmbMatKul;
    private javax.swing.JTextField InputEmail;
    private javax.swing.JTextField InputHp;
    private javax.swing.JTextField InputIPK;
    private javax.swing.JTextField InputNIM;
    private javax.swing.JTextField InputNama;
    private javax.swing.JTextField InputTTL;
    private javax.swing.JLabel LblNamaMhs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
