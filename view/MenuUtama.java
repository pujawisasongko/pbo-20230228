
package view;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import config.KoneksiDB;
import config.UserSession;
import java.awt.print.PrinterException;
import java.text.MessageFormat;



public class MenuUtama extends javax.swing.JFrame {

    Connection con = KoneksiDB.getConnection();
    ResultSet rs;
    DefaultTableModel model;
    
    //  Get user data session
    String id = UserSession.get_id();
    String username = UserSession.get_username();
    String nama = UserSession.get_nama();
    String level = UserSession.get_level();
    String nisn = UserSession.get_nisn();
    String nama_siswa = UserSession.get_nama_siswa();

    public MenuUtama() {
        initComponents();
    }
    
    //  Hak admin
    public void dashAdmin() { 
        tabelSpp();    
        tabelTrans();
        jumlahDataMaster();
         
    }
    
    //  Hak petugas
    public void dashPetugas() {    
        tabelSpp();    
        tabelTrans();
        jumlahDataMaster();
           
        
        //  Access Block
        mnDataMaster.setVisible(false);
        mnLaporan.setVisible(false);
    }
    //  Hak Siswa
    public void dashSiswa() {           
        tabelSpp();    
        tabelTrans();
        jumlahDataMaster();
        
        
        //  Access Block
        mnDataMaster.setVisible(false);
        mnLaporan.setVisible(false);
        mnPembayaran.setVisible(false);
        btnTransaksi.setVisible(false);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTransaksi = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtabelSpp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jml_siswa = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jml_petugas = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jml_kelas = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cariTransaksi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnTransaksi = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnAkun = new javax.swing.JMenu();
        smLogout = new javax.swing.JMenuItem();
        mnDataMaster = new javax.swing.JMenu();
        smData_siswa = new javax.swing.JMenuItem();
        smData_petugas = new javax.swing.JMenuItem();
        smData_kelas = new javax.swing.JMenuItem();
        smData_spp = new javax.swing.JMenuItem();
        mnPembayaran = new javax.swing.JMenu();
        smTambah_trans = new javax.swing.JMenuItem();
        mnLaporan = new javax.swing.JMenu();
        smGenerate_laporan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "No. Transaksi", "NISN", "Nama Siswa", "Bulan Dibayar", "Tahun", "Jumlah Bayar", "Petugas"
            }
        ));
        jScrollPane1.setViewportView(tableTransaksi);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JtabelSpp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tahun", "Nominal"
            }
        ));
        jScrollPane2.setViewportView(JtabelSpp);

        jLabel2.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATA ANGKATAN");

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Siswa");

        jml_siswa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jml_siswa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jml_siswa.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jml_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jml_siswa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Petugas");

        jml_petugas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jml_petugas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jml_petugas.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jml_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jml_petugas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Kelas");

        jml_kelas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jml_kelas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jml_kelas.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jml_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jml_kelas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel9.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cari Transaksi :");
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cariTransaksi))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cariTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Pembayaran SPP");

        btnTransaksi.setBackground(new java.awt.Color(204, 255, 204));
        btnTransaksi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnTransaksi.setText("TRANSAKSI BARU");
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mnAkun.setText("Akun");
        mnAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAkunActionPerformed(evt);
            }
        });

        smLogout.setText("Log Out");
        smLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smLogoutActionPerformed(evt);
            }
        });
        mnAkun.add(smLogout);

        jMenuBar1.add(mnAkun);

        mnDataMaster.setText("Data Master");

        smData_siswa.setText("Data Siswa");
        smData_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smData_siswaActionPerformed(evt);
            }
        });
        mnDataMaster.add(smData_siswa);

        smData_petugas.setText("Data Petugas");
        smData_petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smData_petugasActionPerformed(evt);
            }
        });
        mnDataMaster.add(smData_petugas);

        smData_kelas.setText("Data Kelas");
        smData_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smData_kelasActionPerformed(evt);
            }
        });
        mnDataMaster.add(smData_kelas);

        smData_spp.setText("Data SPP");
        smData_spp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smData_sppActionPerformed(evt);
            }
        });
        mnDataMaster.add(smData_spp);

        jMenuBar1.add(mnDataMaster);

        mnPembayaran.setText("Pembayaran");

        smTambah_trans.setText("Tambah Transaksi");
        smTambah_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smTambah_transActionPerformed(evt);
            }
        });
        mnPembayaran.add(smTambah_trans);

        jMenuBar1.add(mnPembayaran);

        mnLaporan.setText("Laporan");

        smGenerate_laporan.setText("Generate Laporan");
        smGenerate_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smGenerate_laporanActionPerformed(evt);
            }
        });
        mnLaporan.add(smGenerate_laporan);

        jMenuBar1.add(mnLaporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void smLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new login().setVisible(true);
        dispose();
    }                                        

    private void smData_siswaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        CRUD_siswa view = new CRUD_siswa();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
        dispose();
    }                                            

    private void smData_petugasActionPerformed(java.awt.event.ActionEvent evt) {                                               
        CRUD_petugas view = new CRUD_petugas();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
        dispose();
    }                                              

    private void smData_kelasActionPerformed(java.awt.event.ActionEvent evt) {                                             
        CRUD_kelas view = new CRUD_kelas();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
        dispose();
    }                                            

    private void smData_sppActionPerformed(java.awt.event.ActionEvent evt) {                                           
        CRUD_SPP view = new CRUD_SPP();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
        dispose();
    }                                          

    private void smTambah_transActionPerformed(java.awt.event.ActionEvent evt) {                                               
        new FormTransaksi().setVisible(true);
        dispose();
    }                                              

    private void smGenerate_laporanActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // Deklarasi button Generate Laporan
        MessageFormat header = new MessageFormat ("Laporan SPP SMK");
        try{
            tableTransaksi.print(JTable.PrintMode.NORMAL, header, null);
        }catch(PrinterException e) {
            JOptionPane.showMessageDialog(null, "Gagal melakukan print");
        }
    }                                                  

    private void mnAkunActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //  null_404; "Sekadar menu"
    }                                      

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new FormTransaksi().setVisible(true);
        dispose();
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }
    public void tabelTrans() {
        String[] judul = {"Tanggal","No. Transaksi","NISN","Nama Siswa","Bulan Dibayar","Tahun","Jumlah Bayar","Petugas"};
        model = new DefaultTableModel(judul,0);
        tableTransaksi.setModel(model);
        String sql = "SELECT *,petugas.*, siswa.* from pembayaran INNER JOIN petugas USING(id_petugas) INNER JOIN siswa USING(nisn) where id_pembayaran like '%"+cariTransaksi.getText()+"%' or nisn like '%"+cariTransaksi.getText()+"%' ";
       
        try {
            rs = con.createStatement().executeQuery(sql);
           
            while(rs.next()) {
               String tanggal = rs.getString("tgl_bayar");
               String no_transaksi = rs.getString("id_pembayaran");
               String nisn = rs.getString("nisn");              
               String nama = rs.getString("nama");              
               String bulan = rs.getString("bulan_dibayar");               
               String tahun = rs.getString("tahun_dibayar");
               String jumlah = rs.getString("jumlah_bayar");
               String petugas = rs.getString("nama_petugas");
               
               String[] data = {tanggal,no_transaksi,nisn,nama,bulan,tahun, jumlah,petugas};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    
    }
    
    private void tabelSpp() {
        String[] judul = {"Tahun","Nominal"};
        model = new DefaultTableModel(judul,0);
        JtabelSpp.setModel(model);
        String sql = "SELECT tahun, nominal from spp";
       
        try {
            rs = con.createStatement().executeQuery(sql);
            
            while(rs.next()) {
               String tahun = rs.getString("tahun");
               String nominal = rs.getString("nominal");
                
               String[] data = {tahun,nominal};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    }
    
    private void jumlahDataMaster() {                
       try {
           ResultSet rowPetugas = con.createStatement().executeQuery("select * from petugas");
           ResultSet rowKelas = con.createStatement().executeQuery("select * from kelas");
           ResultSet rowSiswa = con.createStatement().executeQuery("select * from siswa");
           rowPetugas.next();
           rowSiswa.next();
           rowKelas.next();
           
           if (rowPetugas.last()) {
              int total=rowPetugas.getRow();
              rowPetugas.beforeFirst();
              jml_petugas.setText(Integer.toString(total));
           }
           
           if(rowSiswa.last()){
              int total=rowSiswa.getRow();
              rowSiswa.beforeFirst();
              jml_siswa.setText(Integer.toString(total));
           }
           
           if(rowKelas.last()){
              int total=rowKelas.getRow();
              rowKelas.beforeFirst();
              jml_kelas.setText(Integer.toString(total));
           }
       } catch (Exception e) {
           System.out.println(e);
       }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTable JtabelSpp;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JTextField cariTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jml_kelas;
    private javax.swing.JLabel jml_petugas;
    private javax.swing.JLabel jml_siswa;
    private javax.swing.JMenu mnAkun;
    private javax.swing.JMenu mnDataMaster;
    private javax.swing.JMenu mnLaporan;
    private javax.swing.JMenu mnPembayaran;
    private javax.swing.JMenuItem smData_kelas;
    private javax.swing.JMenuItem smData_petugas;
    private javax.swing.JMenuItem smData_siswa;
    private javax.swing.JMenuItem smData_spp;
    private javax.swing.JMenuItem smGenerate_laporan;
    private javax.swing.JMenuItem smLogout;
    private javax.swing.JMenuItem smTambah_trans;
    private javax.swing.JTable tableTransaksi;
    // End of variables declaration                   
}
