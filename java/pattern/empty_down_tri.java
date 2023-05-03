package pattern;
import java.util.Scanner;
public class empty_down_tri {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS=");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
           for(int j=0;j<i;j++)
           System.out.print(" ");
           for(int k=1;k<=(n-i)*2-1;k++){
            if(i==0 || k==1 || k==(n-i)*2-1)
            System.out.print("*");
            else 
            System.out.print(" ");
           }
           System.out.println();
        }
    }
    
}
