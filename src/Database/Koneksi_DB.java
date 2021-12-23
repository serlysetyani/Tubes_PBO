/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC-ASUS
 */
public class Koneksi_DB {
    
    public static Connection connection;
    public static Connection getConnection() throws SQLException{
        if (connection == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manajemen_hotel","root","");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Koneksi_DB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
}
