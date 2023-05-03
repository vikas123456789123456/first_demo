package Linked_list;
import java.util.*;

public class ll_1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("this");
        System.out.println(list);
        list.removeLast();
        list.addFirst("this");
        System.out.println(list);
        list.add("list");
        System.out.println(list);
        list.removeFirst();
        list.addFirst("This");
        System.out.println(list.size());
        
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -->");
        }
        System.out.println("null");
    }
}
