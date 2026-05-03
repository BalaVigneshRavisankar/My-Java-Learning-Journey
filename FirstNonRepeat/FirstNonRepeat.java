import java.util.Scanner;

class FirstNonRepeat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && ch == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}