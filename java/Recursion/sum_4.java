package Recursion;

public class sum_4 {

    public static void sum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);;
            return;
        }
        sum+=i;
        sum(i+1,n,sum);
    }
    public static void main(String[] args) {
       int y=5;
       sum(1,y,0);

        
    }
    
}
