package class10;

import java.util.Scanner;

public class pageex5 {
    public static Scanner reader = new Scanner(System.in);

    public static boolean isCubic(int[][] arr) {
        for (int i = 0; i < arr[0].length - 1; i++) {
            for (int g = 0; g < arr[0].length - 1; g++) {
                if (!((arr[i][g] == arr[i][arr[0].length - 1 - g]) || (arr[g][i] == arr[arr[0].length - 1 - g][i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("How many rows will be in the matrix: ");
        int row = reader.nextInt();
        System.out.print("How many colums will be in the matrix: ");
        int column = reader.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            System.out.println("Column number " + (i + 1));
            for (int h = 0; h < column; h++) {
                System.out.print("Enter a number: ");
                arr[i][h] = reader.nextInt();
            }
        }
        System.out.println(isCubic(arr));
    }
}
