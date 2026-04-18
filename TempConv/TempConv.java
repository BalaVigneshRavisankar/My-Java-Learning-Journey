import java.util.Scanner;
class TempConv{
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the Temprature in Celsius: ");
        double Cel= scan.nextDouble();
        double Fah = (Cel * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: "+ Fah);
        scan.close();
    }
}