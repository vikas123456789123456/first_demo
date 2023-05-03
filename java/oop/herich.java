package oop;
import java.util.Scanner;
class Input{
    Scanner sc=new Scanner(System.in);
    int a,b;
    void getData(){
        System.out.print("Enter first number=");
        a=sc.nextInt();
        System.out.print("Enter second number=");
        b=sc.nextInt();
    }

}
class Add extends Input{
    void sum(){
        System.out.println("Sum of given two number="+(a+b));

    }

}
class Substract extends Input{
    void sub(){
        System.out.println("Substraction of given two number="+(a-b));

    }

}

public class herich {
    public static void main(String[] args) {
        Add aa=new Add();
        Substract bb=new Substract();
        aa.getData();
        aa.sum();
        bb.getData();
        bb.sub();

    }
    
}

   
    

