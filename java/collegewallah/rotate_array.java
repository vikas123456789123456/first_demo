import java.util.Scanner;
public class rotate_array {
    public static void rotate (int []arr,int x){
        int n=arr.length;
        int k=x%n;
        for(int i=n-k;i<n;i++)
            System.out.print(arr[i]+" ");

        for(int i=0;i<k;i++)
        System.out.print(arr[i]+" ");


    }
    public static void main(String[] args) {
      System.out.println("THIS PROGRAM ROTATE THE ARRAY K TIME ");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of array=");
        int n=sc.nextInt();
        int arr[] =new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element "+i+" =");
            arr[i]=sc.nextInt();
        }
        System.out.print("ENTER THE NUMBER UP TO WHICH TIME YOU WANT TO ROTATE=");
        int k=sc.nextInt();
        rotate( arr,k);


    }
    
}
