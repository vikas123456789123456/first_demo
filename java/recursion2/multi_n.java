
package recursion2;
import java.util.Scanner;
public class multi_n {
    static void multi(int n,int k){
        if(k==0)
        return;
         multi(n,k-1);
         System.out.println(n*k);
    }
    public static void main(String[] args) {
        System.out.println("This program multiply the given number upto given number of times");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number=");
        int n=sc.nextInt();
        System.out.print("enter the number of times multiple=");
        int k=sc.nextInt();
        multi(n,k);

        
    }
    
}
