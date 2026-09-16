import java.util.Scanner;

class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {
                  
                System.out.println("Not Prime");
                   
                     return ;
                  
                }
            }
       
            System.out.println("Prime");
       


    }
}