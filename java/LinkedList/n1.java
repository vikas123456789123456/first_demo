package LinkedList;

public class n1 {
 public static void display(Node head){
    Node temp =head;
    while(temp!=null){
        System.out.print(temp.data +" ");
        temp=temp.next;
    }
 }
public static class Node{
        int data;
        Node next;  //address
     Node(int data){
        this.data=data;

     }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null)
             head=temp;
            else
            tail.next=temp;
            tail=temp;
        }
        void displays(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data +" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(8);
        Node d=new Node(3);
      //   System.out.println(b.data);    //data can also be displayed by this method
      System.out.println(a);
       a.next=b;   //  5->6
       b.next=c;    //  5->6->8
       c.next=d;     //  5->6->8->3  // all the data are linked
      

       // displaying by simple way----
       System.out.println(a.next.data);
       System.out.println(a.next.next.data);

       //Displaying by using loop  

        Node temp=a;
        
       while(temp!=null){
        System.out.print(temp.data +" ");
        temp=temp.next;

       }
       System.out.println();

       // Displaying  by using method
        display(a);

        // creating linkedlist...
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.insertAtEnd(12);
        ll.displays();

        
        
        
    }
    
}
