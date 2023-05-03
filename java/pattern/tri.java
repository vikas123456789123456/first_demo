package pattern;
import java.util.Scanner;

public class tri {
    public static void main(String [] args){
        System.out.println("THIS WILL PRINT THE PATTERN IN RIGHT TRIANGLE");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows=");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=0;j<i;j++)
                System.out.print("*"+" ");
                System.out.println();
        }
    }
    
}
