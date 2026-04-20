import java.util.Scanner;
class AreaCal {
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the Length of the rectangle: ");
        double Length = scan.nextDouble();
        System.out.println("Enter the Breadth of the rectangle: ");
        double Breadth = scan.nextDouble();
        System.out.println("Enter the Radius of the circle: ");
        double Radius = scan.nextDouble();
        double RecArea = Length * Breadth;
        double CirArea = 3.14 * Radius * Radius;
        System.out.println("Area of the rectangle: "+RecArea);
        System.out.print("Area of the circle: "+CirArea);
        scan.close();

    }
}