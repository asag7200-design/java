public class pushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4};

        int ip = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[ip++] = arr[i];
            }
        }

        while (ip < arr.length) {
            arr[ip++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}