package stack;
import java.util.*;
public class stac1 {


    public static void main(String[] args) {

        Stack<Integer> ss=new Stack<>();
        ss.push(1);
        ss.push(23);
        ss.push(90);
        ss.push(5);
        ss.push(34);
        System.out.println(ss.peek());
        System.out.println(ss);
        System.out.println(ss.size());
        while(ss.size()>1){
            ss.pop();
        }
        System.out.println(ss.peek());
        System.out.println(ss);

  
     
        
    }

}

    

