/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Manajemen_Hotel.Kamar;
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
public class DAO_Kamar {
    private List<Kamar> list;
    public List<Kamar> getKamarKosong() {
        list = new ArrayList();
        ResultSet result;
        try {
            try (Statement statement = Koneksi_DB.getConnection().createStatement()){
                result = statement.executeQuery("SELECT * FROM kamar WHERE status = 'kosong'");
                while (result.next()){
                    Kamar kamar = new Kamar();
                    kamar.setNomor(result.getInt(1));
                    kamar.setTipe(result.getString(2));
                    kamar.setHarga(result.getInt(3));
                    kamar.setStatus(result.getString(4));
                    list.add(kamar);
                }
            }
            result.close();
            return list;
        } catch (SQLException ex){
            Logger.getLogger(Koneksi_DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    
    public Kamar getKamarByIDKamar(int no_kamar) {
        Kamar kamar;
        ResultSet result;
        try {
            try (Statement statement = Koneksi_DB.getConnection().createStatement()){
                result = statement.executeQuery("SELECT * FROM kamar WHERE nomor_kamar = "+no_kamar);
                kamar = new Kamar();
                if (result.next()){
                    kamar.setNomor(result.getInt(1));
                    kamar.setTipe(result.getString(2));
                    kamar.setHarga(result.getInt(3));
                    kamar.setStatus(result.getString(4));
                }
            }
            result.close();
            return kamar;
        } catch (SQLException ex){
            Logger.getLogger(Koneksi_DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    
    public void updateKamarStatus(Kamar kamar){
        try {
            Connection connection = Koneksi_DB.getConnection();
            String sql = "UPDATE kamar SET status = ? WHERE nomor_kamar = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, kamar.getStatus());
                statement.setInt(2, kamar.getNomor());
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Kamar> getKamarTerisi() {
        list = new ArrayList();
        ResultSet result;
        try {
            try (Statement statement = Koneksi_DB.getConnection().createStatement()){
                result = statement.executeQuery("SELECT * FROM kamar WHERE status = 'terisi'");
                while (result.next()){
                    Kamar kamar = new Kamar();
                    kamar.setNomor(result.getInt(1));
                    kamar.setTipe(result.getString(2));
                    kamar.setHarga(result.getInt(3));
                    kamar.setStatus(result.getString(4));
                    list.add(kamar);
                }
            }
            result.close();
            return list;
        } catch (SQLException ex){
            Logger.getLogger(Koneksi_DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
}
