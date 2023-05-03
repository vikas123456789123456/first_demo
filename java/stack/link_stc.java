package stack;
import java.util.*;
public class link_stc {
    public class Node{
        int val;
        Node next;

    }
    public static class Stack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val+" ");
            }
        }
    }
    public static void main(String[] args) {
        Stack st =new Stack();
        st.push(4);
        st.push(5);
        st.push(2);
        st.push(8);
        st.push(7);
    }
}
