import java.util.*;
public class boat
{
    public static Scanner reader =new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter number of people: ");
        int people = reader.nextInt();
        int boat = people/8;
        if(boat*8 != people)
        {
            boat = boat+1;
        }
        System.out.print("You need to pay " + boat*30 + " Shekels for " + boat + " boats");
    }
}
