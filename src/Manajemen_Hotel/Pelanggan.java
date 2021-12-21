/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen_Hotel;

/**
 *
 * @author A412FL
 */
public class Pelanggan {
    private String nama, no_telepon, no_identitas, alamat;

    public String getNama() {return nama;}
    public String getNo_telepon() {return no_telepon;}
    public String getNo_identitas() {return no_identitas;}
    public String getAlamat() {return alamat;}
    
    public void setNama(String nama) {this.nama = nama;}
    public void setNo_telepon(String no_telepon) {this.no_telepon = no_telepon;}
    public void setNo_identitas(String no_identitas) {this.no_identitas = no_identitas;}
    public void setAlamat(String alamat) {this.alamat = alamat;}

    public Pelanggan(String nama, String no_telepon, String no_identitas, String alamat) {
        this.nama = nama;
        this.no_telepon = no_telepon;
        this.no_identitas = no_identitas;
        this.alamat = alamat;
    }
    
    
}
