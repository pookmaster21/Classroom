package class10;

import java.util.Scanner;

public class page97ex7 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the current year:");
        int year = reader.nextInt();
        System.out.println("Enter the current month:");
        int month = reader.nextInt();
        if (month > 12 || month <= 0) {
            System.out.println("Illegal month");
            System.exit(0);
        }
        System.out.println("Enter the current day of the month:");
        int day = reader.nextInt();
        if (day <= 0 || day > 31) {
            System.out.println("Illegal day");
            System.exit(0);
        }
        if (month == 2) {
            if (day > 28) {
                System.out.println("Illegal day");
                System.exit(0);
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Illegal day");
                System.exit(0);
            }
        }
        System.out.println("Legal date");
    }
}
