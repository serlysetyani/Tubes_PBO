/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen_Hotel;

import java.time.LocalDate;

/**
 *
 * @author SUYANTO
 */
public class Makanan extends Layanan{
    //atribut
    private String menu;

    public String getMenu() {return menu;}
    public void setMenu(String menu) {this.menu = menu;}
    
    public Makanan(){};
    public Makanan(String menu, LocalDate tanggal_dipesan, int harga_layanan, int jumlah_layanan, String jenis_layanan) {
        super(tanggal_dipesan, harga_layanan, jumlah_layanan, jenis_layanan);
        this.menu = menu;
    }
    
}
