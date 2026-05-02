import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scan.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}