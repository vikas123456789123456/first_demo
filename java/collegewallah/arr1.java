import javax.sql.rowset.spi.SyncResolver;

public class arr1 {
    public static void main(String[] args) {

        int arr[]={2,-3,5,8,1,0,-4};
        
          //we have to find minmium element 
          int min=arr[0];
          for(int i=0;i<arr.length;i++){
  
              if(arr[i]<min)
              min=arr[i];
  
          }
          System.out.println("Minimum element of given array="+min);
    }
}
