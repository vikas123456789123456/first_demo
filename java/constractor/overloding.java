package constractor;
class addder{
    static int add(int a,int b){
        return(a+b);}
        static int add(int a,int b,int c){
            return(a+b+c);
        }
}        //EXAMPLE OF METHOD OVERlodding ON THE BASIS OF DIFFERENT PARAMETER

public class overloding {
    public static void main(String args[]){
       // adder aa=new adder();
        System.out.println(addder.add(6,7));
        System.out.println(addder.add(7,8,9));
    }
    
}
