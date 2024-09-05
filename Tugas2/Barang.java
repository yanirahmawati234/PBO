public class Barang {
    private int kodeBarang;
    private String namaBarang;
    private String jenisBarang;
    private String merkBarang;
    private int jumlah;
    private Teknisi teknisi;

    public Barang(int kodeBarang, String namaBarang, String merkBarang, String jenisBarang, int jumlah, Teknisi teknisi) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.merkBarang = merkBarang;
        this.jenisBarang = jenisBarang;
        this.jumlah = jumlah;
        this.teknisi = teknisi;
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public Teknisi getTeknisi() {
        return teknisi;
    }

    public void kurangiJumlah(int jumlahPinjam) {
        this.jumlah -= jumlahPinjam;
    }

    public void tampilkanInfo() {
        System.out.printf("| %-11d | %-11s | %-10s | %-10s | %-6d | %-7s |\n",
                kodeBarang, namaBarang, merkBarang, jenisBarang, jumlah, teknisi.getNamaTeknisi());
    }
}
