/*import java.util.Scanner;
public class sum_digit_recus {
   
    static void  sumdigit(int n,int sum){
        
        if(n==0){
        System.out.println("sum of digit of given number="+sum);
        return ;
        }
        sum+=n%10;
        n=n/10;
        sumdigit(n,sum);


    }
    public static void main(String[] args) {
        //THIS PROGRAM ADD THE DIGIT OF GIVEN NUMBER BY RECURSION METHOD
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number=");
        int x=sc.nextInt();
        int sum=0;
       
        sum_digit_recus ss=new sum_digit_recus();

        ss.sumdigit(x,sum);
       // System.out.println(sumdigit(x,sum));
    }
    
}
*/