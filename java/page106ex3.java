import java.util.Arrays;
import java.util.Scanner;

public class page106ex3 {
    public static Scanner reader = new Scanner(System.in);
    public static void A(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j:arr[i]) {
                sum += j;
            }
            System.out.printf("The sum in row number %s is: %s\n", i+1, sum);
            sum = 0;
        }
    }
    public static void B(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                sum += arr[j][i];
            }
            System.out.printf("The sum in column number %s is: %s\n", i+1, sum);
            sum = 0;
        }
    }
    public static void C(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(i == 0 || i == arr.length-1 || j == 0 || j == arr[i].length-1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of the frame is: " + sum);
    }
    public static void D(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of the main diagonal is: " + sum);
    }
    public static void E(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(i < j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of the numbers above the main diagonal is: " + sum);
    }
    public static void F(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(i > j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of the numbers under the main diagonal is: " + sum);
    }
    public static void G(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(j == arr.length-1-i) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of the main diagonal is: " + sum);
    }
    public static void H(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(j < i) {
                    sum += arr[i][arr.length-1-j];
                }
            }
        }
        System.out.println("The sum of the numbers under the secondery diagonal is: " + sum);
    }
    public static void I(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(j > i) {
                    sum += arr[i][arr.length-1-j];
                }
            }
        }
        System.out.println("The sum of the numbers above the secondery diagonal is: " + sum);
    }
    public static void main(String[] args) {
        System.out.print("Enter how much columns and rows are gona be in the array: ");
        final int N = reader.nextInt();
        int[][] arr = new int[N][N];
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                System.out.printf("Enter a number for row number %s column number %s: ", i+1, j+1);
                arr[i][j] = reader.nextInt();
            }
        }
        for(int i=0;i<N;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.print("Enter which exercise do you want to check: ");
        final int EXERCISE = reader.nextInt();
        switch (EXERCISE) {
            case 1:
                A(arr);
                break;
            case 2:
                B(arr);
                break;
            case 3:
                C(arr);
                break;
            case 4:
                D(arr);
                break;
            case 5:
                E(arr);
                break;
            case 6:
                F(arr);
                break;
            case 7:
                G(arr);
                break;
            case 8:
                H(arr);
                break;
            case 9:
                I(arr);
                break;
        }
    }
}
