import java.util.Scanner;

public class page157ex32 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        final String MY_NAME = "lavi";
        System.out.print("Enter the string:");
        String entered = reader.next();
        int i = 0;
        for (; i <= entered.length(); i++) {
            if (entered.charAt(i) == MY_NAME.charAt(0)) {
                System.out.printf("The first letter of my name is at the %s character in the string\n", i + 1);
                break;
            }
        }
    }
}
