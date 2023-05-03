import java.util.Scanner;
public class arr_acc_des {
    public static void main(String[] args) {
        
        System.out.println("THIS PROGRAM PRINT THE POSITIVE VALUE BEFORE AND THEN NEGAIVE VALUE");
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the length of array");
       int l=sc.nextInt();
       int arr[]=new int[l];
       int ans[]=new int[l];
       int inx=0;
       for(int i=0;i<l;i++){
        System.out.print("enter the element of arrray "+(i+1)+"=");
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<l;i++){
        if(arr[i]>=0){
        ans[inx]=arr[i];
        inx++;}
       }
       for(int i=0;i<l;i++){
        if(arr[i]<0){
        ans[inx]=arr[i];
        inx++;}
       }
       System.out.println("element of array before shorting=");
       for(int i:arr)
       System.out.print(i+" ");
       System.out.println();

       System.out.println("Element of array after shorting=");
       for(int i:ans)
       System.out.print(i+" ");


    }
    
}
