package Recursion;

public class printN_3 {

    public static void printNum(int n){
        if(n==0)
        return;
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        int y=5;
        printNum(y);
        
    }
    
}
