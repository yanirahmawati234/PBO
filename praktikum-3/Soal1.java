import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        // Pemisahan menjadi alfabet saja
        String[] tokens = s.split("[^A-Za-z]+");

        // Menghitung banyak elemen dalam array
        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}