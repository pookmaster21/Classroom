import java.util.Arrays;
import java.util.Scanner;

public class page69ex43 {
    public static Scanner reader = new Scanner(System.in);
    public static char[] getArrayFromUser(String name) {
        System.out.println(name);
        char[] array = new char[15];
        for(int i=0;i<15;i++) {
            System.out.print("Enter the letter of the boat: ");
            array[i] = reader.next().charAt(0);
        }
        return array;
    }
    public static void main(String[] args) {
        char[] before_last = getArrayFromUser("before_last"), last = getArrayFromUser("last"), next = new char[0];
        int count = 0;
        for(int i=0;i<last.length;i++) {
            for (int g=0;g<before_last.length;g++) {
                if (count == 0) {
                    if(last[i] == before_last[g]) {
                        count++;
                    }
                }
            }
            if(count == 0) {
                next = Arrays.copyOf(next, next.length+1);
                next[next.length-1] = last[i];
            }
            count = 0;
        }
        for(int i=0;i<before_last.length;i++) {
            for (int g=0;g<last.length;g++) {
                if (count == 0) {
                    if(before_last[i] == last[g]) {
                        count++;
                    }
                }
            }
            if(count == 0) {
                for(int h=0;h<next.length;h++) {
                    if(count == 0){
                        if(before_last[i] == next[h]) {
                            count++;
                        }
                    }
                }
                if(count == 0) {
                    next = Arrays.copyOf(next, next.length+1);
                    next[next.length-1] = before_last[i];
                }
            }
            count = 0;
        }
        System.out.println(Arrays.toString(next));
    }
}
