/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Manajemen_Hotel.*;
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
 * @author SUYANTO
 */
public class DAO_Pelanggan {
    private List<Pelanggan> list;

    public List<Pelanggan> getAllPelanggan() {
        list = new ArrayList();
        ResultSet result;
        try {
            try (Statement statement = Koneksi_DB.getConnection().createStatement()){
                result = statement.executeQuery("SELECT * FROM pelanggan");
                while (result.next()){
                    Pelanggan pelanggan = new Pelanggan();
                    pelanggan.setNo_identitas(Integer.toString(result.getInt(1)));
                    pelanggan.setNama(result.getString(2));
                    pelanggan.setNo_telepon(result.getString(3));
                    pelanggan.setAlamat(result.getString(4));
                    list.add(pelanggan);
                }
            }
            result.close();
            return list;
        } catch (SQLException ex){
            Logger.getLogger(Koneksi_DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }

    public Pelanggan getPelangganByIDPelanggan(int id_pelanggan) {
        Pelanggan pelanggan;
        ResultSet result;
        try {
            try (Statement statement = Koneksi_DB.getConnection().createStatement()){
                result = statement.executeQuery("SELECT * FROM pelanggan WHERE No_identitas = "+id_pelanggan);
                pelanggan = new Pelanggan();
                if (result.next()){
                    pelanggan.setNo_identitas(Integer.toString(result.getInt(1)));
                    pelanggan.setNama(result.getString(2));
                    pelanggan.setNo_telepon(result.getString(3));
                    pelanggan.setAlamat(result.getString(4));
                }
            }
            result.close();
            return pelanggan;
        } catch (SQLException ex){
            Logger.getLogger(Koneksi_DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    
    
    public void insertPelanggan(Pelanggan pelanggan) {
        try {
            Connection connection = Koneksi_DB.getConnection();
            String sql = "INSERT INTO pelanggan (No_Identitas, Nama, No_Telepon, Alamat) VALUES (?,?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, Integer.parseInt(pelanggan.getNo_identitas()));
                statement.setString(2, pelanggan.getNama());
                statement.setString(3, pelanggan.getNo_telepon());
                statement.setString(4, pelanggan.getAlamat());
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
