package String;
import java.util.Scanner;
public class equal_ignor_string {

    void Equals(String x,String y){

        if(x.equals(y))//equals function are case sensitive
            System.out.println("Both string are equal");
        else
        System.out.println("String are not equal");
        
    }
    void Equalsignore(String x,String y){
        if(x.equalsIgnoreCase(y))//equalsIgnoreCase function are not case sensitive
            System.out.println("Both string are equal");
        else
        System.out.println("String are not equal");
        

    }
    public static void main(String [] args){

        System.out.println("THIS PROGRAM IS FUNCTION OF STRING EQUALS");
        Scanner sc=new Scanner(System.in);
        String s1=new String();
        String s2=new String();
        System.out.print("enter first string=");
        s1=sc.nextLine();
        System.out.print("enter second string=");
        s2=sc.nextLine();
        equal_ignor_string aa=new equal_ignor_string();
        aa.Equals(s1,s2);
        aa.Equalsignore(s1,s2);


    }
    
}
