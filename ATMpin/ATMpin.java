import java.util.Scanner;

class ATMpin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int correctPin = 233;
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int pin = scan.nextInt();

            if (pin == correctPin) {
                System.out.println("Access Granted");
                return;
            } else {
                attempts++;
                System.out.println("Wrong PIN");
            }
        }

        System.out.println("Card Blocked");
    }
}