import java.util.Scanner;
class NumberCheck {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int Num = scan.nextInt();
        if (Num > 0)
        {
         System.out.println("This number is Positive");
        }
        else if (Num < 0)
        {
            System.out.println("This number is Negative");
        }
        else
        {
            System.out.println("This number is Zero");
        }
    }
}