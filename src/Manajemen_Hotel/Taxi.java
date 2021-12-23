/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen_Hotel;

/**
 *
 * @author PC-ASUS
 */
public class Taxi {
    private int harga_layanan;
    private String no_plat;

    public Taxi(int harga_layanan, String no_plat) {
        this.harga_layanan = harga_layanan;
        this.no_plat = no_plat;
    }

    public int getHarga_layanan() {
        return harga_layanan;
    }

    public String getNo_plat() {
        return no_plat;
    }
    
    public Taxi(){}
}
