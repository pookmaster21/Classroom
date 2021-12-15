import java.util.Scanner;
public class page157ex30 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int Shir = 0, Li = 0, round = 1;
        while (true) {
            System.out.printf("Round %s\n", round);
            System.out.print("Enter what did Shir get?(head/tail)");
            String coin_Shir = reader.next();
            if (coin_Shir.equals("Tail") || coin_Shir.equals("tail")) {
                Shir++;
                if (Shir == 3) {
                    System.out.println("Shir will start the game");
                    break;
                }
            }
            System.out.print("Enter what did Li get?(head/tail)");
            String coin_Li = reader.next();
            if (coin_Li.equals("Tail") || coin_Li.equals("tail")) {
                Li++;
                if (Li == 3) {
                    System.out.println("Li will start the game");
                    break;
                }
            }
            round++;
        }
    }
}
