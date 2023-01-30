package class10;

import java.util.Scanner;

public class page157ex33 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double last_entered = 0;
        int count = 0;
        System.out.print("Enter numbers(0 to exit):");
        while (true) {
            double entered = reader.nextDouble();
            if (entered == 0) {
                break;
            }
            if (last_entered > entered) {
                count++;
            }
            last_entered = entered;
        }
        System.out.println(count);
    }
}
