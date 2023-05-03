import java .util.Scanner;

import org.w3c.dom.ls.LSException;
public class prime {
   public static void main(String[] args){
    System.out.println("THIS PROGRAM WILL TELL THAT GIVEN NUMBER IS PRIME OR NOT ");
    Scanner sc=new Scanner(System.in);
    int n,count=0;
    System.out.print("Enter the number=");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        if(n%i==0)
        count++;
       
    }
    if(count==2)
     System.out.println("GIVEN NUMBER "+n+" IS PRIME NUMBER");
    else
    System.out.println("GIVEN NUMBER "+n+" IS NOT PRIME  NUMBER");
   } 
}
