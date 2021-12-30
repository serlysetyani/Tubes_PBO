package Manajemen_Hotel;

import java.time.LocalDate;

public class Bersihkan_Kamar extends Layanan{
    private int harga_layanan;

    public int getHarga_layanan() {
        return harga_layanan;
    }

    public Bersihkan_Kamar(int harga_layanan, LocalDate tanggal_dipesan) {
        super(tanggal_dipesan);
        this.harga_layanan = harga_layanan;
    }

    public Bersihkan_Kamar() {
    }
}
