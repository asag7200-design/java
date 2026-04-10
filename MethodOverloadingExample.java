import java.util.Scanner;

public class MethodOverloadingExample {

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two  integers: ");
        System.out.println("Sum = " + sum(sc.nextInt(), sc.nextInt()));

        System.out.print("Enter Three integers: ");
        System.out.println("Sum = " + sum(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        System.out.print("Enter Two doubles: ");
        System.out.println("Sum = " + sum(sc.nextDouble(), sc.nextDouble()));

        sc.close();
    }
}