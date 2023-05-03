package Recursion;

public class reverseString_8 {
    public static void read(int index,String s){
        if(index==0){
            System.out.println(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        read(index-1,s);

    }
    public static void main(String[] args) {
        String s="Congratulations";
        read(s.length()-1,s);
        
    }
    
}
