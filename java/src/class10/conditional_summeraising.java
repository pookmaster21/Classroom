package class10;

import java.util.Scanner;

public class conditional_summeraising {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        final int NO_OF_STUDENTS = 200;
        int score;
        int sum = 0;
        int excellent_tests = 0;
        int failed_tests = 0;
        for (int i = 1;i <= NO_OF_STUDENTS; i++) {
            System.out.println("Enter the students score: ");
            score = reader.nextInt();
            sum = sum + score;
            if (score < 55) {
                failed_tests++;
            } else if (score > 95) {
                excellent_tests++;
            }
        }
        System.out.println("The score summery is " + sum);
        System.out.println("The number of failed tests is " + failed_tests);
        System.out.println("The percentage of test scores that are above 95 is  " + excellent_tests);
    }
}
