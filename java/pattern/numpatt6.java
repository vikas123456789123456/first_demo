package pattern;
import java.util.Scanner;
public class numpatt6 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS=");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0)
                 System.out.print("0");
                 else
                  System.out.print("1");
            }
            System.out.println("");
        }


    }
    
}
