/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author SUYANTO
 */
public class Hotel_interface extends javax.swing.JFrame {

    /**
     * Creates new form Hotel_interface
     */
    public Hotel_interface() {
        initComponents();
        this.setTitle("Manajemen Hotel");
        this.ItemBlnCheckIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7", "8", "9", "10", "11","12"}));
        this.ItemTglCheckIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7", "8", "9", "10", "11","12","13","14","15","16","17", "18", "19", "20", "21","22","23","24","25","26","27", "28", "29", "30", "31"}));
        this.ItemThnCheckIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"2021","2022","2023","2024","2025"}));
        
        this.ItemBlnCheckOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7", "8", "9", "10", "11","12"}));
        this.ItemTglCheckOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7", "8", "9", "10", "11","12","13","14","15","16","17", "18", "19", "20", "21","22","23","24","25","26","27", "28", "29", "30", "31"}));
        this.ItemThnCheckOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"2021","2022","2023","2024","2025"}));
        
        this.TglLayananTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7", "8", "9", "10", "11","12","13","14","15","16","17", "18", "19", "20", "21","22","23","24","25","26","27", "28", "29", "30", "31"}));
        this.BlnLayananTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7", "8", "9", "10", "11","12"}));
        this.ThnLayananTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"2021","2022","2023","2024","2025"}));
        this.ItemLayananTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7", "8", "9", "10", "11","12","13"}));
        this.ItemJumlahLayananTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7", "8", "9", "10", "11","12"}));
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
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListPelanggan = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblNamaPendaftaran = new javax.swing.JLabel();
        lblNoIdPendaftaran = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        formNama = new javax.swing.JTextField();
        formId = new javax.swing.JTextField();
        formNoTelp = new javax.swing.JTextField();
        formAlamat = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ItemPelangganCheckIn = new javax.swing.JComboBox<>();
        ItemPilihKamarCheckIn = new javax.swing.JComboBox<>();
        ItemTglCheckIn = new javax.swing.JComboBox<>();
        ItemBlnCheckIn = new javax.swing.JComboBox<>();
        ItemThnCheckIn = new javax.swing.JComboBox<>();
        lblPelangganCheckIn = new javax.swing.JLabel();
        lblPilihKamar = new javax.swing.JLabel();
        lblTglCheckIn = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OkCheckIn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblPelangganLayananTambahan = new javax.swing.JLabel();
        lblLayananTambahan = new javax.swing.JLabel();
        lblJumLayananTambahan = new javax.swing.JLabel();
        ItemPelangganLayananTambahan = new javax.swing.JComboBox<>();
        ItemLayananTambahan = new javax.swing.JComboBox<>();
        ItemJumlahLayananTambahan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        OkLayananTambahan = new javax.swing.JButton();
        TglLayananTambahan = new javax.swing.JComboBox<>();
        BlnLayananTambahan = new javax.swing.JComboBox<>();
        ThnLayananTambahan = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblPelangganCheckOut = new javax.swing.JLabel();
        lblTglCheckOut = new javax.swing.JLabel();
        ItemNoKamarCheckOut = new javax.swing.JComboBox<>();
        ItemTglCheckOut = new javax.swing.JComboBox<>();
        ItemBlnCheckOut = new javax.swing.JComboBox<>();
        ItemThnCheckOut = new javax.swing.JComboBox<>();
        OkCheckOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        totalHarga = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nKmrCheckOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        ListPelanggan.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListPelanggan);

        jLabel1.setText("FORM PENDAFTARAN PELANGGAN");

        lblNamaPendaftaran.setText("Nama");

        lblNoIdPendaftaran.setText("No Id");

        jLabel4.setText("No. Telp");

        jLabel5.setText("Alamat");

        tambah.setText("Tambah");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamaPendaftaran)
                            .addComponent(lblNoIdPendaftaran)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(formNama, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(formId)
                                .addComponent(formNoTelp)
                                .addComponent(formAlamat)))
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tambah)
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamaPendaftaran)
                            .addComponent(formNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNoIdPendaftaran)
                            .addComponent(formId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(formNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(formAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tambah)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Pendaftaran", jPanel2);

        ItemPelangganCheckIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ItemPilihKamarCheckIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ItemTglCheckIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ItemBlnCheckIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ItemThnCheckIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPelangganCheckIn.setText("Pelanggan");

        lblPilihKamar.setText("Pilih Kamar");

        lblTglCheckIn.setText("Tanggal Check In");

        jLabel9.setText("FORM CHECK IN KAMAR");

        OkCheckIn.setText("OK");
        OkCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkCheckInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPelangganCheckIn)
                    .addComponent(lblPilihKamar)
                    .addComponent(lblTglCheckIn))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ItemTglCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ItemBlnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ItemThnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ItemPilihKamarCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemPelangganCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkCheckIn)
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPelangganCheckIn)
                    .addComponent(ItemPelangganCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPilihKamar)
                    .addComponent(ItemPilihKamarCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemTglCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemBlnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemThnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTglCheckIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(OkCheckIn)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Check In", jPanel3);

        jLabel10.setText("FORM PEMESANAN LAYANAN TAMBAHAN");

        lblPelangganLayananTambahan.setText("No Kamar");

        lblLayananTambahan.setText("Layanan Tambahan");

        lblJumLayananTambahan.setText("Jumlah layanan tambahan");

        ItemLayananTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ItemJumlahLayananTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ItemJumlahLayananTambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemJumlahLayananTambahanActionPerformed(evt);
            }
        });

        jLabel2.setText("Tanggal");

        OkLayananTambahan.setText("Ok");

        TglLayananTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BlnLayananTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ThnLayananTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPelangganLayananTambahan)
                            .addComponent(lblLayananTambahan)
                            .addComponent(lblJumLayananTambahan)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ItemJumlahLayananTambahan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItemLayananTambahan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItemPelangganLayananTambahan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TglLayananTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BlnLayananTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ThnLayananTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OkLayananTambahan)
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPelangganLayananTambahan)
                    .addComponent(ItemPelangganLayananTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLayananTambahan)
                    .addComponent(ItemLayananTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemJumlahLayananTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJumLayananTambahan))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TglLayananTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BlnLayananTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThnLayananTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(OkLayananTambahan)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Layanan Tambahan", jPanel4);

        jLabel14.setText("FORM CHECK OUT PELANGGAN");

        lblPelangganCheckOut.setText("No Kamar");

        lblTglCheckOut.setText("Tanggal Check Out");

        ItemNoKamarCheckOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ItemNoKamarCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNoKamarCheckOutActionPerformed(evt);
            }
        });

        ItemTglCheckOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ItemBlnCheckOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ItemThnCheckOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        OkCheckOut.setText("Ok");

        jLabel3.setText("Total Harga");

        totalHarga.setText("Rp.");

        jLabel6.setText("Telah Check Out:");

        jLabel7.setText("Nomor Kamar");

        nKmrCheckOut.setText("---");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPelangganCheckOut)
                            .addComponent(lblTglCheckOut)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(ItemTglCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ItemBlnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ItemThnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ItemNoKamarCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalHarga)
                            .addComponent(nKmrCheckOut))))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OkCheckOut)
                .addGap(74, 74, 74))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPelangganCheckOut)
                    .addComponent(ItemNoKamarCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTglCheckOut)
                    .addComponent(ItemTglCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemBlnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemThnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nKmrCheckOut)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalHarga))
                .addGap(33, 33, 33)
                .addComponent(OkCheckOut)
                .addGap(28, 28, 28))
        );

        jTabbedPane2.addTab("Check Out", jPanel5);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemJumlahLayananTambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemJumlahLayananTambahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemJumlahLayananTambahanActionPerformed
    private void OkCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkCheckInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OkCheckInActionPerformed

    private void ItemNoKamarCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNoKamarCheckOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemNoKamarCheckOutActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BlnLayananTambahan;
    private javax.swing.JComboBox<String> ItemBlnCheckIn;
    private javax.swing.JComboBox<String> ItemBlnCheckOut;
    private javax.swing.JComboBox<String> ItemJumlahLayananTambahan;
    private javax.swing.JComboBox<String> ItemLayananTambahan;
    private javax.swing.JComboBox<String> ItemNoKamarCheckOut;
    private javax.swing.JComboBox<String> ItemPelangganCheckIn;
    private javax.swing.JComboBox<String> ItemPelangganLayananTambahan;
    private javax.swing.JComboBox<String> ItemPilihKamarCheckIn;
    private javax.swing.JComboBox<String> ItemTglCheckIn;
    private javax.swing.JComboBox<String> ItemTglCheckOut;
    private javax.swing.JComboBox<String> ItemThnCheckIn;
    private javax.swing.JComboBox<String> ItemThnCheckOut;
    private javax.swing.JList<String> ListPelanggan;
    private javax.swing.JButton OkCheckIn;
    private javax.swing.JButton OkCheckOut;
    private javax.swing.JButton OkLayananTambahan;
    private javax.swing.JComboBox<String> TglLayananTambahan;
    private javax.swing.JComboBox<String> ThnLayananTambahan;
    private javax.swing.JTextField formAlamat;
    private javax.swing.JTextField formId;
    private javax.swing.JTextField formNama;
    private javax.swing.JTextField formNoTelp;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblJumLayananTambahan;
    private javax.swing.JLabel lblLayananTambahan;
    private javax.swing.JLabel lblNamaPendaftaran;
    private javax.swing.JLabel lblNoIdPendaftaran;
    private javax.swing.JLabel lblPelangganCheckIn;
    private javax.swing.JLabel lblPelangganCheckOut;
    private javax.swing.JLabel lblPelangganLayananTambahan;
    private javax.swing.JLabel lblPilihKamar;
    private javax.swing.JLabel lblTglCheckIn;
    private javax.swing.JLabel lblTglCheckOut;
    private javax.swing.JLabel nKmrCheckOut;
    private javax.swing.JButton tambah;
    private javax.swing.JLabel totalHarga;
    // End of variables declaration//GEN-END:variables

    //halaman pendaftaran
    public JList<String> getListPelanggan() {return ListPelanggan;}
    public JTextField getFormAlamat() {return formAlamat;}
    public JTextField getFormId() {return formId;}
    public JTextField getFormNama() {return formNama;}
    public JTextField getFormNoTelp() {return formNoTelp;}

    // halaman check in
    public JComboBox<String> getItemPelangganCheckIn() {return ItemPelangganCheckIn;}
    public JComboBox<String> getItemPilihKamarCheckIn() {return ItemPilihKamarCheckIn;}
    public JComboBox<String> getItemTglCheckIn() {return ItemTglCheckIn;}
    public JComboBox<String> getItemBlnCheckIn() {return ItemBlnCheckIn;}
    public JComboBox<String> getItemThnCheckIn() {return ItemThnCheckIn;}
    public JComboBox<String> getItemPelangganLayananTambahan() {return ItemPelangganLayananTambahan;}
    
    //halaman layanan tambahan
    public JComboBox<String> getBlnLayananTambahan() {return BlnLayananTambahan;}
    public JComboBox<String> getItemJumlahLayananTambahan() {return ItemJumlahLayananTambahan;}
    public JComboBox<String> getItemLayananTambahan() {return ItemLayananTambahan;}
    public JComboBox<String> getTglLayananTambahan() {return TglLayananTambahan;}
    public JComboBox<String> getThnLayananTambahan() {return ThnLayananTambahan;}

    //halaman check out
    public JComboBox<String> getItemNoKamarCheckOut() {return ItemNoKamarCheckOut;}
    public JComboBox<String> getItemTglCheckOut() {return ItemTglCheckOut;}
    public JComboBox<String> getItemBlnCheckOut() {return ItemBlnCheckOut;}
    public JComboBox<String> getItemThnCheckOut() {return ItemThnCheckOut;}
    public JLabel getTotalHarga() {return totalHarga;}
    public void setTotalHarga(JLabel totalHarga) {
        this.totalHarga = totalHarga;
    }
    public JLabel getnKmrCheckOut() {return nKmrCheckOut;}
    public void setnKmrCheckOut(JLabel nKmrCheckOut) {
        this.nKmrCheckOut = nKmrCheckOut;
    }
    
    

    public void addButtonListenerPendaftaran(ActionListener ButtonListener){
        tambah.addActionListener(ButtonListener);
    }
    public void addButtonListenerCheckIn(ActionListener ButtonListener){
        OkCheckIn.addActionListener(ButtonListener);
    }
    public void addButtonListenerLayananTambahan(ActionListener ButtonListener){
        OkLayananTambahan.addActionListener(ButtonListener);
    }
    
    public void showMessageBox(String s) {
        JOptionPane.showMessageDialog(this, s);
    }
    
    public void addButtonListenerCheckout(ActionListener ButtonListener){
        OkCheckOut.addActionListener(ButtonListener);
    }
    
    public void DisplayError(String s){
        JOptionPane.showMessageDialog(this, s);
    }
}
