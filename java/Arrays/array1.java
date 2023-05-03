package Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args){

        System.out.println("THIS PROGRAM WILL TAKE INPUT FROM USER AND RETURN SUM OF ALL THE ELEMENT");
        int size,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY=");
        size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter element of array=");
            a[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++){
            sum=sum+a[j];
           
        }
        System.out.println("sum of all the element="+sum);

    }
    
}
