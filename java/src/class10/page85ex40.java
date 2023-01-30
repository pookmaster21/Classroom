package class10;

import java.util.Scanner;

public class page85ex40 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the student's garde in the psychometric: ");
        int psychometric = reader.nextInt();
        System.out.println("Enter the student's average grade in the matriculation exams: ");
        double matriculation_exams = reader.nextDouble();
        if (psychometric >= 600 && matriculation_exams >= 90) {
            System.out.println("You are in");
        } else if (psychometric >= 600 && matriculation_exams < 90) {
            System.out.println("You need to higher your grades in the matriculation exams");
        } else if (psychometric < 600 && matriculation_exams >= 90) {
            System.out.println("You need yo higher your grade in the psychometric");
        } else {
            System.out.println("You aren't in");
        }
    }
}
