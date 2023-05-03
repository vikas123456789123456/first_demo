package Arrays;
import java.util.Scanner;
class ascen{
    int n=7;
    int arr[]=new int[n];
    
    void ele(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
        System.out.print("Enter "+(i+1)+" element of array=");
        arr[i]=sc.nextInt();
        }
    }
    void display(){
        System.out.println("Element of array before sorting=") ;
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }

    void sort(){
        int j,t;
        for(int i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;

                }
            }
        }
    }
    void displays(){
        System.out.println("Element of array after sorting") ;
        for(int i:arr)
        System.out.print(i+" ");
    }

}

public class sort_ascen_array {
    public static void main(String args []){
        System.out.println("THIS PROGRAM SORT THE ARRAY BY THE METHOD OF SELECTION SORT=");
        ascen aa=new ascen();
        aa.ele();
        aa.display();
        aa.sort();
        aa.displays();

    }
    
}
