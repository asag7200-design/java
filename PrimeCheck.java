import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
            int num = x.nextInt();
 if (num%2==0) {System.out.println("prime");
   
 } else {System.out.println("odd");
   
 }
        }
    }
}