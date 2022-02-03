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
        int[] flower1 = new int[0], flower2 = new int[0];
        System.out.print("Enter how much flowers are in the original flowerbed: ");
        final int N = reader.nextInt();
        for(int i=0;i<N;i++) {
            System.out.printf("Enter the code for flower number %s: ", i+1);
            String code = String.valueOf(isValid(reader.nextInt()));
            if(code.charAt(0) == '2') {
                flower2 = Arrays.copyOf(flower2, flower2.length+1);
                flower2[flower2.length-1] = Integer.parseInt(code);
            } else if(code.charAt(0) == '1') {
                flower1 = Arrays.copyOf(flower1, flower1.length+1);
                flower1[flower1.length-1] = Integer.parseInt(code);
            }
        }
        System.out.println("original flowerbed: " + Arrays.toString(flower1));
        System.out.println("new flowerbed: " + Arrays.toString(flower2));
    }
}
