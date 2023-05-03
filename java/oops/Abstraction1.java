package oops;
abstract class bike{
      //Abstract method
      abstract void run();

    //Non abstract method
   
    void gear(){
     System.out.println("Change the gear");
    }

    //Constractor
    bike(){
        System.out.println("Thanks for buying Bike");
    }
    

}
class honda extends bike{
    void run(){
        System.out.println("Running safftely");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        
        honda hh=new honda();
        hh.run();
        hh.gear();
    }
    
}
