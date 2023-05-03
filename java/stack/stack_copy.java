package stack;
import java.util.*;
public class stack_copy {
    public static void main(String[] args) {
        Stack<Integer> ss=new Stack<>();
        ss.push(1);
        ss.push(23);
        ss.push(90);
        ss.push(5);
        ss.push(34);
        System.out.println(ss);
  Stack<Integer> rt=new Stack<>();

  while(ss.size()>0){
    rt.push(ss.pop());
  }
  System.out.println(ss);
  System.out.println(rt);
    }
    
}
