import java.util.Scanner;

public class page193ex21 {
    public static Scanner reader = new Scanner(System.in);

    public static String change(String number) {
        int most = 0;
        int less = 10;
        for (int i = 0; i < number.length(); i++) {
            most = Math.max(most, Character.getNumericValue(number.charAt(i)));
            less = Math.min(less, Character.getNumericValue(number.charAt(i)));
        }
        return number + ((most + less) % 10);
    }

    public static void main(String[] args) {
        for (int worker = 1; worker <= 100; worker++) {
            System.out.printf("Enter accses code for worker number %s:", worker);
            String number = reader.nextLine();
            System.out.printf("The new accese code is %s\n", change(change(number)));
        }
    }
}
