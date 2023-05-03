package recursion2;
import java.util.Scanner;
public class upp_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This program print the substring from first capital letter  ");
        System.out.print("enter the string=");
        String s=sc.nextLine();
        char c;
        for(int i=0;i<s.length();i++){
        c=s.charAt(i);
           if( Character.isUpperCase(c)){
            for(int j=i;j<s.length();j++)
            System.out.print(s.charAt(j));
            break;
           }
             

    }
}
    
}
