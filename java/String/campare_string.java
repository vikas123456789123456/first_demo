package String;
import java.util.Scanner;
public class campare_string {
    public static void main(String[] args){
        System.out.println("This program will compare two string");
        Scanner sc= new Scanner(System.in);
        String s1=new String();
        String s2=new String();
        System.out.print("Enter first string=");
        s1=sc.nextLine();
        System.out.print("Enter second string=");
        s2=sc.nextLine();
        if(s1.compareTo(s2)==0)//compare on the basis of ASCII VALUE
         System.out.println("String are equals");
        else if(s1.compareTo(s2)>0)
        System.out.println("1-String is greatter than 2");
        else
        System.out.println("2-String is greatter than 2");



    }
    
}
