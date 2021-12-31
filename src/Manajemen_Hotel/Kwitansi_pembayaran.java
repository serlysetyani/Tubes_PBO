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

    public int getTotalHarga(Sewa s){
        int total = s.getKamar().getHarga() * s.getDurasi();
        ArrayList<Layanan> layananDipesan = s.getService();
        for (int i=0; i<layananDipesan.size();i++){
            if (layananDipesan.get(i) instanceof Bersihkan_Kamar){
                Bersihkan_Kamar bk = (Bersihkan_Kamar)layananDipesan.get(i);
                total = total + bk.getHarga_layanan();
            } else if (layananDipesan.get(i) instanceof Laundry){
                Laundry l = (Laundry)layananDipesan.get(i);
                total = total + l.getBerat_per_kg()*l.getHarga_layanan();
            } else if (layananDipesan.get(i) instanceof Taxi){
                Taxi t = (Taxi)layananDipesan.get(i);
                total = total + t.getHarga_layanan()*t.getKm_ditempuh();
            } else if (layananDipesan.get(i) instanceof Tambah_Kasur){
                Tambah_Kasur tk = (Tambah_Kasur)layananDipesan.get(i);
                total = total + tk.getHarga_layanan()*tk.getJumlah();
            } else if (layananDipesan.get(i) instanceof Spa){
                Spa sp = (Spa)layananDipesan.get(i);
                total = total + sp.getHarga_layanan()*sp.getJumlah();
            } else if (layananDipesan.get(i) instanceof Restoran){
                Restoran r = (Restoran)layananDipesan.get(i);
                total = total + r.getHarga_layanan()*r.getJumlah();
            } else if (layananDipesan.get(i) instanceof Makanan_Ringan){
                Makanan_Ringan mk = (Makanan_Ringan)layananDipesan.get(i);
                total = total + mk.getHarga_layanan()*mk.getJumlah();
            } 
        }
        return total;
        
    }
}
