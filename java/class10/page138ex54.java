import java.util.Random;
import java.util.Scanner;

public class page138ex54 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double sum = 0;
        int biggest = 0, eight = 0, nighn = 0, ten = 0;
        System.out.println("Enter the number of times that you want to raffle");
        int times = reader.nextInt();
        Random rnd = new Random();
        for (int i = 1; i <= times; i++) {
            int number = (int) (rnd.nextInt(3)) + 8;
            System.out.println(number);
            sum = sum + number;
            if (number > biggest) {
                biggest = number;
            }
            switch (number) {
                case 8:
                    eight++;
                    break;
                case 9:
                    nighn++;
                    break;
                case 10:
                    ten++;
                    break;
            }
        }
        if (eight > nighn && eight > ten) {
            System.out.println("The number that was the most is 8");
        } else if (nighn > eight && nighn > ten) {
            System.out.println("The number that was the most is 9");
        } else {
            System.out.println("The number that was the most is 10");
        }
        System.out.println("The summery of numbers is " + sum);
        System.out.println("The biggest number that was raffled is " + biggest);
    }
}