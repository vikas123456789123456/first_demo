package Arraylist;
import java.util.*;


public class al {
    
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> list2=new ArrayList<String>();
        //add element
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);
        list2.add("a");
        list2.add("ab");
        list2.add("abc");
        list.add(3,4);//add element between the index
       // list.set(3,4);             // add element at the place prevoius one..
        list2.add(1,"aa");
        list2.remove(1);

        System.out.println(list2.get(2));
        System.out.println(list);
        System.out.println(list2);
       // Collections.sort(list);
    }
}
