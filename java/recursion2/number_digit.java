package recursion2;

import java.util.Scanner;

public class number_digit {
    static int nod(int n){
        if(n>=0 && n<=9)
        return 1;
       return  nod(n/10)+1;
        
    }

public static void main(String[] args) {
    System.out.println("This program find the number of digit in the given number");
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number=");
    int n=sc.nextInt();
    System.out.println("number of digit="+nod(n));
}
    
}
