import java.util.Scanner;
import java.util.Arrays;

class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scan.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = scan.nextLine().toLowerCase();

        // Remove spaces (optional)
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}