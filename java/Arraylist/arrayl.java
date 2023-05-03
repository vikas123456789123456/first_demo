package Arraylist;
import java.util.*;

public class arrayl {
    public static void main(String[] args) {
        
        ArrayList<String> al=new ArrayList<String>();//creating arraylist
        al.add("Vikas");                           //Inserting data into  arraylist
        al.add("Capatian America");
        al.add("Iron man");
        al.add("Thor");
        al.add("Doctor strange");
        // printing element of arraylist
        System.out.println(al);
        
        //Traversing list through iterator
        Iterator itr=al.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());
    }
    
}
