package class10;

import java.util.Scanner;

public class page184ex8 {
    public static Scanner reader = new Scanner(System.in);

    public static int min_divider(int num1, int num2) {
        int divider = -1;
        for (int i = 2; i <= Math.max(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                divider = i;
                break;
            }
        }
        return divider;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Enter the first number of the %s pair:", i);
            int first_entered_number = reader.nextInt();
            System.out.printf("Enter the second number of the %s pair:", i);
            int second_entered_number = reader.nextInt();
            if (min_divider(first_entered_number, second_entered_number) == -1) {
                count++;
            }
        }
        System.out.printf("There are %s pairs with no divider\n", count);
    }
}