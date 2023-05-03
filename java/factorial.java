import java.util.*;
public class factorial {
    public static void main(String[] args){
        System.out.println("THIS PROGRAM WILL RETURN THE FACTORIAL OF THE GIVEN NUMBER");
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF WHICH FIND THE FACTORIAL=");
        int n=sc.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++)
          fact=fact*i;
        System.out.println("FACTORIAL OF THE NUMBER "+n+" is="+fact );
    }
    
}
