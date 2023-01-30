package class10;

import java.util.Scanner;

public class page59ex9 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of days: ");
        double days = reader.nextDouble();
        double years = ((days - (days % 365)) / 365);
        days -= years * 365;
        double months = (days - (days % 30)) / 30;
        days -= months * 30;
        double weeks = (days - (days % 7)) / 7;
        days -= weeks * 7;
        System.out.println(
                "it equals to " + years + " years " + months + " months " + weeks + " weeks and " + days + " days");
    }
}
