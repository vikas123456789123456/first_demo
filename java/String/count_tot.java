package String;
import java.util.Scanner;
public class count_tot {
    public static void main(String []args){
        System.out.println("THIS PROGRAM TELL THE TOTAL NUMBER OF LETTER IN WORDS");
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the words=  ");
        String st=sc.nextLine();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
             if(ch!=' ')
             c++;
        }
        System.out.println("Total number of words="+c);
    }
    
}
