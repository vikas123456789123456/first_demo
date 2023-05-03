package oop;
class Student{
    void print(){
        System.out.println("hello");
    }
    void data(int x){
       
        System.out.println(x);
        print();

    }
}

public class this1 {
    public static void main(String[] args) {
        Student ss1=new Student();
         ss1.data(10);
        //ss1.print();
      }
        
    }
    

