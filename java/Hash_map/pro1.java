package Hash_map;
import java.util.*;
public class pro1 {
    public static void main(String[] args) {
        
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        //Printing
        System.err.println(map);
        map.put("China",180);  //Update the key if it already present otherwise make it new key

        //Search

        if(map.containsKey("China"))
         System.out.println("Key is present");
         else
         System.out.println("Key is not present");

         if(map.containsKey("Indionesia"))
         System.out.println("Key is present");
         else
         System.out.println("Key is not present");

         System.out.println(map.get("China"));  //Give the Value
         System.out.println(map.get("Indionesia"));
         System.out.println(map.get(30));

         //Traversing
         //for(int i:arr)
         for(Map.Entry<String,Integer> e: map.entrySet()){

            System.out.println(e.getKey()+" "+e.getValue());
           // System.out.println(e.getValue());

         }
    }
    
}
