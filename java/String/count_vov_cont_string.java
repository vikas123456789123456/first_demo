package String;
import java.util.Scanner;
public class count_vov_cont_string {
    public static void main(String[] args){
    System.out.println("THIS PROGRAM TELL THE NUMBER OF VOVEL AND CONSTANT IN GIVEN SEQUENCY---");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the letter=");
        String st=sc.nextLine();
         st= st.toUpperCase();
        int vol=0,con=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch!=' '){
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                vol++;
                else
                con++;

            }

        }
        System.out.println("Number of vovel="+vol);
        System.out.println("Number of constant="+con);
        

    }
    
}
