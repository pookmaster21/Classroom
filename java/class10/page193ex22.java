import java.util.Scanner;

public class page193ex22 {
    public static Scanner reader = new Scanner(System.in);

    public static int checkSameDigits(int number) {
        int digit = number % 10;
        while (number != 0) {
            int current_digit = number % 10;
            number = number / 10;
            if (current_digit != digit) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int count = 0;
        int number;
        while (true) {
            System.out.println("Enter a number:");
            number = reader.nextInt();
            if (checkSameDigits(number) == 1) {
                break;
            }
            count++;
        }
        System.out.printf("The final number is %s and there were %s numbers before the final number\n", number, count);
    }
}
