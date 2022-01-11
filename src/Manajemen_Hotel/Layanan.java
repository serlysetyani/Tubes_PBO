/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen_Hotel;

import java.time.LocalDate;

/**
 *
 * @author A412FL
 */
public class Layanan {
    private LocalDate tanggal_dipesan;
    private int harga_layanan;
    private int jumlah_layanan;
    private String jenis_layanan;

    public Layanan(LocalDate tanggal_dipesan, int harga_layanan, int jumlah_layanan, String jenis_layanan) {
        this.tanggal_dipesan = tanggal_dipesan;
        this.harga_layanan = harga_layanan;
        this.jumlah_layanan = jumlah_layanan;
        this.jenis_layanan = jenis_layanan;
    }
    public Layanan() {}

    public void setTanggal_dipesan(LocalDate tanggal_dipesan) {this.tanggal_dipesan = tanggal_dipesan;}
    public LocalDate getTanggal_dipesan() {return tanggal_dipesan;}
    public int getHarga_layanan() {return harga_layanan;}
    public void setHarga_layanan(int harga_layanan) {this.harga_layanan = harga_layanan;}
    public int getJumlah_layanan() {return jumlah_layanan;}
    public void setJumlah_layanan(int jumlah_layanan) {this.jumlah_layanan = jumlah_layanan;}
    public String getJenis_layanan() {return jenis_layanan;}
    public void setJenis_layanan(String jenis_layanan) {this.jenis_layanan = jenis_layanan;}
    
}
