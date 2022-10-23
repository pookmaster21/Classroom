import java.util.Scanner;

public class page85ex44 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how much votes Niv got: ");
        int Niv = reader.nextInt();
        System.out.println("Enter how much votes Dana got: ");
        int Dana = reader.nextInt();
        System.out.println("Enter how much votes Naama got: ");
        int Naama = reader.nextInt();
        if (Niv > Dana) {
            if (Niv > Naama) {
                System.out.println("Niv first");
                if (Naama > Dana) {
                    System.out.println("Naama second");
                    System.out.println("Dana third");
                } else {
                    System.out.println("Dana second");
                    System.out.println("Naama third");
                }
            } else {
                System.out.println("Naama first");
                System.out.println("Niv second");
                System.out.println("Dana third");
            }
        } else {
            if (Niv > Naama) {
                System.out.println("Dana first");
                System.out.println("Niv second");
                System.out.println("Naama third");
            } else {
                if (Dana > Naama) {
                    System.out.println("Dana first");
                    System.out.println("Naama second");
                } else {
                    System.out.println("Naama first");
                    System.out.println("Dana second");
                }
                System.out.println("Niv third");
            }
        }
    }
}
