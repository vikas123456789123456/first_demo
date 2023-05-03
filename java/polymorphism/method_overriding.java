package polymorphism;
class Animal{
    void eat(){
        System.out.println("this is parent class");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("this is derived class");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        //OBJECT OF DERIVED CLASS
     Animal aa= new Dog();
     //CLALLING METHOD
     aa.eat();
     Dog bb=new Dog();
     bb.eat();
     Animal cc= new Animal();
     cc.eat();
        
    }
    
}
