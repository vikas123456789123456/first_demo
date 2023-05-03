package Arraylist;
import java.util.*;
public class array_empty {
    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<String>();
        System.err.println("Is ArrayList Empty="+al.isEmpty());
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.err.println("After Insertion");
        System.err.println("Is ArrayList Empty="+al.isEmpty());

        
    }
    
}
