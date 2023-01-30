package class10;

import java.util.Scanner;

public class page193ex20 {
    public static Scanner reader = new Scanner(System.in);

    public static double minutes(double hours, double minutes) {
        return (minutes + hours * 60);
    }

    public static double minutes_differental(double hours1, double minutes1, double hours2, double minutes2) {
        return minutes(hours1, minutes1) - minutes(hours2, minutes2);
    }

    public static void main(String[] args) {
        double entered;
        int most = 0;
        double most_differental = 0;
        for (int i = 1; i <= 30; i++) {
            System.out.println("Enter the starting hour and minute of work(for example: 7.40):");
            entered = reader.nextDouble();
            int starting_minutes = (int) entered % 1 * 10;
            int starting_hours = (int) (entered - starting_minutes);
            System.out.println("Enter the finishing hour and minute of work(for example: 19.40):");
            entered = reader.nextDouble();
            int finishing_minutes = (int) entered % 1 * 10;
            int finishing_hours = (int) (entered - finishing_minutes);
            double differental = minutes_differental(starting_hours, starting_minutes, finishing_hours,
                    finishing_minutes);
            if (differental > most_differental) {
                most_differental = differental;
                most = i;
            }
        }
        System.out.printf("The day that the worker worked the most is day number %s", most);
    }
}
