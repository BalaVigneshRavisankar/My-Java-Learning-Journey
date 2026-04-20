import java.util.Scanner;
class Condition{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter Number 1: ");
        int num1 = scan.nextInt();
        System.out.println ("Enter Number 2: ");
        int num2 = scan.nextInt();
        if (num1==num2)
        {
            System.out.println ("Both value are equal");
        }
        else 
        {
            System.out.println ("Both value are not equal");

        }
        scan.close();
    }
}