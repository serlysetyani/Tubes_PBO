/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
/**
 *
 * @author PC-ASUS
 */
public class Koneksi_DB {
    static final String DB_URL = "jdbc:mysql://localhost/tp_mod12";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public Koneksi_DB() throws SQLException{
        try{
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            stmt = conn.createStatement();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet getData(String SQLString) {
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return rs;
    }
    
    public void query(String SQLString) {
        try {
            stmt.executeUpdate(SQLString);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
