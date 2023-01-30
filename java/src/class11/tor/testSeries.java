package class11.tor;

import java.util.Scanner;

public class testSeries {
    public static Scanner reader = new Scanner(System.in);
    public static boolean queueOfSeries(Queue<Series> queue) {
        if(queue == null || queue.isEmpty()) {
            return false;
        }

        Series serial1 = queue.head();
        queue.remove();
        Series serial2;

        while (!queue.isEmpty()) {
            serial2 = queue.head();
            queue.remove();

            if(serial1.last() != serial2.getFirst()) {
                return  false;
            }

            serial1 = serial2;
        }

        return true;
    }

    public static void main(String[] args) {
        Queue<Series> queue = new Queue<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter first number: ");
            int first = reader.nextInt();

            System.out.print("Enter difference: ");
            int diff = reader.nextInt();

            System.out.print("Enter the amount of numbers in the series: ");
            int amount = reader.nextInt();

            Series newSerial = new Series(first, diff, amount);
            queue.insert(newSerial);
        }

        System.out.println(queueOfSeries(queue));
    }
}
