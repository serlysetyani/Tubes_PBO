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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUYANTO
 */
public class DAO_LayananTambahan {
    private List<Layanan> list;
    
    public void insertLayananTambahan(int id_kmr, int id_layanan, int jum, LocalDate tanggal_dipesan){
        try {
            Connection connection = Koneksi_DB.getConnection();
            String sql = "INSERT INTO layanan_dipesan (id_layanan_dipesan, id_kamar, id_layanan, jumlah_layanan, tanggal_dipesan) VALUES (?,?,?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, null);
                statement.setInt(2, id_kmr);
                statement.setInt(3, id_layanan);
                statement.setInt(4, jum);
                statement.setString(5, tanggal_dipesan.toString());
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_LayananTambahan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Layanan> getLayananTambahanByIDKamar(int noKmr){
        
        ArrayList l = new ArrayList();
        ResultSet result;
        try {
            try (Statement statement = Koneksi_DB.getConnection().createStatement()){
                result = statement.executeQuery("SELECT * FROM layanan_dipesan WHERE id_kamar ="+noKmr);
                while (result.next()){
                    Layanan layanan = new Layanan();
                    switch (result.getInt(3)) {
                        case 1:
                            layanan = new Layanan(result.getDate(5).toLocalDate(), 100000, result.getInt(4), "Bersihkan Kamar");
                            break;
                        case 2:
                            layanan = new Layanan(result.getDate(5).toLocalDate(), 20000, result.getInt(4), "Laundry");
                            break;
                        case 3:
                            layanan = new Layanan(result.getDate(5).toLocalDate(), 25000, result.getInt(4), "Taxi");
                            break;
                        case 4:
                            layanan = new Layanan(result.getDate(5).toLocalDate(), 100000, result.getInt(4), "Tambah Kasur");
                            break;
                        case 5:
                            layanan = new Layanan(result.getDate(5).toLocalDate(), 200000, result.getInt(4), "Spa paket 1");
                            break;
                        case 6:
                            layanan = new Layanan(result.getDate(5).toLocalDate(), 250000, result.getInt(4), "Spa paket 2");
                            break;
                        case 7:
                            layanan = new Layanan(result.getDate(5).toLocalDate(), 300000, result.getInt(4), "Spa paket 3");
                            break;
                        case 8:
                            layanan = new Makanan("Kopi", result.getDate(5).toLocalDate(), 50000, result.getInt(4), "Restoran");
                            break;
                        case 9:
                            layanan = new Makanan("Teh", result.getDate(5).toLocalDate(), 15000, result.getInt(4), "Restoran");
                            break;
                        case 10:
                            layanan = new Makanan("Nasi Goreng", result.getDate(5).toLocalDate(), 50000, result.getInt(4), "Restoran");
                            break;
                        case 11:
                            layanan = new Makanan("Burger", result.getDate(5).toLocalDate(), 45000, result.getInt(4), "Restoran");
                            break;
                        case 12:
                            layanan = new Makanan("Soda", result.getDate(5).toLocalDate(), 20000, result.getInt(4), "Makanan Ringan");
                            break;
                        case 13:
                            layanan = new Makanan("Coklat", result.getDate(5).toLocalDate(), 25000, result.getInt(4), "Makanan Ringan");
                            break;
                        default:
                            break;
                    }
                    l.add(layanan);
                }
            }
            result.close();
            return l;
        } catch (SQLException ex){
            Logger.getLogger(Koneksi_DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
