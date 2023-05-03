package recursion2;
import java.util.Scanner;
public class merging_two_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("this program add two string alternatively 1st string is must be bigger ");
        System.out.print("enter first string=");
        String s1=sc.nextLine();
        System.out.print("enter second string=");
        String s2=sc.nextLine();
        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i));
            if(i<s2.length())
            System.out.print(s2.charAt(i));

        }

        
    }
    
}
