package pattern;
import java.util.Scanner;
public class lrightpastri {
    public static void main(String [] args){
    System.out.println("THIS WILL PRINT LEFT RIGHT TRIANGLE PATTERN");
     Scanner sc=new Scanner(System.in);
     System.out.print("ENTER THE NUMBER OF THE ROWS=");
     int x=sc.nextInt();
     for(int i=1;i<=x;i++){
        for(int j=0;j<x-i;j++)
         System.out.print(" ");
         for(int k=0;k<i;k++)
          System.out.print("*"+"");
        System.out.println("");
     }
      for(int i=1;i<x;i++){
        for(int k=0;k<i;k++)
         System.out.print(" ");
        for(int j=0;j<x-i;j++)
        System.out.print("*"+"");
        System.out.println("");

      }

    }
}
