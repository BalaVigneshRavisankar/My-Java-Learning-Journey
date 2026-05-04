import java.util.Scanner;
class Bill {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter the unit:");
        int unit = scan.nextInt();
        int bill;
        if (unit<=100)
        {
            bill = unit * 5;
            System.out.println("Bill Amount is:"+bill);
        }
        else if (unit<=200)
        {
            bill = unit * 7;
            System.out.println("Bill Amount is:"+bill);
        }
        else
        {
             bill = unit * 10;
            System.out.println("Bill Amount is:"+bill);
        }
    }
}