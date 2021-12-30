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
public class Taxi extends Layanan{
    //atribut
    private int harga_layanan;
    private int km_ditempuh;

    public int getHarga_layanan() {return harga_layanan;}
    public int getKm_ditempuh() {return km_ditempuh;}
    
    public Taxi(){}
    public Taxi(int harga_layanan, int km_ditempuh, LocalDate tanggal_dipesan) {
        super(tanggal_dipesan);
        this.harga_layanan = harga_layanan;
        this.km_ditempuh = km_ditempuh;
    }
    
}
