package stack;

import java.util.*;

public class stack_input_fr {
   public static void main(String[] args) {
    Scanner sc=new  Scanner(System.in);
      Stack<Integer> st=new Stack<>(); 
      System.out.print("enter the number of term=");
      int n=sc.nextInt();
      System.out.println("enter the element");
     for(int i=0;i<n;i++){
        int x=sc.nextInt();
        st.push(x);
     }
  System.out.println(st);
   } 
    
}
