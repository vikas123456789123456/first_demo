package pattern;
import java.util.Scanner;
public class rightpastri {
    public static void main(String [] args){
    System.out.println("THIS WILL PRINT RIGHT TRIANGL PATTERN");
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the number of rows =");
     int x =sc.nextInt();
     for(int i=0;i<x;i++){
        for(int j=0;j<=i;j++)
          System.out.print("*"+" ");
          System.out.println("");
          
     }
     for(int i=1;i<x;i++){
        for(int j=1;j<=x-i;j++)
          System.out.print("*"+" ");
          System.out.println("");

     }


    }
    
}
