package Arrays;

public class right_rot_array {
    public static void main(String [] args){
        System.out.println("THIS PROGRAM ROTATE THE ELEMENT OF ARRAY TOWARDS RIGHT DIRECTION:");
        int arr[]={1,2,3,4,9,4,3,4,2,8,5};//Intializing an array
        //number of times element rotate
        int n=1;
        System.out.println("Array before rotation:-----");
        for(int i:arr)
        System.out.print(i+"  ");
        for(int i=0;i<n;i++){
            int j;
            int last=arr[arr.length-1];
            for(j=arr.length-1;j>0;j--)
                 arr[j]=arr[j-1];
             arr[0]=last;//Last element of array become first element
        }
        System.out.println();
        System.out.println("Array after rotation:---");
        for(int i:arr)
        System.out.print(i+"  ");
    }
    
}
