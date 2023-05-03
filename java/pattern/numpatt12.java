package pattern;
import java.util.Scanner;
public class numpatt12 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
         int x= sc.nextInt();
         for(int i=1;i<=x;i++){
            for(int j=1;j<i;j++)
                System.out.print(j+" ");
                for(int k=i;k>=1;k--)
                System.out.print(k+" ");
                System.out.println();

            
         }

    }

}
