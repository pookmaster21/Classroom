package class10;

import java.util.Scanner;

public class page85ex42 {
    public static Scanner reader = new Scanner(System.in);

    public static double most(double first, double second, double third, double fourth) {
        if (first > second && first > third && first > fourth) {
            return first;
        } else if (second > first && second > third && second > fourth) {
            return second;
        } else if (third > first && third > second && third > fourth) {
            return third;
        } else {
            return fourth;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the first person's bid: ");
        double first = reader.nextDouble();
        System.out.println("Enter the second person's bid: ");
        double second = reader.nextDouble();
        System.out.println("Enter the third person's bid: ");
        double third = reader.nextDouble();
        System.out.println("Enter the fourth person's bid: ");
        double fourth = reader.nextDouble();
        System.out.println("The car was bought for " + most(first, second, third, fourth));
    }
}
