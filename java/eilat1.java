import java.util.Scanner;

public class eilat1 {
    public static Scanner reader =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        int students = reader.nextInt();
        int buses = students/40;
        if (buses*40 != students){
            buses+=1;
        }
        System.out.println("You need " + buses + " buses and it will cost " + buses*675);
    }
}
