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
import java.util.List;
import javax.swing.DefaultListModel;
/**
 *
 * @author SUYANTO
 */
public class controller_hotel {
    private Hotel_interface view;
    private List<Pelanggan> p;
    private DAO dao;

    public controller_hotel(Hotel_interface view) {
        this.view = view;
        this.dao = new DAO();
        this.p = dao.getAllPelanggan();
        // buat form pendaftaran
        view.addButtonListenerPendaftaran(new ButtonHandlerPendaftaran());
        loadList();
    }

    public controller_hotel() {}
    
    public void loadList(){
        DefaultListModel<String> names = new DefaultListModel();
        for (int i = 0; i < p.size(); i++){
           names.addElement(p.get(i).getNama());
        }
        view.getListPelanggan().setModel(names);
    }

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
                    dao.insertPelanggan(pelanggan);
                    p.add(pelanggan);
                    loadList();
                    break;
                 default:
                    break;
             }
        }
    
    }
}
