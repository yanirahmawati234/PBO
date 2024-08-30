import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inA, inB;

        inA = input.nextLine();
        inB = input.nextLine();

        // LINE 1
        int totalLength;
        totalLength = inA.length() + inB.length();
        System.out.println(totalLength);

        //LINE 2
        int compare = inA.compareTo(inB);
        if (compare == -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // LINE 3
        String result1 = inA.substring(0, 1).toUpperCase() + inA.substring(1).toLowerCase();
        String result2 = inB.substring(0, 1).toUpperCase() + inB.substring(1).toLowerCase();
        System.out.print(result1 + " " + result2);
    }

}
