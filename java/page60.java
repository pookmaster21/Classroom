import java.util.Scanner;

public class page60 {
    public static Scanner reader = new Scanner(System.in);
    public static int biggestNumberInArray(int[] array) {
        int biggest = 0;
        for(int i=0;i<5;i++) {
            if(array[i] > array[i+1]) {
                biggest = i;
            } else {
                biggest = i+1;
            }
        }
        return biggest+1;
    }
    public static void main(String[] args) {
        int[] floar = new int[6];
        for(int i=0;i<6;i++) {
            System.out.printf("Enter the number of kids in floar number %s:", i+1);
            floar[i] = reader.nextInt();
        }
        System.out.printf("The floar with the most kids is floar number %s\n", biggestNumberInArray(floar));
    }
}