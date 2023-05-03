package String;

public class String_swap {
    public static void main(String []args){
        System.out.println("Swaping two string without using third variable");
        String a="hello";
        String b="world";
        System.out.println("Before swaping");
        System.out.println("Value of a="+a);
        System.out.println("Value of b="+b);

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After swaping");
        System.out.println("Value of a="+a);
        System.out.println("Value of b="+b);
        

    }
    
}
