/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUYANTO
 */
public class DAO_LayananTambahan {
    
    public void insertLayananTambahan(int id_kmr, int id_layanan, int jum){
        try {
            Connection connection = Koneksi_DB.getConnection();
            String sql = "INSERT INTO layanan_dipesan (id_layanan_dipesan, id_kamar, id_layanan, jumlah_layanan VALUES (?,?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, null);
                statement.setInt(2, id_kmr);
                statement.setInt(3, id_layanan);
                statement.setInt(4, jum);
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
