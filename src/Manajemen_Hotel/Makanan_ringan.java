/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen_Hotel;

/**
 *
 * @author SUYANTO
 */
public class Makanan_ringan extends Layanan{
    //atribut
    private String nama;
    private int harga_layanan;
    private int jumlah;

    public String getNama() {return nama;}
    public int getHarga_layanan() {return harga_layanan;}
    public int getJumlah() {return jumlah;}
    
    public Makanan_ringan() {}
    public Makanan_ringan(String nama, int harga_layanan, int jumlah) {
        this.nama = nama;
        this.harga_layanan = harga_layanan;
        this.jumlah = jumlah;
    }
    
    
}
