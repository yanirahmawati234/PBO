import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String plat;
        String gabungan;
        long konversi, hasil;

        // Proses penggabungan dan Konversi
        plat = input.nextLine();
        gabungan = plat.replace(" ", "");
        System.out.println(gabungan);
        konversi = Long.valueOf(gabungan);

        // Melakukan operasi aritmatika
        hasil = (konversi - 999999) % 5;

        // Menentukan apakah berhenti atau jalan
        if (hasil == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
}
