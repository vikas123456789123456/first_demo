package oop;
interface printable{
    void print();

}
interface showable{
    void print();
}
class test implements printable,showable{
   public void print(){
        System.out.println("hello this is multiple inheritance");
    }
}

public class multiple_inh {
    public static void main(String[] args) {
        test aa=new test();
        aa.print();
;    }
    
}
