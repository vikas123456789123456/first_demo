import java.util.Scanner;
public class square {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int a,b,c;
        float d,r1,r2;
        System.out.print(("enter a ="));
        a=sc.nextInt();
        System.out.print(("enter b ="));
        b=sc.nextInt();
        System.out.print(("enter c ="));
        c=sc.nextInt();
       
        d=(b*b)-(4*a*c);
        System.out.println("value of d="+d);
        if(d>0){
            d=d*1/2;
            r1=b-d;
            r2=b+d;
            System.out.println("first root="+r1);
            System.out.println("second root="+r2);


            
        }
        else
            System.out.println("roots not possible");
        
        
    }
    
}
