package Arrays;
import java.util.Scanner;
public class sort_bubble {
    public static void main(String [] args){
        System.out.println("THIS PROGRAM SORT(ASCENDIND/DESCENDING) THE ELEMENT OF ARRAY BY THE METHOD OF BUBBLE SORT");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array=");
        int l=sc.nextInt();
        int [] arr=new int[l];
        for(int i=0;i<l;i++){
            System.out.print("Enter "+(i+1)+" element of array=");
            arr[i]=sc.nextInt();
        }
        System.out.println("Element of array=");
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    
    for(int i=0;i<l;i++)
    for(int j=0;j<l-1-i;j++){
        if(arr[j]<arr[j+1]){
            int t=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=t;

        }}
        System.out.println("ELEMENT AFTER SORTING=");
        for(int i:arr)
         System.out.print(i+" ");

    

}
    
}
