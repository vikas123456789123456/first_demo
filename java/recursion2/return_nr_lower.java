package recursion2;
import java.util.Scanner;
public class return_nr_lower {
    static int  lower(String s,int idx){
        if(idx==s.length())
         return 0;
           int x= lower(s,idx+1);
           if(Character.isLowerCase(s.charAt(idx)))
           return x + 1;
           else
           return x;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string=");
        String s=sc.nextLine();
        System.out.println(lower(s,0));
    }
    
}
