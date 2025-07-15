import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        // Determine how many odd numbers to print
        int count = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0; i < count; i++) {
            int odd = 2 * i + 1;
            System.out.print(odd);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
    }
}
