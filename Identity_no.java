import java.util.Scanner;
public class Identity_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        
        if(n > 0){
            System.out.println("Positive number");
        }else if(n < 0){
            System.out.println("Negative number");
        }else{
            System.out.println("Zero number number");
        }

        sc.close();
    }
}