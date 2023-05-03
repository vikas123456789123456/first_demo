package pattern;
import java.util.Scanner;
public  class chpatt4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
        int x=sc.nextInt();
        int al=65;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++)
            System.out.print(" ");
            for(int k=0;k<i;k++)
            System.out.print((char)(al+k)+" ");
            System.out.println();

        }

    }
    
}
