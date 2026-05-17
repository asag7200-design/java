import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();

        obj.add(10);  
        obj.add(20);
        obj.add(30); // t0 add value in array list
        obj.set(2 ,50);
        obj.remove(1);
    

        System.out.println(obj);  
    }
}