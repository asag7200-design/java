import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int line = 0; line < n; line++) {
            int num = 1;
            for (int j = 0; j <= line; j++) {
                System.out.print(num + " ");
                num = num * (line - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}
