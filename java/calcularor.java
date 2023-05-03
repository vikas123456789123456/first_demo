import java.util.Scanner;
public class calcularor {
    public static void main(String[] args){
        System.out.println("Three number taken from user and basic calulation is perform according to user choice");

        Scanner sc =new Scanner(System.in);
        int a,b,c;
        System.out.print("enter first number=");
        a=sc.nextInt();
        System.out.print("enter second number=");
        b=sc.nextInt();
        System.out.print("enter 1 for addition ,2 for multification ,3 for division=");
        c=sc.nextInt();
        if(c==1)
        System.out.println("Addition of two  number="+(a+b));
        else if(c==2)
        System.out.println("Multification of two number="+(a*b));
        else if(c==3)
        System.out.println("Divsion of two number="+(a/b));
        else
        System.out.println("Invalid number");

    }
    
}
