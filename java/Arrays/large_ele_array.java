package Arrays;

public class large_ele_array {
    public static void main(String args []){
        int arr[]={3,4,5,61,7,9};
        int lar=arr[0];
        for(int i=1;i<arr.length;i++){
            if(lar<arr[i])
            lar=arr[i];
        }
        System.out.println("Largest element of array="+lar);

    }
    
}
