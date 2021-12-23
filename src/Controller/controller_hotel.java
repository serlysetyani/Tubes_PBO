/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Database.*;
import Manajemen_Hotel.*;
import View.Hotel_interface;
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

}
