package pattern;
import java.util.Scanner;
public class empty_tri {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS=");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=0;j<=x-i;j++){
                if(j==0 || j==x-i || i==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
