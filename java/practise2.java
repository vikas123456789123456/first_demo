import java.util.Scanner;
public class practise2 {
 public static void main(String [] args ){
     System.out.println("THIS PROGRAM WILL RETURN ALL THE PRIME NUMBER UPTO GIVEN NUMBER");
     Scanner sc =new Scanner(System.in);
     System.out.print("ENTER THE NUMBER=");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
        int count=0;
        for(int j=1;j<=i;j++){
            if(i%j==0)
             count++;
            }
            if(count==2)
              System.out.println(i);
     }
 }   
}
