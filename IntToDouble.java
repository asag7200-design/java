import java.util.Scanner;

public class IntToDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double converted = (double) num;
        System.out.println(converted);
        sc.close();
    }
}
