package Arrays;
import java.util.Scanner;

public class pr_eve_array {
    public static void main (String []args){

        System.out.println("THIS PROGRAM PRINT ELEMENT OF ARRAY PRESENT AT EVEN POSITION----");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array=");
        int l=sc.nextInt();
        int arr[]=new int[l];
        for (int i=0;i<l;i++){
            System.out.print("Enter "+(i+1)+" element=");
            arr[i]=sc.nextInt();
        }
        System.out.println("Element of array is=");
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();

        System.out.println("Element of array present at even position=");
        for(int i=1;i<=arr.length;i++){
            if(i%2==0)
            System.out.print(arr[i-1]+" ");
        }


    }

    
    
}
