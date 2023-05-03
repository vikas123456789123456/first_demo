package inheritance;
import java.util.Scanner;

class A{
    Scanner sc=new Scanner(System.in);
    int a;
    void input1(){
        System.out.print("enter first number=");
        a=sc.nextInt();

    }  //THIS IS MULTILEVEL INHERIANCE

}
class B extends A{
    int b;
    void input2(){
        System.out.print("enter second number=");
        b=sc.nextInt();
    }

}
class add extends B{
    void result(){
        System.out.println("sum of two number="+(a+b));
    }
}

public class singin {

     public static void main(String[] args) {
        add aa=new add();
        aa.input1();
        aa.input2();
        aa.result();
        
    }
    
}
