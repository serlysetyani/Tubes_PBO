package Manajemen_Hotel;

import java.time.LocalDate;

public class Spa extends Layanan{
    private int jumlah, harga_layanan;
    private String paket;

    public int getHarga_layanan() {
        return harga_layanan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getPaket() {
        return paket;
    }

    public Spa(int jumlah, int harga_layanan, String paket, LocalDate tanggal_dipesan) {
        super(tanggal_dipesan);
        this.jumlah = jumlah;
        this.harga_layanan = harga_layanan;
        this.paket = paket;
    }

    public Spa() {
    }
}
