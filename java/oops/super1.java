package oops;
class Animal{
    String color="black";
}
class dog extends Animal{
    String color="white";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}


public class super1 {
    public static void main(String[] args) {
        dog dd=new dog();
        dd.printcolor();
    }
    
}
