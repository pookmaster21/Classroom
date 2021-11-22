import java.util.Scanner;

public class page50ex15 {
    public static Scanner reader =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("To find x in ax+b=c Enter a,b,c :");
        double a = reader.nextDouble();
        double b = reader.nextDouble();
        double c = reader.nextDouble();
        System.out.println((c-b)/a);
    }
}
