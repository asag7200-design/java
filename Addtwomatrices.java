
public class  Addtwomatrices {

    public static void main(String[] args) 
    {
        // Input matrices
        int A[][] = { { 1, 2 }, { 3, 4 } };
        int B[][] = { { 1, 1 }, { 1, 1 } };

        // Dimensions of the matrix
        int rows = A.length;
        int cols = A[0].length;

        // Resultant matrix to store the sum
        int sum[][] = new int[rows][cols];

        // Adding two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Printing the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              
                // Print elements on the same line
                System.out.print(sum[i][j] + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}