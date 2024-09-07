import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[3];

        // input
        for (int i = 0; i < 3; i++) {
            inputs[i] = scanner.nextLine();
        }

        // Memproses dan mencetak hasil
        System.out.println("================================");
        for (String input : inputs) {
            String[] parts = input.split("\\s+");
            if (parts.length == 2) {
                String str = parts[0];
                try {
                    int num = Integer.parseInt(parts[1]);
                    // Format dan cetak string dan integer
                    System.out.printf("%-15s%03d%n", str, num);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Bagian kedua bukan angka.");
                }
            } else {
                System.out.println("Error: Input tidak sesuai format.");
            }
        }
        System.out.println("================================");
    }
}
