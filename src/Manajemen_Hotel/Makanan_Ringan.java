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
public class Makanan_Ringan {
    private String nama;
    private int jumlah, harga_layanan;

    public Makanan_Ringan(String nama, int jumlah, int harga_layanan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga_layanan = harga_layanan;
    }

    public Makanan_Ringan(){}
    
    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHarga_layanan() {
        return harga_layanan;
    }
    
    
}
