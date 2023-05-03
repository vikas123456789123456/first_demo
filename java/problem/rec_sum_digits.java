package problem;

public class rec_sum_digits {

    public static int sum(int n1,int n2){
        if(n1/10==0 && n2/10==10)
         return n1*n2;
         else
         return((n1%10)*(n2%10)+sum(n1/10,n2/10)) ;
    }
    public static void main(String[] args) {
        
        System.out.println(sum(23,3));
    }
    
}
