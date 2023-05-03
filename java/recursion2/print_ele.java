package recursion2;

public class print_ele {
    static void  print_ele(int[] arr1,int n){
        if(n==arr1.length){
        //System.out.print(arr1[n-1]);
        return;
        }
        System.out.print(arr1[n]+" ");
        print_ele(arr1,n+1);

    }
    public static void main(String[] args) {
        int [] arr={3,5,3,5,6};
        int n=0;
        print_ele(arr,n);
    }
}
