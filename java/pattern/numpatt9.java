package pattern;
 import java.util.Scanner;
public class numpatt9 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=x;j>=i;j--)
              System.out.print(j+" ");
              System.out.println();
        }


    }
    
}
