package String;

public class string_fun {
    public static void main(String args []){
        String s="EnducTion";
        System.out.println("for index use="+s.indexOf('c',4));//FIRST OCCURANCE if charcter is not in string return -1
        System.out.println("for uppercase="+s.toUpperCase());
        System.out.println("for lowercase="+s.toLowerCase());
        System.out.println("for some parts= "+s.substring(3));
        System.out.println("for some parts= "+s.substring(1,3));
        System.out.println("for replace="+s.replace('E','a'));//REPLACE WITH FIRST OCCURANCE OF CHARACTER
        System.out.println("for last index="+s.lastIndexOf('n'));
        System.out.println("for lowercase="+s.toLowerCase());
        System.out.println("for index use="+s.indexOf('n',3));
        String s1=" Is very important";
        System.out.println("for concat="+s.concat(s1));
        String s2="  vikas  ";
        System.out.println("length without replacing space="+s2.length());
        System.out.println("for replacing space of begining and ending="+s2.trim().length());


       




    }

    
    
}
