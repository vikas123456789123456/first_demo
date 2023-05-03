package constractor;
class adder{
    static int add(int x,int y){
        return(x+y);
    }
    static double add(double x,double y){
        return(x+y);
    }
}

public class overloding2 {
    public static void main(String args[]){
        System.out.println(adder.add(11,11));
        System.out.println(adder.add(11.8,12.2));
    }
    
}
