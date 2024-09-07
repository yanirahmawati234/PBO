import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] part;
        int A, B, hasil;
        String operator;

        // Memisahkan string berdasarkan spasi
        part = s.split("\\s+");
        A = Integer.valueOf(part[0]);
        B = Integer.valueOf(part[2]);
        operator = part[1];

        // Memeriksa operator dan menghitung hasil
        if (operator.equals("+")) {
            hasil = A + B;
        } else if (operator.equals("-")) {
            hasil = A - B;
        } else if (operator.equals("*")) {
            hasil = A * B;
        } else if (operator.equals("/")) {
            hasil = A / B;
        } else {
            hasil = A % B;
        }

        // Mencetak hasil
        System.out.println(hasil);
    }
}
