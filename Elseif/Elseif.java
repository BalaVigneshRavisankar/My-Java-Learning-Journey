import java.util.Scanner;
class Elseif{
    public static void main (String args[])
    {
    Scanner scan = new Scanner (System.in);
    System.out.print ("Enter num1: ");
    int num1 = scan.nextInt();
    System.out.print ("Enter num2: ");
    int num2 = scan.nextInt();
    System.out.print ("Enter your Choice: ");
    int choice = scan.nextInt();

    if (choice==1)
    {
        int add = num1 + num2;
        System.out.print ("Add: "+add);
    }
    else if (choice==2)
    {
        int sub = num1 - num2;
        System.out.print ("Sub: "+sub);
    }
      else if (choice==3)
    {
        int multi = num1 * num2;
        System.out.print ("Multi: "+multi);
    }
    else
    {
        System.out.print ("Invalid Input");
    }
    

    }

}