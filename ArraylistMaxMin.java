import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        
        return ans;
    }
}

public class ArraylistMaxMin {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        Solution obj = new Solution();
        ArrayList<Integer> result = obj.getMinMax(arr);
        
        System.out.println("Minimum: " + result.get(0));
        System.out.println("Maximum: " + result.get(1));
        sc.close();
    }
}