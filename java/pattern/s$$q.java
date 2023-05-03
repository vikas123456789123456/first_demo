package pattern;
import java.util.Scanner;
public class s$$q {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of the rows=");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
          for(int j=1;j<=x;j++){
            if(j==1 || j==x && i>1 && i!=x)
            System.out.print("*"+" ");
            else if(i>1 && j>1 && i<x && j<x)
            System.out.print("  ");
            else 
            System.out.print("*"+" ");

          }
          System.out.println();
        }
    }
    
}
