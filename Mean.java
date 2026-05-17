import java.util.Scanner;

public class Mean {

    
    public static int findMean(int[] arr) {

        int sum = 0;

        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        
        int mean = sum / arr.length;

        return mean;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMean(arr);

        System.out.println("Mean of array = " + result);

        sc.close();
    }
}