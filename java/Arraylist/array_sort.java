package Arraylist;
import java.util.*;
public class array_sort {
    public static void main(String[] args) {
        
        ArrayList<String> al=new ArrayList<String>();
         
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");

        System.out.println("BEFORE SORTING ELEMENT OF LIST=");
        for(String fr:al)
        System.out.println(fr);

        System.err.println("AFTER SORTING ELEMENT OF LIST=");

        //SORTING THE LIST ACCORDING THE ALPHABETS LETTER
        Collections.sort(al);

        for(String fru:al)
        System.err.println(fru);

        //CREATING NUMBER LIST

        List<Integer> num=new ArrayList<Integer>();
        num.add(21);
        num.add(16);
        num.add(25);
        num.add(6);
        num.add(26);

        System.err.println("BEFORE SORTING LIST IS=");
         for(Integer nu:num)
         System.err.println(nu);

         System.err.println("AFTER SORTING=");
         Collections.sort(num);
         for(Integer nu1:num)
         System.err.println(nu1);
         Collections.reverse(num);
         System.out.println(num);


    }
    
}
