import java.util.Scanner;

public class page133ex39 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int number = reader.nextInt(), sum = 0;
        for (int i=1;i<=number/2;i++) {
            if (number%i==0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println("The number is perfect");
        } else {
            System.out.println("The number isn't perfect");
        }
    }
}