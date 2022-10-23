import java.util.*;

public class page36ex4 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 3 chars: ");
        String first = reader.next();
        String second = reader.next();
        String third = reader.next();
        System.out.println(first + " " + second + " " + third);
        System.out.println(third + " " + second + " " + first);
    }
}
