package String;

public class Prove_String_immutable {
    
    public static void main(String [] args){
        //PROVE THAT STRING IS IMUTABLE
        String s1="java";
        String s2="java";
        System.out.println(s1==s2);
        //AFTER MODIFYING S2 THEY ARE NOT POINTING SAME REFERENCE
        s2+="ava";
        System.out.println(s1==s2);

    }
}
