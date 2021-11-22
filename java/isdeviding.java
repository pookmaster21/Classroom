import java.util.*;
public class isdeviding
{
    public static Scanner reader =new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        int one = reader.nextInt();
        System.out.print("Enter a second number: ");
        int two = reader.nextInt();
        if(one%two==0)
        {
            System.out.println(one + " can be devided by " + two);
            System.out.print(one + " / " + two + " = " + one/two);
        }else
        {
            System.out.print(one + " can not be devided by " + two);
        }
    }
}
