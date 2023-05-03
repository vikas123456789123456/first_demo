package LinkedList;

public class doublink {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;

        }
       
        }
       public static void display(Node head){
            Node temp=head;
            while(temp!=null){
              System.out.print(temp.val+" ");
              temp=temp.next;
            }
            System.out.println();

    }
    public static void displayrev(Node tail){
        Node temp=tail;
        while(temp!=null){
          System.out.print(temp.val+" ");
          temp=temp.prev;
        }

}
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(13);
        Node d=new Node(9);
        Node e=new Node(5);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        display(a);
        displayrev(e);

    }
    
}
