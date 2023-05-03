package pattern;
import java.util.Scanner;
public class numpatt17 {
    public static void main(String [] args ){
       Scanner sc=new Scanner(System.in);
       System.out.print("ENTER THE NUMBER OF ROWS= ");
       int x=sc.nextInt();
       for(int i=0;i<x;i++){
        int k=i;
        int y=1;
        for(int j=1;j<=x-i;j++)
        System.out.print(++k+" ");
        for(int z=1;z<=i;z++)
         System.out.print(y++ +" ");
        System.out.println();
        
       }


    }
    
}
