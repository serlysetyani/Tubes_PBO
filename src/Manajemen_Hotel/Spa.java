package Manajemen_Hotel;

public class Spa {
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

    public Spa(int jumlah, int harga_layanan, String paket) {
        this.jumlah = jumlah;
        this.harga_layanan = harga_layanan;
        this.paket = paket;
    }

    public Spa() {
    }
}
