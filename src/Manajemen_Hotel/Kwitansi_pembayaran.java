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

    public int getTotalHarga(){
        return 0;
        
    }
}
