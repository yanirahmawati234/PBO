import java.text.SimpleDateFormat;
import java.util.Date;

public class Peminjaman {
    private Peminjam peminjam;
    private Barang barangDipinjam;
    private int jumlahPinjam;
    private Date tanggalPinjam;
    private Date tanggalKembali;

    public Peminjaman(Peminjam peminjam, Barang barangDipinjam, int jumlahPinjam, Date tanggalPinjam, Date tanggalKembali) {
        this.peminjam = peminjam;
        this.barangDipinjam = barangDipinjam;
        this.jumlahPinjam = jumlahPinjam;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;

        barangDipinjam.kurangiJumlah(jumlahPinjam);
    }

    public void tampilkanDataPeminjaman() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\n------------------------- Detail Peminjaman ---------------------------");
        System.out.println("Nama Peminjam : " + peminjam.getNamaPeminjam());
        System.out.println("NIM           : " + peminjam.getNim());
        System.out.println("Kelas         : " + peminjam.getKelas());
        System.out.println("Program Studi : " + peminjam.getProdi());
        System.out.println("Barang Dipinjam: " + barangDipinjam.getNamaBarang());
        System.out.println("Jumlah        : " + jumlahPinjam);
        System.out.println("Tanggal Pinjam: " + sdf.format(tanggalPinjam));
        System.out.println("Tanggal Kembali: " + sdf.format(tanggalKembali));
        System.out.println("Teknisi       : " + barangDipinjam.getTeknisi().getNamaTeknisi());
        System.out.println("--------------------------------------------------------------------------");
    }
}
