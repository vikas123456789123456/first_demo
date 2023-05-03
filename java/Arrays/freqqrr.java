package Arrays;

public class freqqrr {
    public static void main(String[] args){
        System.out.println("THIS PROGRAM  WILL RETURN THE FREQUENCY OF EACH ELEMENT");
        int arr[]={1,2,8,3,2,2,2,5,1};
        //Arrar will store frequency of element
        int fr[]=new int[arr.length];
        int count;
        int visit=-1;
        for(int i=0;i<arr.length;i++){
           count=1;
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
                //To avoid counting same element again 
                fr[j]=visit;
            }
        }
        if(fr[i]!=visit)
         fr[i]=count;

        }
        System.out.println("Element of array is=");
        for(int j:arr)
        System.out.print(j+" ");
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Element  |  Frequency");
        System.out.println("--------------------------");
        for(int i=0;i<arr.length;i++){
            if(fr[i]!=visit){
                System.out.print("     ");
                System.out.print(arr[i]+"   |   "+fr[i]);
                System.out.println();
            }
        }


    }
    
}
