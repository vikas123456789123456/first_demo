package Arrays;

public class rotateleft {
    public static void main(String[] args){
        //INITILIZINGARRAY

        int[] arr={1,2,3,4,5};

        //number of time an array should be rotated
        int n=3;

        //DISPLAYING ELEMENT OF ARRAY
        System.out.println("Original array");

        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();

        //rotate the given array by n times towards left

        for(int i=0;i<n;i++){
            int j,first;
                 //store first element of the array
            first=arr[0];
            for(j=0;j<arr.length-1;j++)
            arr[j]=arr[j+1]; //shifting element of array by one
            //First element of array should be added end
            arr[j]=first;
            
        }
        System.out.println();
         System.out.println("Array after left rotation");
         for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
    
}
