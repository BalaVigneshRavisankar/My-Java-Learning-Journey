import java.util.Scanner;
class Result1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your mark: ");
        int Mark = scan.nextInt();

        if (Mark>=35)
        {
            System.out.println("Pass");
        }

        else {
            System.out.println("Fail");
        }
    }
}