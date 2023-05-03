package Arraylist;
import java.util.*;

public class arrayl2 {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Banana");
        al.add("Mango");
        al.add("Grapes");
        al.add("Pineapple");

        //traversing through for-each loop
        for( String fruit:al)
        System.out.println(fruit+" ");
    }
    
}
