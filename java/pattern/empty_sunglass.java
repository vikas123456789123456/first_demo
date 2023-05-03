package pattern;
import java.net.SocketPermission;
import java.util.Scanner;


public class empty_sunglass {
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
       /*  for(int i=1;i<n;i++){
            int y=i+1;
            for(int j=1;j<n-i;j++)
            System.out.print(" ");
            for(int k=1;k<=y*2-1;k++){
                if(k==1 || k==y*2-1 ||y==n)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }*/
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            for(int k=1;k<=i*2-1;k++){
                if(k==1 || k==i*2-1|| i==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }

        
        System.out.println();
    }
}
    
}
