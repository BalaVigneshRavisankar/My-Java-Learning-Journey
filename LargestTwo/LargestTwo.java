import java.util.Scanner;
class LargestTwo {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = scan.nextInt();

        if (num1 > num2)
        {
            System.out.println("Number 1 is greater than Number 2");
        }
        else
        {
            System.out.println("Number 2 is greater than Number 1");
        }
    }
}