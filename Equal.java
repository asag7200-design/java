import java.util.Scanner;

public class Equal {

    
    public static boolean areEqual(int a[], int b[]) {

        
        if (a.length != b.length) {
            return false;
        }

        
        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int a[] = new int[n1];

        System.out.println("Enter first array elements:");

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int b[] = new int[n2];

        System.out.println("Enter second array elements:");

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

    
        boolean result = areEqual(a, b);

        System.out.println("Arrays are equal: " + result);

        sc.close();
    }
}