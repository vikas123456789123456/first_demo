package stack;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class rec {

    public static void recur(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        
    }
    public static void main(String[] args) {

        Stack<Integer> ss=new Stack<>();
        ss.push(1);
        ss.push(23);
        ss.push(90);
        ss.push(5);
        ss.push(34);

        System.out.println(ss);
    
        
    }
    
}
