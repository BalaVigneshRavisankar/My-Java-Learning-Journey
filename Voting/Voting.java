import java.util.Scanner;

class Voting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scan.nextInt();

        System.out.print("Do you have ID (yes/no): ");
        String id = scan.next();

        if (age >= 18) {
            if (id.equalsIgnoreCase("yes")) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible (No ID)");
            }
        } else {
            System.out.println("Not eligible (Under age)");
        }
    }
}