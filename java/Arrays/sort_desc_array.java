package Arrays;
import java.util.Scanner;

public class sort_desc_array {
    
    public static void main(String [] args){
        System.out.println("THIS PROGRAM SORT THE ELEMENT OF ARRAY IN DESCENDING ORDER");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of the element=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter "+(i+1)+" element of array=");
            arr[i]=sc.nextInt();

        }
        System.out.println("Original element of array is=");
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
        int i,j,t;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println("Element of array after sorting=");
        for(int k:arr)
        System.out.print(k+" ");
    }
}
