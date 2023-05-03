package pattern;
 import java.util.Scanner;
public class chpatt3 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS=");
        int x=sc.nextInt();
        int al=65;
        for(int i=0;i<x;i++){
            for(int j=0;j<x-i;j++)
            System.out.print((char)(al+j)+" ");
            System.out.println();

        }
        for(int i=1;i<x;i++){
            for(int j=0;j<=i;j++)
            System.out.print((char)(al+j)+" ");
            System.out.println();
        }

        

    }
    
}
