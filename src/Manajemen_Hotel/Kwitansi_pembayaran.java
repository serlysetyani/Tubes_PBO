/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen_Hotel;

import java.util.ArrayList;

/**
 *
 * @author SUYANTO
 */
public class Kwitansi_pembayaran {
    //atribut
    private ArrayList<Sewa> menyewa = new ArrayList();

    public Kwitansi_pembayaran() {}
    public Kwitansi_pembayaran(Sewa s) {
        this.menyewa.add(s);
    }
    public void tambahSewa(Sewa s){
        this.menyewa.add(s);
    }
    public void DetailHarga(){
        for (Sewa s : menyewa){
            System.out.println("Kamar: no "+s.getKamar().getNomor());
            System.out.println(" - Harga:  "+s.getKamar().getHarga());
            System.out.println(" - Durasi: "+s.getDurasi());
            System.out.println(" - Layanan tambahan:");
            //for (Layanan l : s.g) ambil service nya
        }
        
    }
    public int getTotalHarga(){
        return 0;
    }
}
