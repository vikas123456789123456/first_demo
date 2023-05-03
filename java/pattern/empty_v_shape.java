package pattern;
import java.util.Scanner;
public class empty_v_shape {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS=");
        int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n*2;j++){
            if(j<=i)
            System.out.print("*");
            else if(j>=n*2-i && j<n*2)
            System.out.print("*");
            else 
            System.out.print(" ");
        
        }
        System.out.println();
    }

    }
    
}
