package LinkedList;
import java.util.*;
public class liked_add_2 {
    public static void main(String[] args) {
        
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Kavi");
        ll.add("Kitu");

        //ADDING ELEMENT AT THEIR SPECIFIC LOCATION

        ll.add(1,"Vikas");
        for(String st:ll)
        System.err.println(st);

        LinkedList<String> ll2=new LinkedList<String>();
         ll2.add("India");
         ll2.add("Russia");
         ll2.add("USA");
         ll2.add("Australia");

         //ADDING LIST TO ANOTHER LIST

         System.err.println("After adding another element=");

         ll.addAll(0,ll2);
         for(String st:ll)
        System.err.println(st);

        ll.addFirst("Country");
        ll.addLast("Finish");
        System.err.println("After modification updated list=");
        for(String st:ll)
        System.err.println(st);




    }
}
