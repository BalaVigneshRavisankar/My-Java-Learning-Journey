import java.util.Scanner;

class PasswordCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = scan.next();

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);

            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            }
        }

        if (pass.length() >= 6) {
            if (hasDigit && hasUpper) {
                System.out.println("Strong Password");
            } else {
                System.out.println("Weak Password");
            }
        } else {
            System.out.println("Too short");
        }
    }
}