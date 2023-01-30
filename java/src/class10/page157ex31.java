package class10;

import java.util.Scanner;

public class page157ex31 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        char letter = (char) ((int) ('A') + ((int) (Math.random() * (26))));
        System.out.println(letter);
        Boolean guessed = false;
        int i = 1;
        for (; i <= 5; i++) {
            System.out.printf("Enter your guess(you have %s more tries):", (5 - i));
            char guess = reader.next().charAt(0);
            if (guess == letter) {
                guessed = true;
                break;
            }
        }
        if (!guessed) {
            System.out.println("You didn't guessed the right letter\n");
        } else if (i != 5) {
            System.out.printf("You guessed the letter after %s tries\n", i);
        } else {
            System.out.println("You guessed the letter in your last try");
        }
    }
}
