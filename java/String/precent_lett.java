package String;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class precent_lett {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE STRING=");
         String s=sc.nextLine().trim();
         int tot=s.length();
         int upp=0;
         int low=0;
         int digit=0;
         int oth=0;
         for(int i=0;i<tot;i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
             upp++;
             else if(Character.isLowerCase(ch))
            low++;
             else if(Character.isDigit(ch))
            digit++;
            else 
            oth++;
         }
         double pupp=(upp*100)/tot;
         double plow=(low*100)/tot;
         double pdigit=(digit*100)/tot;
         double poth=(oth*100)/tot;
         System.out.println("Percentage of uppercase in given String="+pupp);
         System.out.println("Percentage of lowercase in given String="+plow);
         System.out.println("Percentage of digit in given String="+pdigit);
         System.out.println("Percentage of other character in given String="+poth);


    }
}
