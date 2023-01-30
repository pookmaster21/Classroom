package class11.tor;

import java.util.*;
public class testQueue {
    public static Scanner reader=new Scanner(System.in);
    public static Queue<Integer> build() {
        int x;
        Queue<Integer> q = new Queue<>();
        System.out.print("Enter a num: " );
        x = reader.nextInt();
        while(x != -999) {
            q.insert(x);
            System.out.print("Enter a num: " );
            x = reader.nextInt();
        }
        return q;
    }
}
