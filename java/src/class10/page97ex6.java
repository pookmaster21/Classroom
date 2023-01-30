package class10;

import java.util.Scanner;

public class page97ex6 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the first players points:");
        int points_first = reader.nextInt();
        switch (points_first) {
            case 0:
            case 15:
            case 30:
            case 45:
            case 60:
                break;
            default:
                System.out.println("Illegal");
                System.exit(0);
        }
        System.out.println("Enter the second players points:");
        int points_second = reader.nextInt();
        switch (points_second) {
            case 0:
            case 15:
            case 30:
            case 45:
            case 60:
                System.out.println("The differential between the first player and the second is "
                        + (points_first - points_second));
                break;
            default:
                System.out.println("Illegal");
                System.exit(0);
        }
    }
}
