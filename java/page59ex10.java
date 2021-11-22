import java.util.Scanner;

public class page59ex10 {
    public static Scanner reader =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a three digit number");
        int number = reader.nextInt();
        int hundreds = number/100;
        int tens = (number-(hundreds*100))/10;
        int units = (number-(hundreds*100))%10;
        System.out.println(hundreds+tens+units);
        System.out.println(hundreds*100 + "+" + tens*10 + "+" + units + "=" + number);
        System.out.println(units + "" + tens + "" + hundreds);
    }
}
