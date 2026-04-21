import java.util.Scanner;
class OddEven{
    public static void main (String args [])
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int Num = scan.nextInt();
        if (Num%2 == 0)
        {
            System.out.println("This number is Even");
        }

        else{
            System.out.println("This number is Odd");
        }

    }
}