package Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String args[]){
        System.out.println("THIS PROGRAM PRINT ELEMENT OF ARRAY IN REVERSE ORDER------");
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("enter length of array=");
        int l=sc.nextInt();
        int arr[]= new int[l];
        for(int i=0;i<l;i++){
            System.out.print("Enter "+(i+1)+" element of array=");
            arr[i]=sc.nextInt();
        }
        System.out.println("Element of array in original order=");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        
        System.out.println("Element of array in reverse order=");
        for(int i=arr.length-1;i>=0;i--)
        System.out.print(arr[i]+" ");


    }
    
}
