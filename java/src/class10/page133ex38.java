package class10;

import java.util.Scanner;

public class page133ex38 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the base");
        double base = reader.nextDouble();
        System.out.println("Enter the exponent");
        double exponent = reader.nextDouble();
        double power = 1;
        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }
        System.out.println("The power is " + power);
    }
}