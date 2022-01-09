/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Manajemen_Hotel.Bersihkan_Kamar;
import Manajemen_Hotel.Laundry;
import Manajemen_Hotel.Layanan;
import Manajemen_Hotel.Makanan_Ringan;
import Manajemen_Hotel.Restoran;
import Manajemen_Hotel.Spa;
import Manajemen_Hotel.Tambah_Kasur;
import Manajemen_Hotel.Taxi;
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
    /*
    public List<Layanan> getLayananTambahanByIdKamar(int id_kamar){
        list = new ArrayList();
        ResultSet result;
        try {
            try (Statement statement = Koneksi_DB.getConnection().createStatement()){
                result = statement.executeQuery("SELECT * FROM layanan_dipesan WHERE id_kamar = "+id_kamar);
                while (result.next()){
                    switch (result.getInt(3)) {
                        case 1:
                            list.add(new Bersihkan_Kamar(100000, result.));
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
            }
            result.close();
            return list;
        } catch (SQLException ex){
            Logger.getLogger(Koneksi_DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    */
}
