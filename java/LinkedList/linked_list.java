package LinkedList;
import java.util.*;
public class linked_list {
    public static void main(String[] args) {

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Grapes");
        ll.add("Pine Apple");
         Iterator<String> itr=ll.iterator();
         while(itr.hasNext())
         System.err.println(itr.next());
        
    }
    
}
