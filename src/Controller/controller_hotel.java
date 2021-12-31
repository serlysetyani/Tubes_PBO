/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Database.*;
import Manajemen_Hotel.*;
import View.Hotel_interface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author SUYANTO
 */
public class controller_hotel {
    private Hotel_interface view;
    private List<Pelanggan> p;
    private List<Kamar> k;
    private List<Sewa> s;
    
    private DAO_Pelanggan dao_p;
    private DAO_Kamar dao_k;
    private DAO_Sewa dao_s;
    private DAO_LayananTambahan dao_lt;

    public controller_hotel(Hotel_interface view) {
        this.view = view;
        this.dao_p = new DAO_Pelanggan();
        this.dao_k = new DAO_Kamar();
        this.dao_s = new DAO_Sewa();
        this.dao_lt = new DAO_LayananTambahan();
        this.p = dao_p.getAllPelanggan();
        this.k = dao_k.getKamarKosong();
        this.s = dao_s.getAllSewaCheckOutNULL();
        
        // buat form pendaftaran
        view.addButtonListenerPendaftaran(new ButtonHandlerPendaftaran());
        loadList();
        // buat form check in
        view.addButtonListenerCheckIn(new ButtonOkCheckInHandler());
        loadListNamaPendaftar();
        loadListKamar();
        //buat layanan tambahan
        view.addButtonListenerLayananTambahan(new ButtonOkLayananTambahan());
        loadListPelangganMasihSewa();
        // buat check out
        view.addButtonListenerCheckout(new ButtonCheckOutHandler());
        
        // Buat Kwitansi
        view.addButtonListenerKwitansi(new ButtonKwitansiHandler());
        
    }

    public controller_hotel() {}
    
    // ================================== buat daftar ==============================================
    public void loadList(){
        DefaultListModel<String> names = new DefaultListModel();
        for (int i = 0; i < p.size(); i++){
           names.addElement(p.get(i).getNama());
        }
        view.getListPelanggan().setModel(names);
    }
    
    // =================================== buat check in ======================
    public void loadListNamaPendaftar(){
        DefaultComboBoxModel names = new DefaultComboBoxModel();
        view.getItemPelangganCheckIn().setModel(names);
        for (int i = 0; i < p.size(); i++){
           view.getItemPelangganCheckIn().addItem(p.get(i).getNama());
        }
    }
    
    public void loadListKamar(){
        DefaultComboBoxModel kamar = new DefaultComboBoxModel();
        view.getItemPilihKamarCheckIn().setModel(kamar);
        for (int i = 0; i < k.size(); i++){
           view.getItemPilihKamarCheckIn().addItem(Integer.toString(k.get(i).getNomor()));
        }
    }

    // ================================= buat layanan tambahan ================
    public void loadListPelangganMasihSewa(){
        DefaultComboBoxModel kamarDisewa = new DefaultComboBoxModel();
        view.getItemPelangganLayananTambahan().setModel(kamarDisewa);
        for (int i = 0; i < s.size(); i++){
               view.getItemPelangganLayananTambahan().addItem(Integer.toString(s.get(i).getKamar().getNomor()));
        }
    }
    // ================================= buat checkout =======================
    public void loadListPelangganCheckOut(){
        DefaultComboBoxModel kamarDisewa = new DefaultComboBoxModel();
        view.getItemNoKamarCheckOut().setModel(kamarDisewa);
        for (int i = 0; i < s.size(); i++){
               view.getItemNoKamarCheckOut().addItem(Integer.toString(s.get(i).getKamar().getNomor()));
        }
    }
    
