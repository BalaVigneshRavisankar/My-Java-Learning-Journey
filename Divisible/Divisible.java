import java.util.Scanner;
class Divisible{
    public static void main (String args [])
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int Num = scan.nextInt();
        if (Num%3 == 0 && Num%5 == 0)
        {
            System.out.println("This number is divisible by both 3 and 5");
        }

        else{
            System.out.println("This number is not divisible by 3 and 5");
        }

    }
}