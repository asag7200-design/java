import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Digits = 1");
            sc.close();
            return;
        }

        int count = 0;
        int n = Math.abs(num);

        while (n > 0) {
            n /= 10;
            count++;
        }

        System.out.println("Digits = " + count);
        sc.close();
    }
}