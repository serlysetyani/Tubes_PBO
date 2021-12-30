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

    public Layanan(LocalDate tanggal_dipesan) {this.tanggal_dipesan = tanggal_dipesan;}
    public Layanan() {}

    public void setTanggal_dipesan(LocalDate tanggal_dipesan) {this.tanggal_dipesan = tanggal_dipesan;}
    public LocalDate getTanggal_dipesan() {return tanggal_dipesan;}
}
