package oop;
class animal{
    void eat(){
        System.out.println("eat...");
    }
}
class dog extends animal{
   
     void eat(){
        System.out.println("eating bread");}
    void bark(){
        System.out.println("barking...");}
    void work(){
        super.eat();
        bark();
    }

        
     
}

public class supers2 {
    public static void main(String[] args) {
         
        dog dd=new dog();
        dd.work();
        dd.eat();
    }
    
}

