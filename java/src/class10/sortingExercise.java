package class10;

import java.util.Scanner;

public class sortingExercise {
    public static Scanner reader = new Scanner(System.in);

    public static void Ex1(int[][] matrix) {
        int smallest, number;
        for (int i = 0; i < matrix.length - 1; i++) {
            smallest = i;
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[smallest][smallest] > matrix[j][j]) {
                    smallest = j;
                }
            }
            number = matrix[i][i];
            matrix[i][i] = matrix[smallest][smallest];
            matrix[smallest][smallest] = number;
        }
    }

    public static void Ex2(String str) {
        String new_str = "" + str.charAt(0);
        int length;
        boolean inserted;
        for (int i = 1; i < str.length(); i++) {
            length = new_str.length();
            inserted = false;
            for (int j = 0; j < length; j++) {
                if (!(inserted) && str.toLowerCase().charAt(i) <= new_str.charAt(j)) {
                    new_str = new_str.substring(0, j) + str.charAt(i) + new_str.substring(j, length);
                    inserted = true;
                }
            }
            if (!(inserted)) {
                new_str += str.charAt(i);
            }
        }

        char index = new_str.charAt(0);
        new_str = new_str.substring(1);
        found: {
            for (int i = 0; i < new_str.length(); i++) {
                if (new_str.toLowerCase().charAt(i) <= index) {
                    new_str = new_str.substring(0, i) + index + new_str.substring(i, new_str.length());
                    break found;
                }
            }
            new_str += index;
        }

        System.out.println(new_str);
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = reader.next();
        Ex2(str);
    }
}
