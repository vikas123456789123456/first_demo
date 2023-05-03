package String;
import java.util.Scanner;
public class palindrome_string {
    public static void main(String args[]){
        System.out.println("THIS PROGRAM WILL TELL THAT GIVEN STRING IS PALONDROME OR NOT?");
        Scanner sc=new Scanner(System.in);
        String s=new String();
        System.out.print("enter the letter=");
        s=sc.nextLine().toLowerCase().trim();
        int str=0;
        int lst=s.length()-1;
        int flag=0;
        while(str<lst && flag==0){
            if(s.charAt(str)!=s.charAt(lst)){
                flag=1;

            }
            str++;
            lst--;

        }
        if(flag==0)
        System.out.println("GIVEN LETTER IS PALINDROME");
        else
        System.out.println("GIVEN LETTER IS NOT PALINDROME");

    }
    
}
