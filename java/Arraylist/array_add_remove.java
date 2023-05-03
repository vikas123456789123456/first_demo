package Arraylist;
import java.util.*;
public class array_add_remove{
    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<>();

        al.add("Apple");
        al.add("Grapes");
        al.add("Guava");
        al.add("Pineapple");
        System.err.println("fruits are="+al);

        //ADDING AT SPECIFIC POSITION

        al.add(1,"Banana");

        System.err.println(al);

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("fruits");
        al2.add("are");

        //ADDIND ARRAYLIST-2 IN THE ARRAYLIST-1

        al.addAll(0,al2);

        System.err.println(al);
        
        //REMOVING ELEMENT FROM ARRAYLIST
         
        al.remove("Apple");              //BY USING SPECIFIC ELEMENT
        System.err.println("after removng list is="+al);

        //BY USING INDEX POSITION

        al.remove(0);
        System.err.println("after removing list are="+al);

        //creating another list

        ArrayList<String> al3=new ArrayList<String>();
        al3.add("Vikas");
        al3.add("Dishant");

        al.addAll(al3);
         System.err.println("Updated list is="+al);

         //REMOVING GROUP

         al.removeAll(al3);
         System.err.println("Now updated list are="+ al);

        

    }
    
}
