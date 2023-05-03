package pattern;
import java.util.Scanner;
public class DTRI {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("THIS WILL PRINT DOWNWORD TRIANGLE PATTERN");
        System.out.print("ENTER THE NUMBER OF ROWS=");
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=x-i;j>=1;j--)
             System.out.print("*"+" ");
            System.out.println("");



        }
    }
    
}
