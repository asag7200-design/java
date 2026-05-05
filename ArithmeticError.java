public class ArithmeticError {
    public static void main(String[] args) {
        int a = 10;
        int c = 0;
        //exception

        try{
            int result = a / c;
            
        System.out.println(result);
        }
        catch(ArithmeticException e ){
            
        System.out.println("can't divided by zero");

        }finally{
            
            
        System.out.println("Changed value of c");
        }

        System.out.println("Program ended");
        
        
    }
    
}