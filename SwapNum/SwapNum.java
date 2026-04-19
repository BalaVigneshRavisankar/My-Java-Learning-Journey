import java.util.Scanner;
class SwapNum{
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first number= ");
        double a = scan.nextDouble();
        System.out.println("Enter second number= ");
        double b = scan.nextDouble();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("First number= "+a);
        System.out.println("Second number= "+b);
        scan.close();
    }
}