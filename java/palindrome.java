import java.util.*;

public class palindrome {
    public static Scanner reader =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = reader.nextInt();
        if (num/100 == num%100){
            System.out.println("This number is palindrome");
        }else{
            System.out.println("This number is not a palindrome");
        }
    }
}
