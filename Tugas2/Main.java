import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi nama teknisi
        Teknisi teknisi1 = new Teknisi("Budi");
        Teknisi teknisi2 = new Teknisi("Siti");
        Teknisi teknisi3 = new Teknisi("Andi");

        // Inisialisasi barang yang tersedia dengan teknisi yang bertanggung jawab
        Barang[] daftarBarang = {
                new Barang(1, "Laptop", "Asus", "Elektronik", 10, teknisi1),
                new Barang(2, "Proyektor", "Epson", "Elektronik", 5, teknisi2),
                new Barang(3, "Mouse", "Logitech", "Elektronik", 20, teknisi3)
        };

        System.out.println("------------------------- Daftar Barang Tersedia -------------------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-6s | %-7s |\n",
                "Kode Barang", "Nama Barang", "Merk", "Jenis", "Jumlah", "Teknisi");
        System.out.println("--------------------------------------------------------------------------");

        // Cetak data setiap barang
        for (Barang barang : daftarBarang) {
            barang.tampilkanInfo();
        }
        System.out.println("--------------------------------------------------------------------------");

        // Input identitas peminjam
        System.out.print("Masukkan nama peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nimPeminjam = scanner.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelasPeminjam = scanner.nextLine();
        System.out.print("Masukkan program studi: ");
        String prodiPeminjam = scanner.nextLine();

        Peminjam peminjam = new Peminjam(namaPeminjam, nimPeminjam, kelasPeminjam, prodiPeminjam);

        // Input barang yang akan dipinjam
        System.out.print("\nMasukkan kode barang yang ingin dipinjam: ");
        int kodeBarang = scanner.nextInt();

        // Mencari barang berdasarkan kode yang dimasukkan
        Barang barangDipinjam = null;
        for (Barang barang : daftarBarang) {
            if (barang.getKodeBarang() == kodeBarang) {
                barangDipinjam = barang;
                break;
            }
        }

        if (barangDipinjam == null) {
            System.out.println("Barang dengan kode tersebut tidak ditemukan.");
            return;
        }

        // Input jumlah barang yang ingin dipinjam
        System.out.print("Masukkan jumlah barang yang ingin dipinjam: ");
        int jumlahPinjam = scanner.nextInt();

        if (jumlahPinjam > barangDipinjam.getJumlah()) {
            System.out.println("Jumlah barang yang tersedia tidak mencukupi.");
            return;
        }

        // Menentukan tanggal pinjam dan kembali
        Date tanggalPinjam = new Date();
        Date tanggalKembali = new Date(tanggalPinjam.getTime() + (7 * 24 * 60 * 60 * 1000)); // kembali setelah 7 hari

        Peminjaman peminjaman = new Peminjaman(peminjam, barangDipinjam, jumlahPinjam, tanggalPinjam, tanggalKembali);

        // Menampilkan data peminjaman
        peminjaman.tampilkanDataPeminjaman();

        System.out.println("\n--------------- Daftar Barang Tersedia Setelah Peminjaman --------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-6s | %-7s |\n",
                "Kode Barang", "Nama Barang", "Merk", "Jenis", "Jumlah", "Teknisi");
        System.out.println("--------------------------------------------------------------------------");
        for (Barang barang : daftarBarang) {
            barang.tampilkanInfo();
        }
        System.out.println("--------------------------------------------------------------------------");

        scanner.close();
    }
}
