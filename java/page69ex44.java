import java.util.Arrays;
import java.util.Scanner;

public class page69ex44 {
    public static Scanner reader = new Scanner(System.in);
    public static int isValid(int number) {
        if(number < 100 || number >= 1000) {
            System.out.print("You need to enter a 3 digits code: ");
            return isValid(reader.nextInt());
        } else {
            return number;
        }
    }
    public static void main(String[] args) {
        int[] original_flowerbed = new int[0], new_flowerbed = new int[0];
        System.out.print("Enter how much flowers are in the original flowerbed: ");
        final int N = reader.nextInt();
        for(int i=0;i<N;i++) {
            System.out.printf("Enter the code for flower number %s: ", i+1);
            String code = String.valueOf(isValid(reader.nextInt()));
            if(code.charAt(0) == '2') {
                new_flowerbed = Arrays.copyOf(new_flowerbed, new_flowerbed.length+1);
                new_flowerbed[new_flowerbed.length-1] = Integer.parseInt(code);
            } else if(code.charAt(0) == '1') {
                original_flowerbed = Arrays.copyOf(original_flowerbed, original_flowerbed.length+1);
                original_flowerbed[original_flowerbed.length-1] = Integer.parseInt(code);
            }
        }
        System.out.println("original flowerbed: " + Arrays.toString(original_flowerbed));
        System.out.println("new flowerbed: " + Arrays.toString(new_flowerbed));
    }
}
