package class10;

import java.util.Arrays;
import java.util.Scanner;

public class page69ex42 {
    public static Scanner reader = new Scanner(System.in);

    public static int[] getArrayFromUser() {
        int n = 0;
        System.out.print("How much numbers do you want in the array: ");
        while (true) {
            n = reader.nextInt();
            if (n < 1) {
                System.out.print("You need at list one number, try again: ");
            } else {
                break;
            }
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            array[i] = reader.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] first = getArrayFromUser(), second = getArrayFromUser(), both = new int[0];
        int count = 0;
        for (int i = 0; i < first.length; i++) {
            for (int g = 0; g < second.length; g++) {
                if (count == 0) {
                    if (first[i] == second[g]) {
                        both = Arrays.copyOf(both, both.length + 1);
                        both[both.length - 1] = first[i];
                        count++;
                    }
                }
            }
            count = 0;
        }
        System.out.println(Arrays.toString(both));
    }
}
