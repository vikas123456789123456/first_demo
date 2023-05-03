package pattern;
 import java.util.Scanner;
public class numpatt14 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int z=i;
            for(int k=1;k<=i;k++)
              System.out.print(" ");
            for(int j=1;j<=x-i;j++)
              System.out.print(++z);
             System.out.println();

        }
        for(int i=1;i<x;i++){
          int y=x-i;
          for(int j=1;j<x-i;j++)
          System.out.print(" ");
          for(int k=0;k<=i;k++)
           System.out.print(y++);
           System.out.println();
        }

    }
}
