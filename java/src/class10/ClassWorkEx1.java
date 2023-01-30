package class10;

import java.util.Scanner;

public class ClassWorkEx1 {
    public static Scanner reader = new Scanner(System.in);
    public static boolean equal(String str) {
        String first_part = str.substring(0, str.length() / 2);
        String second_part = str.substring(str.length() / 2);
        int count_first = 0, count_second = 0;
        for (int i=0;i<first_part.length();i++) {
            if ((int) first_part.charAt(i) >= 65 && (int) first_part.charAt(i) <= 90) {
                count_first++;
            }
        }
        for (int i=0;i<second_part.length();i++) {
            if ((int) second_part.charAt(i) >= 97 && (int) second_part.charAt(i) <= 122) {
                count_second++;
            }
        }
        if (count_first == count_second) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String shortest = null;
        while (true) {
            System.out.print("Enter a string:");
            String entered = reader.nextLine();
            if (entered.equals("END")) {
                break;
            }
            if (equal(entered)) {
                if (shortest == null) {
                    shortest = entered;
                } else if (entered.length() < shortest.length()) {
                    shortest = entered;
                }
            }
        }
        if (shortest == null) {
            System.out.println("Nothing was entered");
        } else {
            System.out.println("The shortest equal string that entered is " + shortest);
        }
    }
}