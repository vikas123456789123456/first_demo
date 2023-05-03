package pattern;
  import java .util.Scanner;
public class RDTRI {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("THIS WILL PRINT RIGHT DOWNWORD TRIANGLE");
     System.out.print("enter the number of rows=");
    int x=sc.nextInt();
     for(int i=0;i<x;i++){
        for(int k=0;k<i;k++)
         System.out.print(" ");
        for(int j=1;j<=x-i;j++)
         System.out.print("*"+"");//apply space for opposite pyramid
         System.out.println("");



     }
    }
}
