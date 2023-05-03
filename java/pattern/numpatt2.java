package pattern;
 import java.util.Scanner;
public class numpatt2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS=");
        int x=sc.nextInt();
        int k=0;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++)
             System.out.print(++k +" ");
             System.out.println("");

        }

    }
    
}
