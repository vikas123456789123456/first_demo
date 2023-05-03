package pattern;
 import java.util.Scanner;
public class numpatt8 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS YOU WANT IN THE PATTERN=");
        int x =sc.nextInt(); 
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++)
              System.out.print(j+" ");
              System.out.println();
        }
        for(int i=1;i<x;i++){
            int n=0;
            for(int j=x-i;j>=1;j--)
              System.out.print(++n+" ");
              System.out.println();
        }

    }
    
}
