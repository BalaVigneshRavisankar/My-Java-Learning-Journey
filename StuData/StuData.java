import java.util.Scanner;
class StuData{

    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);
        String Name = scan.nextLine();
        double Score = scan.nextDouble();
        scan.nextLine();
        String Department = scan.nextLine();
        System.out.println("My name is "+Name);
        System.out.println("My score is "+ Score/10);
        System.out.print("My Department is "+Department);
        scan.close();
    }
}