package class10;

import java.util.Scanner;

public class ClassWorkEx2 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        // I am taking input because i need to take str from the user
        System.out.println("Enter a string:");
        String str = reader.nextLine();
        if (str.indexOf("@") != -1) {
            System.out.println(str.substring(0, str.indexOf("@")));
        }
    }
}
