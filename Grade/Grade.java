import java.util.Scanner;
class Grade {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter the Mark:");
        int mark = scan.nextInt();
         if (mark >=90)
         {
            System.out.println("Grade is A");
         }
         else if (mark >=75)
        {
            System.out.println("Grade is B");
        }
        else if (mark >=50)
        {
            System.out.println("Grade is C");
        }
        else
        {
            System.out.println("No Grade - Fail");
        }
        
    }
}