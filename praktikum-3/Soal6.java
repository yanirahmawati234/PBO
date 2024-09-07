import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca dua input sebagai BigInteger
        BigInteger num1 = scanner.nextBigInteger();
        BigInteger num2 = scanner.nextBigInteger();

        // operasi penjumlahan dan perkalian
        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);

        // Mencetak hasil
        System.out.println(sum);
        System.out.println(product);
    }
}
