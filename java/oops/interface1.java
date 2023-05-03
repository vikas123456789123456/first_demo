package oops;

import String.Prove_String_immutable;

interface printable{
    void print();
    int min=5;//BY DEFAULT COMPILER MAKE IT STATIC AND FINAL
    
    ;

}
class a6 implements printable{
    public void print(){
        System.out.println(" hello interface");
        //min=min+1; IT THROW AN ERRROR BECAUSE IT IS(MIN) FINAL
    }

}

public class interface1 {
    public static void main(String[] args) {
        a6 aa=new a6();
        aa.print();
        System.out.println(printable.min);
        
        
        

    }
}
