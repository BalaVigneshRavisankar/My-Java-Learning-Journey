import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = scan.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed: " + rev);
    }
}