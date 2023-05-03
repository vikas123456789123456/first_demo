package pattern;
import java.util.Scanner;
public class empty_rightpasvtri {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS=");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
           if(j==1 ||j==i)
           System.out.print("*");
           else 
           System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                if(j==1||j==n-i)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
