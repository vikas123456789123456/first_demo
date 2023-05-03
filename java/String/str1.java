package String;
import java.util.Scanner;
public class str1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("THIS PROGRAM TAKE WORD AS INPUT:");
        String st;
        System.out.print("enter name=");
        st=sc.nextLine();
        for(int i=0;i<st.length();i++){
            System.out.println("character at "+(i+1)+" is = "+st.charAt(i));

        }
        
    }
    
}
