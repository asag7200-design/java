import java.util.*;
public class Max_Min{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);   // add element
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);    // 99 
        list.add(60);
        list.add(70);                      // To add value(elements) at a particular index
        list.get(5);  // 60           // To get value(elements) means access karna at a particular index
        list.set(4, 99);     // To set value(elements) at a particular index

        System.out.println(list);  // [10, 20, 30]

    }
}