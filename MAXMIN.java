import java.util.ArrayList;
import java.util.Scanner;

public class MAXMIN {

    
    public static int maximumElement(ArrayList<Integer> arr) {

        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    public static int minimumElement(ArrayList<Integer> arr) {

        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int max = maximumElement(arr);
        int min = minimumElement(arr);

        System.out.println("Maximum Element = " + max);
        System.out.println("Minimum Element = " + min);

        sc.close();
    }
}