    // ======================= Button Handler ==================================
    // ======================= Pendaftaran =====================================
    class ButtonHandlerPendaftaran implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
             switch (ae.getActionCommand()) {
                 case "Tambah":
                    String no_identitas = view.getFormId().getText();
                    String nama = view.getFormNama().getText();
                    String no_telepon = view.getFormNoTelp().getText();
                    String alamat = view.getFormAlamat().getText();
                    Pelanggan pelanggan = new Pelanggan(nama, no_telepon, no_identitas, alamat);
                    dao_p.insertPelanggan(pelanggan);
                    p.add(pelanggan);
                    loadList();
                    loadListNamaPendaftar();
                    break;
                 default:
                    break;
             }
        }
    
    }
    
    
    // ============================== Button Handler Check In ==================
    class ButtonOkCheckInHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            switch (ae.getActionCommand()){
                case "OK":
                    String nama_pelanggan = view.getItemPelangganCheckIn().getSelectedItem().toString();
                    int no_kamar = Integer.parseInt(view.getItemPilihKamarCheckIn().getSelectedItem().toString());
                    int tanggal = Integer.parseInt(view.getItemTglCheckIn().getSelectedItem().toString());
                    int bulan = Integer.parseInt(view.getItemBlnCheckIn().getSelectedItem().toString());
                    int tahun = Integer.parseInt(view.getItemThnCheckIn().getSelectedItem().toString());
                    Pelanggan pelanggan = new Pelanggan();
                    Kamar kamar = new Kamar();
                    for (Kamar ka : k){
                        if (ka.getNomor() == no_kamar){
                            kamar = ka;
                            kamar.setStatus("terisi");
                            break;
                        }
                    }
                    for (Pelanggan pe : p){
                        if (pe.getNama().equals(nama_pelanggan)){
                            pelanggan = pe;
                            break;
                        }
                    }
                    Sewa se = new Sewa(pelanggan, kamar, LocalDate.of(tahun,bulan,tanggal));
                    s.add(se);
                    dao_s.insertSewa(se);
                    dao_k.updateKamarStatus(kamar);
                    view.showMessageBox("Data Sewa Berhasil Ditambahkan");
                    k = dao_k.getKamarKosong();
                    loadListKamar();
                    break;
                default:
                    break;
            }
        }
        
    }
    // ============================== Button Handler Layanan Tambahan ==================
    class ButtonOkLayananTambahan implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            switch (ae.getActionCommand()){
                case "Ok":
                    int no_kamar = Integer.parseInt(view.getItemPelangganLayananTambahan().getSelectedItem().toString());
                    int kodeLayanantambahan = Integer.parseInt(view.getItemLayananTambahan().getSelectedItem().toString());
                    int jum = Integer.parseInt(view.getItemJumlahLayananTambahan().getSelectedItem().toString());
                    int tanggal = Integer.parseInt(view.getTglLayananTambahan().getSelectedItem().toString());
                    int bulan = Integer.parseInt(view.getBlnLayananTambahan().getSelectedItem().toString());
                    int tahun = Integer.parseInt(view.getThnLayananTambahan().getSelectedItem().toString());
                    for (Sewa se : s){
                        if (se.getKamar().getNomor() == no_kamar && se.getCheck_out() == null){
                            switch (kodeLayanantambahan) {
                                case 1:
                                    se.tambahLayanan(new Bersihkan_Kamar(100000, LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 2:
                                    se.tambahLayanan(new Laundry(20000, jum, LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 3:
                                    se.tambahLayanan(new Taxi(25000, jum, LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 4:
                                    se.tambahLayanan(new Tambah_Kasur(100000, jum, LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 5:
                                    se.tambahLayanan(new Spa(jum, 200000, "Spa paket 1", LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 6:
                                    se.tambahLayanan(new Spa(jum, 250000, "Spa paket 2", LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 7:
                                    se.tambahLayanan(new Spa(jum, 300000, "Spa paket 3", LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 8:
                                    se.tambahLayanan(new Restoran(jum, 50000, "Kopi", LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 9:
                                    se.tambahLayanan(new Restoran(jum, 15000, "Teh", LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 10:
                                    se.tambahLayanan(new Restoran(jum, 50000, "Nasi Goreng", LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 11:
                                    se.tambahLayanan(new Restoran(jum, 45000, "Burger", LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 12:
                                    se.tambahLayanan(new Makanan_Ringan("Soda", jum, 20000, LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                case 13:
                                    se.tambahLayanan(new Makanan_Ringan("Coklat", jum, 25000, LocalDate.of(tahun,bulan,tanggal)));
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    }
                    dao_lt.insertLayananTambahan(no_kamar, kodeLayanantambahan, jum);
                    break;
                default:
                    break;
            }
        }
    }
    
    class ButtonCheckOutHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            switch (ae.getActionCommand()){
                case "Ok":
                    //int no_kamar = view.getItemNoKamarCheckOut().get;
                    
                    view.getKwitansiPembayaran().setVisible(true);
                    //view.getHarga().setText();
            }
        }
    }
    
    class ButtonKwitansiHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            switch (ae.getActionCommand()){
                case "Ok":
                    
                    break;
                case "Batal":
                    view.getKwitansiPembayaran().dispose();
                    break;
                default:
                    break;
            }
        }
    
    }
}
