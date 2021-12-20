package Manajemen_Hotel;

public class Restoran {
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

    public Restoran(int jumlah, int harga_layanan, String menu) {
        this.jumlah = jumlah;
        this.harga_layanan = harga_layanan;
        this.menu = menu;
    }

    public Restoran() {
    }
}
