import java.util.Objects;
import java.util.Scanner;

public class page71ex12 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 2 numbers: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        System.out.println("Enter operator: ");
        String operator = reader.next();
        if (Objects.equals(operator, "+")) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
        } else if (Objects.equals(operator, "-")) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
        }
    }
}
