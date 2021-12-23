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
public class Tambah_Kasur {
    private int harga_layanan, jumlah;

    public Tambah_Kasur(int harga_layanan, int jumlah) {
        this.harga_layanan = harga_layanan;
        this.jumlah = jumlah;
    }

    public int getHarga_layanan() {
        return harga_layanan;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    public Tambah_Kasur(){}
}
