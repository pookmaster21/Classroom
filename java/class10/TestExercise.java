import java.util.Scanner;

public class TestExercise {
    public static Scanner reader = new Scanner(System.in);

    public static void ex1(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (c < 'M') {
                output = output + c + (char) (c + 1);
            } else if (c > 'M') {
                output = output + c + (char) (c - 1);
            } else {
                output = output + c;
            }
        }
        System.out.println(output);
    }

    public static void ex2(String st) {
        int count = 0;
        for (int i = 0; i < st.length() - 1; i++) {
            if (st.charAt(i + 1) == ' ' && st.charAt(i) == 'Y') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int Exact(String[] arr, int num) {
        int count = 0;
        for (String i : arr) {
            if (i.length() == num) {
                count++;
            }
        }
        return count;
    }

    public static void ex4(int[] arr) {
        int[] output = { 1, 2, arr[0] + arr[1] };
        for (int i = 2; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] > output[2]) {
                output[0] = i + 1;
                output[1] = i + 2;
                output[2] = arr[i] + arr[i + 1];
            }
        }
        System.out.println("The first index is      " + output[0]);
        System.out.println("The second index is     " + output[1]);
        System.out.println("The summery is          " + output[2]);
    }

    public static int ex5A(int[] arr, int num) {
        int end = arr.length, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                end = i;
                break;
            }
        }
        for (int i = 0; i < end; i++) {
            if (arr[i] < num) {
                count++;
            }
        }
        return count;
    }

    public static void ex5B() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter a number for index number %s:", i);
            arr[i] = reader.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter number number %s:", i);
            System.out.print(ex5A(arr, reader.nextInt()));
        }
    }

    public static int[][] ex6(int[][] flag) {
        for (int i = 0; i < flag.length; i++) {
            for (int j = 0; j < flag.length; j++) {
                if (i == 0 || j == 0 || i == flag.length - 1 || j == flag.length - 1) {
                    flag[i][j] = 3;
                } else if (i == j || i < j) {
                    flag[i][j] = 2;
                } else {
                    flag[i][j] = 1;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter which exercise you want to check: ");
            int exercise = reader.nextInt();
            String[] str_arr;
            int[] int_arr;
            int[][] int_matrix;
            switch (exercise) {
                case 1:
                case 2:
                    System.out.println("Enter a string: ");
                    ex1(reader.nextLine());
                    break;
                case 3:
                    System.out.print("Enter how much strings are going to be at the array: ");
                    str_arr = new String[reader.nextInt()];
                    for (int i = 0; i < str_arr.length; i++) {
                        System.out.print("Enter a string");
                        str_arr[i] = reader.next();
                    }
                    System.out.print("Enter a number: ");
                    Exact(str_arr, reader.nextInt());
                    break;
                case 4:
                    System.out.print("Enter how much numbers are going to be at the array: ");
                    int_arr = new int[reader.nextInt()];
                    for (int i = 0; i < int_arr.length; i++) {
                        System.out.print("Enter an int: ");
                        int_arr[i] = reader.nextInt();
                    }
                    ex4(int_arr);
                    break;
                case 5:
                    ex5B();
                    break;
                case 6:
                    System.out.print("Enter how much numbers are going to be at the array: ");
                    int input = reader.nextInt();
                    int_matrix = new int[input][input];
                    ex6(int_matrix);
                    break;
                default:
                    System.out.println("Invalid input");
                    ;
            }
        }
    }
}