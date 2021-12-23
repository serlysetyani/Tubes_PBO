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
public class Taxi {
    private int harga_layanan;
    private String no_plate;

    public int getHarga_layanan() {
        return harga_layanan;
    }

    public String getNo_plate() {
        return no_plate;
    }
    
    public Taxi(){
    }

    public Taxi(int harga_layanan, String no_plate) {
        this.harga_layanan = harga_layanan;
        this.no_plate = no_plate;
    }
}
