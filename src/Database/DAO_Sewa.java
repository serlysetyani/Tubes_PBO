/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Manajemen_Hotel.Kamar;
import Manajemen_Hotel.Sewa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A412FL
 */
public class DAO_Sewa {
    private List<Sewa> list;
    private DAO_Kamar dao_k;
    private DAO_Pelanggan dao_p;
    private DAO_LayananTambahan dao_lt;

    public void insertSewa(Sewa sewa) {
        try {
            Connection connection = Koneksi_DB.getConnection();
            String sql = "INSERT INTO sewa (id_sewa ,check_in, check_out, id_pelanggan, id_kamar) VALUES (?,?,?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, null);
                statement.setString(2, sewa.getCheck_in().toString());
                statement.setString(3, null);
                statement.setInt(4, Integer.parseInt(sewa.getPemesan().getNo_identitas()));
                statement.setInt(5, sewa.getKamar().getNomor());
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    public List<Sewa> getAllSewaCheckOutNULL() {
        dao_k = new DAO_Kamar();
        dao_p = new DAO_Pelanggan();
        dao_lt = new DAO_LayananTambahan();
        list = new ArrayList();
        ResultSet result;
        try {
            try (Statement statement = Koneksi_DB.getConnection().createStatement()){
                result = statement.executeQuery("SELECT * FROM sewa WHERE check_out IS NULL ORDER BY id_kamar ASC");
                while (result.next()){
                    Sewa sewa = new Sewa();
                    sewa.setCheck_in(result.getDate(2).toLocalDate());
                    sewa.setCheck_out(null);
                    sewa.setPemesan(dao_p.getPelangganByIDPelanggan(result.getInt(4)));
                    sewa.setKamar(dao_k.getKamarByIDKamar(result.getInt(5)));
                    sewa.setService(dao_lt.getLayananTambahanByIDKamar(result.getInt(5)));
                    list.add(sewa);
                }
            }
            result.close();
            return list;
        } catch (SQLException ex){
            Logger.getLogger(Koneksi_DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public Sewa getAllSewaByIdKamar(int no_kamar) {
        dao_k = new DAO_Kamar();
        dao_p = new DAO_Pelanggan();
        Sewa sewa = new Sewa();
        ResultSet result;
        try {
            try (Statement statement = Koneksi_DB.getConnection().createStatement()){
                result = statement.executeQuery("SELECT * FROM sewa WHERE id_kamar ="+no_kamar);
                if (result.next()){
                    sewa.setCheck_in(result.getDate(2).toLocalDate());
                    sewa.setCheck_out(null);
                    sewa.setPemesan(dao_p.getPelangganByIDPelanggan(result.getInt(4)));
                    sewa.setKamar(dao_k.getKamarByIDKamar(result.getInt(5)));
                }
            }
            result.close();
            return sewa;
        } catch (SQLException ex){
            Logger.getLogger(Koneksi_DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void updateSewaCheckOut(Sewa sewa){
        try {
            Connection connection = Koneksi_DB.getConnection();
            String sql = "UPDATE sewa SET check_out = ? WHERE id_kamar ="+sewa.getKamar().getNomor();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, sewa.getCheck_out().toString());
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
