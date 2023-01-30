package class10;

import java.util.Scanner;

public class page158ex36 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double last_entered = 0;
        int count = 0, most_count = 0;
        System.out.print("Enter numbers(0 to exit):");
        while (true) {
            double entered = reader.nextDouble();
            if (entered == 0) {
                break;
            }
            if (entered > last_entered) {
                count++;
            } else {
                count = 0;
            }
            if (count > most_count) {
                most_count = count;
            }
            last_entered = entered;
        }
        if (count == 0) {
            System.out.println(count);
        } else {
            System.out.println(count + 1);
        }
    }
}
