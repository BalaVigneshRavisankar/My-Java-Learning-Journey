import java.util.Scanner;
class Nestedif{
    public static void main (String args [])
    {
    Scanner scan = new Scanner (System.in);
    System.out.print("Enter the number: ");
    int num = scan.nextInt();

    if (num>0)
    {
        if(num%2==0)
            {
                System.out.print("Even Number");
            }
         else{
            System.out.print("Odd Number");
         }
        }
        else if (num==0)
        {
            System.out.print("You enter Zero");
        }
    else 
    {
        System.out.print("It is not a Positive Number, it is Negative Number");
    }
    }
}

