package problem;

public class rec_sum_digit {

    public static int sum(int n){
        if(n==0)
         return n;
         else
          return(n%10+sum (n/10));
    }

    public static void main(String[] args) {

        System.out.println(sum(247));
         
    }
    
}
