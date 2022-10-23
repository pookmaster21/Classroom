import java.util.Scanner;

public class page50ex14 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How old are you? ");
        double years = reader.nextDouble();
        System.out.println("You are " + years * 365 + "days old or " + years * 365 * 24 + " hours old or "
                + years * 365 * 24 * 60 + " seconds old");
    }
}
