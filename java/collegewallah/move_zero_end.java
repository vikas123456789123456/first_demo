import java.util.Scanner;
public class move_zero_end {
    public static void move_zero(int [] arr){
        int ans[]=new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            ans[idx]=arr[i];
            idx++;
        }
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]<=0){
            ans[idx]=arr[i];
        }
    }
    System.out.println("Element of original array=");
    for(int x:arr)
    System.out.print(x+" ");
    System.out.println();
    System.out.println("element after moving=");
    for(int x:ans)
    System.out.print(x+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of array=");
          int n=sc.nextInt();
          int arr[]=new int[n];
          
          for(int i=0;i<n;i++){
            System.out.print("enter element=");
            arr[i]=sc.nextInt();

          }
          move_zero_end.move_zero(arr);

    }
    
}
