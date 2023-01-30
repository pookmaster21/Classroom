package class10;

import java.util.Scanner;

public class page138ex53 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        String car = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter the license plate number for car number " + i);
            car = car + reader.next() + " ";
            System.out.println("Enter the time for car number " + i + " (in minutes)");
            double time = reader.nextDouble();
            if (time > 5) {
                System.out.println("You didn't pass");
            } else if (time < 4) {
                count++;
            }
            sum = sum + time;
        }
        System.out.println("The number of cars that finished in less than 4 minutes is " + count);
        System.out.println("The license plate numbers of the cars that finished in less than 4 minutes are " + car);
        System.out.println("The summery of the time that took to the cars to finish is " + (sum / 40) + " minutes");
    }
}