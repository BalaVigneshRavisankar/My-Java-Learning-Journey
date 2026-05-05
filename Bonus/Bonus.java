import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = scan.nextDouble();

        System.out.print("Enter experience (years): ");
        int exp = scan.nextInt();

        System.out.print("Enter rating (1-5): ");
        int rating = scan.nextInt();

        double bonus;

        if (exp >= 5 && rating >= 4) {
            bonus = salary * 0.20;
        } else if (exp >= 3 && rating >= 3) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus = ₹" + bonus);
    }
}