public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok; //Mengatur stok menjadi private

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        this.stok = stk;
    }

    // Getter untuk memanggil data stok dari class inventori
    public int getStok() {
        return stok;
    }

    // Setter untuk mengatur stok supaya hanya bisa ditambah
    public void setStok(int stok) {
        if (stok > 0) {
            this.stok += stok;
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }
}