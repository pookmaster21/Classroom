import java.util.*;

public class page138ex55 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int lastNumber = 0, sum = 0;
        double differental = 0, middle = 0;
        System.out.println("Enter the number of numbers");
        int numbers = reader.nextInt();
        while (numbers <= 0) {
            System.out.println("You need a number that is greater than 0");
            numbers = reader.nextInt();
        }
        for (int i=0;i<numbers;i++) {
            int number = reader.nextInt();
            sum = sum + number;
            if (i != 0) {
                if (differental < (lastNumber-number)) {
                    differental = number - lastNumber;
                }
            }
            if (i == (numbers-1)/2) {
                middle = number;
            }
            lastNumber = number;
        }
        System.out.println("The summery is " + ((double) sum/numbers));
        System.out.println("The smallest differental is " + differental);
        System.out.println("The middle number is " + middle);
    }
}