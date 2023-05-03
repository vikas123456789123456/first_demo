package recursion2;

public class sum_ele_arr {
    static int  prints(int a[],int n){
        if(a.length==n)
        return 0;
         int sum=prints(a,n+1);
         return sum+a[n];

        
        
    }
    public static void main(String[] args) {
        int arr[] ={3,7,5,5};
        int n=0;
       System.out.println( "sum of array="+ prints(arr,n)); 
    }
    
    }
    

