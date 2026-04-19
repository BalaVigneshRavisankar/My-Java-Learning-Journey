import java.util.Scanner;
class Salary{
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your Salary: ");
        int BSalary= scan.nextInt();
        int HRA = BSalary * 20/100;
        int DA = BSalary * 10/100;
        int Bonus = BSalary * 5/100;
        int TSalary = BSalary + HRA + DA + Bonus;
        System.out.println("The Total Salary is: "+TSalary);
        scan.close();
    }
}