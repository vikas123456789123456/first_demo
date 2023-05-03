package Hash_set;
import java.util.*;

public class pro1 {
    public static void main(String[] args) {

        //creating
        HashSet<Integer> set=new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);//It itself remove duplicate value
        //printing
        System.err.println(set);
        //Another method of printing
        for(Integer it:set)
        System.err.println(it);

        //Searching
        if(set.contains(5))
        System.err.println("Elememt found");
        else
        System.err.println("Element not present");

        if(!set.contains(6))
        System.err.println("Element Not Present");

        
        
        //Removing
        set.remove(1);
        if(set.contains(1))
        System.err.println("Element 1 is present");//IT Treats Duplicate Value As Single Element
        else
        System.err.println("Element 1 is not present");

    }
    
}
