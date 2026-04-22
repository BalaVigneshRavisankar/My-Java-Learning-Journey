import java.util.Scanner;
class LargestFour {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the number 3: ");
        int num3 = scan.nextInt();
        System.out.print("Enter the number 4: ");
        int num4 = scan.nextInt();



        if (num1 > num2 && num1 > num3 && num1 > num4)
        {
            System.out.println("Number 1 is greater than other 3 numbers");
        }
        else if ((num2 > num1 && num2 > num3 && num2 > num4))
        {
            System.out.println("Number 2 is greater than other 3 numbers");
        }
        else if ((num3 > num1 && num3 > num2 && num3 > num4))
        {
            System.out.println("Number 3 is greater than other 3 numbers");
        }
        else
        {
            System.out.println("Number 4 is greater than other 3 numbers");
        }

    }
}




