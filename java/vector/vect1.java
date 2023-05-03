package vector;
import java.util.*;

public class vect1 {
    public static void main(String[] args) {
        Vector list=new Vector();
        list.addElement("Ram") ;
        list.addElement("Shyam") ;
        list.addElement("Sita") ;
        System.out.println("Vector element are:"+list);
        list.insertElementAt("Krishna",1);
        System.out.println("Vector element after insertion is:"+list);
        System.out.println("capacity="+list.capacity());
        System.out.println("clone="+list.clone());
        System.out.println(list.contains("Ram"));
        System.out.println(list.contains("ram"));//It is case sensitive
        System.out.println(list.elementAt(2));
        System.out.println(list.elements());
        System.out.println(list.size());
        list.add(20) ;
        System.out.println(list.subList(0,5));
        

        



    }
    
}
