import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
        System.out.print("Masukan Jumlah yang akan di test: ");
        int t = scanner.nextInt(); // Membaca jumlah test case dari input pengguna

        for (int i = 0; i < t; i++) { // Melakukan loop sebanyak jumlah test case yang dimasukkan
            try {
                long n = scanner.nextLong(); // Membaca input pengguna sebagai tipe data long

                // Menangani kasus di mana nilai dapat dimasukkan dalam tipe data tertentu
                System.out.println(n + " can be fitted in:"); // Menampilkan nilai yang sedang diuji
                boolean canBeFitted = false; // Inisialisasi flag untuk melacak apakah nilai dapat dimasukkan ke tipe data tertentu

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) { // Memeriksa apakah nilai dapat dimasukkan ke dalam tipe data byte
                    System.out.println("* byte"); // Menampilkan bahwa nilai dapat dimasukkan ke dalam byte
                    canBeFitted = true; // Mengatur flag bahwa nilai dapat dimasukkan ke tipe data byte
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) { // Memeriksa apakah nilai dapat dimasukkan ke dalam tipe data short
                    System.out.println("* short"); // Menampilkan bahwa nilai dapat dimasukkan ke dalam short
                    canBeFitted = true; // Mengatur flag bahwa nilai dapat dimasukkan ke tipe data short
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) { // Memeriksa apakah nilai dapat dimasukkan ke dalam tipe data int
                    System.out.println("* int"); // Menampilkan bahwa nilai dapat dimasukkan ke dalam int
                    canBeFitted = true; // Mengatur flag bahwa nilai dapat dimasukkan ke tipe data int
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) { // Memeriksa apakah nilai dapat dimasukkan ke dalam tipe data long
                    System.out.println("* long"); // Menampilkan bahwa nilai dapat dimasukkan ke dalam long
                    canBeFitted = true; // Mengatur flag bahwa nilai dapat dimasukkan ke tipe data long
                }

                if (!canBeFitted) { // Jika nilai tidak dapat dimasukkan ke dalam tipe data apapun
                    System.out.println(n + " can't be fitted anywhere."); // Menampilkan pesan bahwa nilai tidak bisa dimasukkan ke mana pun
                }
            } catch (Exception e) { // Menangkap exception jika input tidak bisa diproses sebagai long (misalnya input bukan angka)
                System.out.println(scanner.next() + " can't be fitted anywhere."); // Menampilkan pesan bahwa input tidak valid dan tidak bisa dimasukkan ke mana pun
            }
        }
        scanner.close(); // Menutup scanner setelah selesai digunakan untuk menghindari kebocoran memori
    }
}
