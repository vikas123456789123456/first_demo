package pattern;
import java.util.Scanner;
public class chpatt1 {
    public static void main(String []args){
        System.out.println("this program print the character in pattern of right angle triangle");
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS=");
        int x=sc.nextInt();
        char al=65;
        for(int i=1;i<=x;i++){
            for(int j=0;j<i;j++)
            System.out.print((char)(al+j) +" ");
            System.out.println();
        }

    }
    
}
