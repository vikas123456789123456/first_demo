import java.util.Scanner;
public class arry_elem_diff {
    public static int findPair(int arr[],int x){
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]-arr[j]==x)
                 return 1;

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element=");

              arr[i]=sc.nextInt();
        }
        System.out.print("Enter the integer of which you want diference=");
        int x=sc.nextInt();

        int y=findPair(arr,x);
        if(y==1)
        System.out.println("Pair exist");
        else
        System.out.println("Pair not exist");


        

    }
}
