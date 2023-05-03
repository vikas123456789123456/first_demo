package Arraylist;
import java.util.*;

public class array_set_get {
    public static void main(String[] args) {

        ArrayList<String> al= new ArrayList<String>();
        al.add("Tiger");
        al.add("Lion");
        al.add("Elephant");
        al.add("Dog");
        al.add("Cat");

        //ACCESSING THE ELEMENT
        System.out.println("Returing element="+al.get(1));

        // CHANGING THE ELEMENT
        al.set(1,"Fox");

        //TRAVERSING

        for(String ani:al)
        System.err.println(ani);
        

    }
    
}
