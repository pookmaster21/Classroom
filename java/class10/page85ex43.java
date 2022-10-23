import java.util.Scanner;

public class page85ex43 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the first side: ");
        double zela1 = reader.nextDouble();
        System.out.println("Enter the second side: ");
        double zela2 = reader.nextDouble();
        System.out.println("Enter the third side: ");
        double zela3 = reader.nextDouble();
        if (zela1 == zela2 && zela1 == zela3) {
            System.out.println("משולש שווה צלעות");
        } else if (zela1 == zela2 || zela1 == zela3 || zela2 == zela3) {
            System.out.println("משולש שווה שוקיים");
        } else {
            System.out.println("משולש שונה צלעות");
        }
    }
}
