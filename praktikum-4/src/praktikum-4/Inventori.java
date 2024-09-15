public class Inventori {
    private Barang[] barangs;

    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    //Menampilkan barang beserta stok dengan menggunakan method getStock
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" +
                barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" +
                barangs[1].getStok() + ")");
    }

    //Menambah stok persediaan barang dengan menggunakan method setStok
    void pengadaan() {
        initBarang();
        barangs[0].setStok(20);;
        barangs[0].setStok(-20);
        showBarang();
    }
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}