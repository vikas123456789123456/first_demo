package pattern;
 import java.util.Scanner;
public class numpatt11 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=x-i;j>=1;j--)
            System.out.print(j+" ");
            System.out.println();
        }

    }
    
}
