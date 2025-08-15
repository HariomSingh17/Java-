package summervacation.HashMap;
import java.util.*;

public class Allbasic {

     static void HashMapMethod(){
        // syntax
        Map<String, Integer> mp = new HashMap<>();
        // ADDING ELEMENT 

        mp.put("Akash", 21);
        mp.put("shivansh", 21);
        mp.put("Aradhya", 21);
        mp.put("Manish", 21);

        // getting value of hash map

        System.out.println(mp.get("Akash"));
        

    }
    public static void main(String[] args) {
        HashMapMethod();
    }
    
}
