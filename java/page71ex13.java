import java.util.Scanner;

public class page71ex13 {
    public static Scanner reader =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        int sum12 = num1 - num2;
        int sum23 = num2 - num3;
        if (sum12 == sum23){
            System.out.println("The numbers are an arithmetic progression");
        }else {
            System.out.println("The numbers are not an arithmetic progression");
        }
    }
}
