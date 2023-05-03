package LinkedList;
import java.util.*;
class book{
    int id,quantity;
    String name,author,publisher;

    book(int id,String name,String author,String publisher,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}
public class linked_book_3 {
    public static void main(String[] args) {

        //CREATING LIST OF BOOK
        
        List<book> list=new LinkedList<book>();

        //CREATING BOOK

        book b1=new book(101,"vikas","Hv","BPB",8);
        book b2=new book(102,"shivansh","Hs","BPC",10);
        book b3=new book(103,"Yash","KS","BPL",5);
        book b4=new book(104,"Aditiy","Mk", "HCL",6);

        //ADDING BOOK TO LIST

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        //TRAVERSING LIST

        for(book b:list)
        System.err.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

        

    }
    
}
