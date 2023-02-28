
package view;

import java.sql.*;
import javax.swing.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import config.KoneksiDB;
import config.UserSession;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FormTransaksi extends javax.swing.JFrame {
 
    String id = UserSession.get_id();
    String nama = UserSession.get_nama();
    String level = UserSession.get_level();
    
    public FormTransaksi() {
       initComponents();
       tabelSiswa();
        
       t_transaksi.setEnabled(false);
       tTanggal.setEnabled(false);
       id_petugas1.setEnabled(false);
       id_petugas1.setEnabled(false);
    }
    
    Statement st;
    Connection con = KoneksiDB.getConnection();
    ResultSet rs;
    DefaultComboBoxModel modelc;
    DefaultTableModel model;
    DefaultTableModel modelStatus;
    Calendar kalender = new GregorianCalendar();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t_transaksi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tnisn = new javax.swing.JLabel();
        tnama = new javax.swing.JLabel();
        tkelas = new javax.swing.JLabel();
        tAngkatan = new javax.swing.JLabel();
        petugas2 = new javax.swing.JLabel();
        id_angkatan1 = new javax.swing.JTextField();
        id_petugas1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tTanggal = new javax.swing.JTextField();
        tJumlah_bayar = new javax.swing.JTextField();
        cbBulan = new javax.swing.JComboBox<>();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbsiswa = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbstatusbayar = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        tNama_siswa1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transaksi Pembayaran SPP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("No. Transaksi");

        t_transaksi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        t_transaksi.setText("TransaksiXX");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Nama Siswa");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Kelas");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Angkatan");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Petugas");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText(":");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setText(":");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setText(":");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setText(":");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setText("NISN");

        tnisn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tnisn.setText("~");
        tnisn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tnisnPropertyChange(evt);
            }
        });

        tnama.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tnama.setText("~");
        tnama.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tnamaPropertyChange(evt);
            }
        });

        tkelas.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tkelas.setText("~");
        tkelas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tkelasPropertyChange(evt);
            }
        });

        tAngkatan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tAngkatan.setText("~");

        petugas2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        petugas2.setText("~");

        id_angkatan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_angkatan1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tnisn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(id_petugas1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(id_angkatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(petugas2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_transaksi)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12)
                    .addComponent(t_transaksi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(tnisn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(tnama))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(tkelas))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(tAngkatan)
                    .addComponent(id_angkatan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(petugas2)
                    .addComponent(id_petugas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Tanggal");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Jumlah");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel17.setText("Bulan");

        cbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cbBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBulanActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 102, 102));
        btnHapus.setText("Batalkan");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(0, 255, 204));
        btnSimpan.setText("Bayar");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(tJumlah_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(31, 31, 31)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tTanggal)
                                    .addComponent(cbBulan, 0, 170, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tJumlah_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbsiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NISN", "NIS", "Nama", "Kelas", "Alamat", "Telepon", "Tahun"
            }
        ));
        tbsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbsiswa);

        tbstatusbayar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No. Transaksi", "Tanggal", "Bulan", "Jumlah Bayar", "Status"
            }
        ));
        tbstatusbayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbstatusbayarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbstatusbayar);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Status Bayar");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        tNama_siswa1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tNama_siswa1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tNama_siswa1.setText("~");
        tNama_siswa1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Cari siswa");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setText("Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cari))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tNama_siswa1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNama_siswa1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

    private void cbBulanActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {                                
        tabelSiswa();
    }                               

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {                                 
        tabelSiswa();
    }                                

    private void tbsiswaMouseClicked(java.awt.event.MouseEvent evt) {                                     
        ID_AUTO();
        //setting date
        int tahun = kalender.get(Calendar.YEAR);
        int bulan = kalender.get(Calendar.MONTH)+1;
        int hari = kalender.get(Calendar.DAY_OF_MONTH);
        String tanggal = tahun+"/"+bulan+"/"+hari;
        tTanggal.setText(tanggal);
        
        int i = tbsiswa.getSelectedRow();
        tnisn.setText(model.getValueAt(i, 0).toString());
        tnama.setText(model.getValueAt(i, 2).toString());
        tNama_siswa1.setText(model.getValueAt(i, 2).toString());
        tkelas.setText(model.getValueAt(i, 3).toString());
        tAngkatan.setText(model.getValueAt(i, 6).toString());
        id_petugas1.setText(id);
        petugas2.setText(nama);

        try {
            rs = con.createStatement().executeQuery(""
                    + "select siswa.*, spp.* from siswa INNER JOIN spp Using(id_spp)where nisn "
                    + "like '%"+tnisn.getText()+"%'");
            while (rs.next()) {
                id_angkatan1.setText(rs.getString("id_spp"));
                tJumlah_bayar.setText(rs.getString("nominal"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        btnSimpan.setEnabled(true);
        btnHapus.setEnabled(false);
    }                                    

    private void tbstatusbayarMouseClicked(java.awt.event.MouseEvent evt) {                                           
       int trans = tbstatusbayar.getSelectedRow();
        t_transaksi.setText(modelStatus.getValueAt(trans, 0).toString());
        tTanggal.setText(modelStatus.getValueAt(trans, 1).toString());
        cbBulan.setSelectedItem(modelStatus.getValueAt(trans, 2).toString());
        tJumlah_bayar.setText(modelStatus.getValueAt(trans, 3).toString());

        try {
            rs = con.createStatement().executeQuery(""
                    + "select pembayaran.*, petugas.*, spp.* "
                    + "from pembayaran INNER JOIN petugas Using(id_petugas) "
                    + "INNER JOIN spp Using(id_spp) where id_pembayaran "
                    + "like '%"+t_transaksi.getText()+"%'");
            while (rs.next()) {
                id_angkatan1.setText(rs.getString("id_spp"));
                tAngkatan.setText(rs.getString("tahun"));
                id_petugas1.setText(rs.getString("id_petugas"));
                petugas2.setText(rs.getString("nama_petugas"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(true);
    }                                          

    private void tnisnPropertyChange(java.beans.PropertyChangeEvent evt) {                                     
        tabelStatBayar();
    }                                    

    private void tnamaPropertyChange(java.beans.PropertyChangeEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void tkelasPropertyChange(java.beans.PropertyChangeEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String no_trans = t_transaksi.getText();
        String nisn = tnisn.getText();
        String id_angkatan = id_angkatan1.getText();
        String id_petugas = id_petugas1.getText();
        String angkatan = tAngkatan.getText();
        String tgl = tTanggal.getText();
        String bln_bayar = cbBulan.getSelectedItem().toString();
        String jml_bayar = tJumlah_bayar.getText();

        try{
            Statement st = con.createStatement();
            String sql = "SELECT * FROM  pembayaran where nisn='"+nisn+"' and bulan_dibayar='"+bln_bayar+"'";
            rs = st.executeQuery(sql);

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Gagal : Transaksi ini sudah dilakukan!");
            } else {
                con.createStatement().executeUpdate("insert into pembayaran value ('"+no_trans+"','"+id_petugas+"','"+nisn+"','"+tgl+"','"+bln_bayar+"','"+angkatan+"','"+id_angkatan+"','"+jml_bayar+"')");
                JOptionPane.showMessageDialog(null, "Berhasil melakukan transaksi");
            }
        }catch (Exception ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Gagal!");
        }
        
        tabelStatBayar();
    }                                         

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            con.createStatement().execute("delete from pembayaran where id_pembayaran='"+t_transaksi.getText()+"'");
            JOptionPane.showMessageDialog(null, "Transaksi berhasil dihapus");
            tabelStatBayar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal hapus transaksi");
        }

    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch (level) {
            case "admin":
            {
                MenuUtama dsb = new MenuUtama();
                dsb.dashAdmin();
                dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dsb.setVisible(true);
                dispose();
                break;
            }
            case "petugas":
            {
                MenuUtama dsb = new MenuUtama();
                dsb.dashPetugas();
                dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dsb.setVisible(true);
                dispose();
                break;
            }
            default:
            break;
        }
    }                                        

    private void id_angkatan1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> cbBulan;
    private javax.swing.JTextField id_angkatan1;
    private javax.swing.JTextField id_petugas1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel petugas2;
    private javax.swing.JLabel tAngkatan;
    private javax.swing.JTextField tJumlah_bayar;
    private javax.swing.JLabel tNama_siswa1;
    private javax.swing.JTextField tTanggal;
    private javax.swing.JLabel t_transaksi;
    private javax.swing.JTable tbsiswa;
    private javax.swing.JTable tbstatusbayar;
    private javax.swing.JLabel tkelas;
    private javax.swing.JLabel tnama;
    private javax.swing.JLabel tnisn;
    // End of variables declaration                   
 private void tabelSiswa() {
        String[] judul = {"NISN","NIS","Nama","Kelas","Alamat","Telepon","Tahun"};
        model = new DefaultTableModel(judul,0);
        tbsiswa.setModel(model);
        String sql = "SELECT siswa.*, kelas.nama_kelas, spp.tahun from siswa INNER JOIN kelas USING(id_kelas) INNER JOIN spp Using(id_spp) where nisn like '%"+cari.getText()+"%' or nama like '%"+cari.getText()+"%'";
        
        try {
            rs = con.createStatement().executeQuery(sql);
            while(rs.next()) {
               String nisn = rs.getString("nisn");
               String nis = rs.getString("nis");
               String nama = rs.getString("nama");
               String kelas = rs.getString("nama_kelas");
               String alamat = rs.getString("alamat");
               String telp = rs.getString("no_telp");
               String tahun = rs.getString("tahun");
                
               String[] data = {nisn, nis, nama, kelas, alamat, telp, tahun};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    
    }
    private void tabelStatBayar() {
        String[] header = {"No Transaksi","Tanggal","Bulan","Jumlah Bayar","Status"};
        modelStatus = new DefaultTableModel(header,0);
        tbstatusbayar.setModel(modelStatus);
        String dataStat = "SELECT * from pembayaran where nisn='"+tnisn.getText()+"'";
        
        try {
            ResultSet queryStat = con.createStatement().executeQuery(dataStat);
            while(queryStat.next()) {
               String no = queryStat.getString("id_pembayaran");
               String tanggal = queryStat.getString("tgl_bayar");
               String bulan = queryStat.getString("bulan_dibayar");
               String jumlah = queryStat.getString("jumlah_bayar");
               String status = "Lunas";
                
               String[] record = {no,tanggal,bulan,jumlah,status};
               modelStatus.addRow(record);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    }
    
    public void resetForm(){
        t_transaksi.setText(""); 
        id_angkatan1.setText(""); 
        tTanggal.setText(""); 
        tJumlah_bayar.setText(""); 
        id_petugas1.setText(""); 
        petugas2.setText(""); 
        cbBulan.setSelectedItem("januari");   
        tabelSiswa(); 
    }
        
    //kode otomatis
    private void ID_AUTO(){
        try {
            String sql="select max(right(id_pembayaran,3)) as no_trans from pembayaran";
            rs = con.createStatement().executeQuery(sql);

            while(rs.next()){
                if(rs.first()==false){
                    t_transaksi.setText("TRS001");
                } else{
                    rs.last();
                    int autoid = rs.getInt(1) + 1;
                    String nomor=String.valueOf(autoid);
                    
                    for(int a=0;a<3;a++){ 
                        nomor = "0" + nomor;
                    }
                    t_transaksi.setText("TRS" + nomor);
                }
            }
        } catch (Exception e) {
            System.out.println("error pembayaran | "+e);
        }
    }
}
