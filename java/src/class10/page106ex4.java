package class10;

import java.util.Scanner;

public class page106ex4 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.println(Math.sqrt(Math.pow(first, 2) + Math.pow(second, 2)));
    }
}
