package pattern;
import java.util.Scanner;
public class numpatt1 {
    public static void main(String[]args){
        System.out.println("IT WILL PRINT NUMBER IN TRIANGLE SHAPE");
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROW=");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++)
            System.out.print(j+" ");
            System.out.println("");
        }

    }
    
}
