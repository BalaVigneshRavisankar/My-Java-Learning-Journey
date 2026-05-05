import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Two real roots: " + r1 + ", " + r2);
        } else if (D == 0) {
            double r = -b / (2 * a);
            System.out.println("One real root: " + r);
        } else {
            System.out.println("Imaginary roots");
        }
    }
}