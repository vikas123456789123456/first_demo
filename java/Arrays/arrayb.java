package Arrays;
import java.util.Scanner;
public class arrayb {
    public static void main(String args[]){

        System.out.println("THIS PROGRAM WILL FORMED AN ARRAY TAKING INPUT FROM USER");
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("ENTER "+i+ " ELEMENT OF ARRAY=");
            a[i]=sc.nextInt();
        }
        System.out.println("ELEMENT ENTERED SUCCESFULLY");
        int x[]={3,4,5,6,7};
        for(int i=0;i<x.length;i++)
         System.out.println(x[i]);


    }
    
}
