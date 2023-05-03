package pattern;
import java.util.Scanner;
public class numpatt16 {
    private static int j;

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            int num=i;
            int j;
            for(j=1;j<=i;j++){
            System.out.print(num+" ");
            num=num+x-j;
        }
        System.out.println();
        }

        
    }
    
}
