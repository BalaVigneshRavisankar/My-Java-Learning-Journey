import java.util.Scanner;
class LargestThree {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the number3: ");
        int num3 = scan.nextInt();


        if (num1 > num2 && num1 > num3)
        {
            System.out.println("Number 1 is greater than other 2 numbers");
        }
        else if ((num2 > num1 && num2 > num3))
        {
            System.out.println("Number 2 is greater than other 2 numbers");
        }
        else
        {
            System.out.println("Number 3 is greater than other 2 numbers");
        }

    }
}




