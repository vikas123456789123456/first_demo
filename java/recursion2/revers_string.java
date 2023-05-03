package recursion2;
import java.util.*;
public class revers_string {
    static String rev(String s,int idx){
       if(idx==s.length())
       return "";
        String str=rev(s,idx+1);
        return str+ s.charAt(idx);
    }
   static void reverse(String s,int idx){
        if(idx==s.length())
        return ;
        reverse(s,idx+1);
        System.out.print(s.charAt(idx));

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string=");
        String s=sc.nextLine();
        String sr=rev(s,0);
        System.out.println(sr);
        reverse(s,0);
    }
    
}
