import java.util.Scanner;

class NumPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scan.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

                sum += j;
                count++;
            }
            System.out.println();
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Count = " + count);
    }
}