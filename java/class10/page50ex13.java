import java.util.Scanner;

public class page50ex13 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the salary: ");
        double salary = reader.nextDouble();
        System.out.println("Enter the hours the worker worked at the day");
        double day = reader.nextDouble();
        System.out.println("Enter the hours the worker worked at the night");
        double night = reader.nextDouble();
        System.out.println("Enter the hours the worker worked at saturday");
        double saturday = reader.nextDouble();
        System.out.println(day * salary + night * salary * 1.5 + saturday * salary * 2);
    }
}
