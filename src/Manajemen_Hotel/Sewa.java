/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen_Hotel;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author A412FL
 */
public class Sewa implements Kwitansi_pembayaran{
    private Pelanggan pemesan;
    private ArrayList<Layanan> service;
    private Kamar kamar;
    private LocalDate check_in, check_out;

    public Sewa(Pelanggan pemesan, Kamar kamar, LocalDate check_in) {
        this.pemesan = pemesan;
        this.kamar = kamar;
        this.check_in = check_in;
        this.service = new ArrayList();
    }
    public Sewa() {
        this.service = new ArrayList();
    }

    public void setPemesan(Pelanggan pemesan) {this.pemesan = pemesan;}
    public void setService(ArrayList<Layanan> service) {this.service = service;}
    public void setCheck_in(LocalDate check_in) {this.check_in = check_in;}
    public void setCheck_out(LocalDate check_out) {this.check_out = check_out;}
    public void setKamar(Kamar kamar){this.kamar = kamar;}
    public Pelanggan getPemesan() {return pemesan;}
    public LocalDate getCheck_in() {return check_in;}
    public LocalDate getCheck_out() {return check_out;}
    public Kamar getKamar(){return kamar;};
    public int getDurasi(){return Period.between(check_in, check_out).getDays();}
    public ArrayList<Layanan> getService() {return service;}
    public String getInfo(){return pemesan.getNama()+" telah menyewa kamar "+kamar.getNomor();}
    
    public void tambahLayanan(Layanan l){
        this.service.add(l);
    };

    @Override
    public int getTotalHarga() {
        int total = this.getKamar().getHarga() * getDurasi();
        ArrayList<Layanan> layananDipesan = this.getService();
        for (int i=0; i<layananDipesan.size();i++){
            total = total + (layananDipesan.get(i).getHarga_layanan()*layananDipesan.get(i).getJumlah_layanan()); 
        }
        return total;
    }
}
