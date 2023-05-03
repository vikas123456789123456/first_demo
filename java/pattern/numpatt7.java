package pattern;
 import java.util.Scanner;
public class numpatt7 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of the rows=");
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
        int k=i;
            for(int s=1;s<=i;s++)
             System.out.print(" ");
            for(int j=x;j>i;j--)
            System.out.print(++k+" ");
            System.out.println("");
         }
            for(int i=1;i<x;i++){
            int h=x-i;
            for(int j=1;j<x-i;j++)
             System.out.print(" ");
            for(int z=0;z<=i;z++)
             System.out.print(h+++" ");
            System.out.println("");
        }

    }
    
}
