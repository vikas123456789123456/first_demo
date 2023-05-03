import java.util.Scanner;
public class sort_array_zero {
    public static void display(int []arr){
        for(int i:arr)
        System.out.print(i+" ");

    }
    public static void arrange(int []arr){
        int r=0;
        int l=arr.length-1;
        while(r<l){
            if(arr[r]>arr[l]){
              int t=arr[r];
              arr[r]=arr[l];
              arr[l]=t;
            }
            r++;
            l--;
        }


    }
    public static void main(String[] args) {
        System.out.println("THIS PROGRAM ARRANGE THE 0 AND 1 ENTERIES OF ARRAY =");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of array=");
        int l=sc.nextInt();
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            System.out.print("enter the element of array(0,1)only=");
            arr[i]=sc.nextInt();
        }
        arrange(arr);
        display(arr);


    }
    
}
