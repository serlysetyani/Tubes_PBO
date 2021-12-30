/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen_Hotel;

import java.time.LocalDate;

/**
 *
 * @author PC-ASUS
 */
public class Makanan_Ringan extends Layanan{
    //atribut
    private String nama;
    private int jumlah, harga_layanan;

    public String getNama() {return nama;}
    public int getJumlah() {return jumlah;}
    public int getHarga_layanan() {return harga_layanan;}
    
    public Makanan_Ringan(){}
    public Makanan_Ringan(String nama, int jumlah, int harga_layanan, LocalDate tanggal_dipesan) {
        super(tanggal_dipesan);
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga_layanan = harga_layanan;
    }
}
