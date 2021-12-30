package Manajemen_Hotel;

import java.time.LocalDate;

public class Restoran extends Layanan{
    private int jumlah, harga_layanan;
    private String menu;

    public String getMenu() {
        return menu;
    }

    public int getHarga_layanan() {
        return harga_layanan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public Restoran(int jumlah, int harga_layanan, String menu, LocalDate tanggal_dipesan) {
        super(tanggal_dipesan);
        this.jumlah = jumlah;
        this.harga_layanan = harga_layanan;
        this.menu = menu;
    }

    public Restoran() {
    }
}
