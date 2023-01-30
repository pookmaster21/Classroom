package class10;

import java.util.Scanner;

public class page97ex5 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the rank of the worker:");
        int rank = reader.nextInt();
        System.out.println("Enter the number of hours he worked:");
        double hours = reader.nextDouble();
        switch (rank) {
            case 1:
                System.out.println(100 * hours);
                break;
            case 2:
                System.out.println(80 * hours);
                break;
            case 3:
                System.out.println(50 * hours);
                break;
            default:
                System.out.println(20 * hours);
        }
    }
}
