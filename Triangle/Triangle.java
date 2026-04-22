import java.util.Scanner;
class Triangle{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("A: ");
        int A = scan.nextInt();
        System.out.print("B: ");
        int B = scan.nextInt();
        System.out.print("C: ");
        int C = scan.nextInt();
        int sum = A + B + C;

        if (sum != 180 || A <= 0 || B <= 0 || C <= 0)
        {
            System.out.print("Not a Triangle");
        }
        else if (A > 90 || B > 90 || C > 90)
        {
            System.out.print("Obtuse Triangle");
        }
        else if (A == 90 || B == 90 || C == 90)
        {
            System.out.print("Right Triangle");
        }
        else{
            System.out.print("Acute Triangle");
        }
    }
    }
