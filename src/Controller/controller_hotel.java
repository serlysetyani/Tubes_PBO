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
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
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

    public controller_hotel(Hotel_interface view) {
        this.view = view;
        this.dao_p = new DAO_Pelanggan();
        this.dao_k = new DAO_Kamar();
        this.dao_s = new DAO_Sewa();
        this.p = dao_p.getAllPelanggan();
        this.k = dao_k.getKamarKosong();
        this.s = new ArrayList();
        
        // buat form pendaftaran
        view.addButtonListenerPendaftaran(new ButtonHandlerPendaftaran());
        loadList();
        // buat form check in
        view.addButtonListenerCheckIn(new ButtonOkCheckInHandler());
        loadListNamaPendaftar();
        loadListKamar();

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
        for (int i = 0; i < p.size(); i++){
           view.getItemPelangganCheckIn().addItem(p.get(i).getNama());
        }
    }
    
    public void loadListKamar(){
        for (int i = 0; i < k.size(); i++){
           view.getItemPilihKamarCheckIn().addItem(Integer.toString(k.get(i).getNomor()));
        }
    }

    // ================================= buat layanan tambahan ================
    
    
    // ==================================== Button Handler ===========================================
    // ======================= Pendaftaran =============================
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
                            kamar.setStatus("Terisi");
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
                    break;
                default:
                    break;
            }
        }
        
    }
}
