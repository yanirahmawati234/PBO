import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Salesperson[] salesStaff = new Salesperson[10];

        for (int i = 0; i < salesStaff.length; i++) {
            System.out.print("Enter first name, last name, and sales for salesperson #" + (i + 1) + ": ");
            String firstName = scan.next();
            String lastName = scan.next();
            int sales = scan.nextInt();

            salesStaff[i] = new Salesperson(firstName, lastName, sales);
        }

        Sorting.insertionSort(salesStaff);  // Sort in descending order of sales

        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }
    }
}
