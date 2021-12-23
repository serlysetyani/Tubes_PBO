/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Manajemen_Hotel.*;
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
public class DAO {
    private List<Pelanggan> list;

    public List<Pelanggan> getAllPelanggan() {
         list = new ArrayList();
        ResultSet result;
        try {
            try (Statement statement = Koneksi_DB.getConnection().createStatement()){
                result = statement.executeQuery("SELECT * FROM pelanggan");
                while (result.next()){
                    Pelanggan pelanggan = new Pelanggan();
                    pelanggan.setNo_identitas(result.getString(1));
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
    
}
