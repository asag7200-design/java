import java.util.Scanner;

// public class FibonacciLoop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 0, b = 1;
//         System.out.print(a + " " + b);
//         for (int i =2; i < n; i++) {
//             int c = a + b;
//             System.out.print(" " + c);
//             a = b;
//             b = c;
//         }
//         sc.close();
//     }
// }

public class FibonacciLoop {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i =2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c );
            a = b;
            b = c;
        }
        x.close();
    }
}
