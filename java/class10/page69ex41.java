import java.util.Arrays;
import java.util.Scanner;

public class page69ex41 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Enter hoe many numbers will you enter: ");
        final int N = reader.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter a number: ");
            numbers[i] = reader.nextInt();
        }
        int[] evens = new int[0], odds = new int[0];
        for (int i = 0; i < N; i++) {
            if (numbers[i] % 2 == 0) {
                evens = Arrays.copyOf(evens, evens.length + 1);
                evens[evens.length - 1] = numbers[i];
            } else {
                odds = Arrays.copyOf(odds, odds.length + 1);
                odds[odds.length - 1] = numbers[i];
            }
        }
    }
}