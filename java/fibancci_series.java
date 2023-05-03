import java.util.Scanner;
public class fibancci_series {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("THIS PROGRAM WILL RETURN THE FIBANCCI SERIES:");
        int x=0, y=1,z=0,n;
        System.out.print("ENTER THE NUMBER OF TERM SUM IN FIBANCCI SERIES OCCUR=");
        n=sc.nextInt();
           for(int i=0; i<n;i++){ //while(z<n) for upto sum of digit
            System.out.print(z+" ");
            x=y;
            y=z;
            z=x+y;
            
            
        }
    }
    
}
