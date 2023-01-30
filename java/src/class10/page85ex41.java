package class10;

import java.util.Objects;
import java.util.Scanner;

public class page85ex41 {
    public static Scanner reader = new Scanner(System.in);

    public static String category(double age) {
        if (age < 8) {
            return " A ";
        } else if (8 <= age && age < 13) {
            return " B ";
        } else if (13 <= age && age <= 17) {
            return " C ";
        }
        return " no category ";
    }

    public static void main(String[] args) {
        System.out.println("Enter the first fighter's age: ");
        double first_age = reader.nextDouble();
        System.out.println("Enter the first fighter's gender: ");
        String first_gender = reader.next();
        System.out.println("Enter the second fighter's age: ");
        double second_age = reader.nextDouble();
        System.out.println("Enter the second fighter's gender: ");
        String second_gender = reader.next();
        String first_category = category(first_age);
        String second_category = category(second_age);
        System.out.println("The first fighter's category is" + first_category + "the second fighter's category is"
                + second_category);
        if (Objects.equals(first_category, second_category) && Objects.equals(first_gender, second_gender)) {
            System.out.println("The two fighters can fight each other");
        } else {
            System.out.println("The two fighters can't fight each other");
        }
    }
}
