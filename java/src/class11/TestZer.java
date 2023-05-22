package class11;

import java.util.Scanner;

public class TestZer {
    public static Scanner reader = new Scanner(System.in);
    public static Zer readFlowers() {
        char answer = 'Y';

        System.out.println("Enter the bouquet name: ");
        String name = reader.nextLine();

        Zer newZer = new Zer(name);

        while (answer == 'Y') {
            System.out.println("Enter the flower name: ");
            name = reader.nextLine();

            System.out.println("Enter the flower color: ");
            String color = reader.nextLine();

            System.out.println("Enter the flower length: ");
            int length = reader.nextInt();

            System.out.println("Enter the flowering season: ");
            String season = reader.next();

            newZer.addFlower(new Flower(name, color, length, season));

            System.out.println("Do you want to add a new flower(Y/N): ");
            answer = reader.next().charAt(0);
        }

        return newZer;
    }

    public static void main(String[] args) {
        Zer zer1 = readFlowers();
        Zer zer2 = readFlowers();

        System.out.println(zer1.toString());
        System.out.println(zer2.toString());

        boolean same = zer1.sameFlowers(zer2);

        if (same) {
            System.out.println("The bounquets have the same flowers");
        } else {
            System.out.println("The bounquets don't have the same flowers");
        }
    }
}

