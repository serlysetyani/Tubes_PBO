/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen_Hotel;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author A412FL
 */
public class Sewa {
    private Pelanggan pemesan;
    private Layanan[] service;
    private Kamar kamar;
    private LocalDate check_in, check_out;

    public Sewa(Kamar kamar, LocalDate check_in) {
        this.kamar = kamar;
        this.check_in = check_in;
    }

    public void setCheck_in(LocalDate check_in) {this.check_in = check_in;}
    public void setCheck_out(LocalDate check_out) {this.check_out = check_out;}
    public void setKamar(Kamar kamar){this.kamar = kamar;}
    public LocalDate getCheck_in() {return check_in;}
    public LocalDate getCheck_out() {return check_out;}
    public Kamar getKamar(){return kamar;};
    public int getDurasi(){return Period.between(check_in, check_in).getDays();}
    
    public void CheckOut(){// belum tau mau ngapain
        
    }
}
