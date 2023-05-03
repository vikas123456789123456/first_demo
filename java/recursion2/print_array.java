package recursion2;

public class print_array {
    static void prints(int a[],int n){
        if(a.length==n)
        return;
        System.out.println(a[n]);
        prints(a,n+1);
        
    }
    public static void main(String[] args) {
        int arr[] ={3,7,9,5,7};
        int n=0;
        prints(arr,n);
    }
    
}
