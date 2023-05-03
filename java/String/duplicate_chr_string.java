package String;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class duplicate_chr_string {
   void  duplicate(String s){
    StringBuffer sb=new StringBuffer();
    for(int i=0;i<s.length()-1;i++){
        for(int j=i+1;j<s.length();j++){
            char ch1=s.charAt(i);
             char ch2=s.charAt(j);
            if(ch1==ch2){
                sb.append(ch1);
                break;}

            }
    }
    if(sb.length()==0)
    System.out.println("NO DUPLICATE CHARACTER IS FOUND");
    else
    for(int i=0;i<sb.length();i++){
        System.out.println("DUPLICATE CHARACTER IS="+sb.charAt(i));
    }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1= new String();
        System.out.print("Enter the string=");
         s1=sc.nextLine().toLowerCase().trim();
         duplicate_chr_string aa=new duplicate_chr_string();

        aa.duplicate(s1);

    }
    
}
