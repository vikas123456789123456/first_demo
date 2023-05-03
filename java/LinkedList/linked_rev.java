package LinkedList;
import java.util.*;
public class linked_rev {
    public static void main(String[] args) {

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Grapes");
        ll.add("Pine Apple");
        ll.add(1,"Vikas");
        ll.add("Lemon");

        System.err.println("Element are=");
        for(String str:ll)
        System.err.println(str);
        System.err.println();
        
        //removing the element
        ll.remove(1); // BY USING INDEX
        ll.remove("Lemon"); //BY USING ELEMENT

        System.err.println("After remvoal element are=");

        

        for(String str:ll)
        System.err.println(str);
        System.err.println();


        LinkedList<String> ll2=new LinkedList<String>();

        ll2.add("English");
        ll2.add("Maths");

        ll.addAll(ll2);

        System.err.println("After updation list 1=");
        System.err.println();
        for(String str:ll)
        System.err.println(str);
        System.err.println();

        //REMOVING LIST-2 FROM LIST-1

        ll.removeAll(ll2);

        System.err.println("Element after deletion list2=");
        System.err.println();
        for(String str:ll)
        System.err.println(str);
        

        
        
    }
    
}
