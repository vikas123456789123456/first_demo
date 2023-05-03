package pattern;
import java.util.Scanner;
public class nmpatt13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int k=0;
            for(int j=x-i;j>=1;j--)
            System.out.print(++k+" ");
            System.out.println();

        }
        for(int i=1;i<x;i++){
            int y=0;
            for(int j=0;j<=i;j++)
                System.out.print(++y+" ");
                System.out.println();


        }

    }
    
}
