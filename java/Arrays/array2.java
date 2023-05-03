package Arrays;

public class array2 {
    static void min(int a[]){  //THIS PROGRAM TAKE ARRAY AS PARAMETER AND FIND MINIUMUM ELEMENT OF THAT ARRAY
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i])
             min=a[i];
        }     
        System.out.println("Minimum element of aaray="+min);
        System.out.println("Element of arrays=");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        

    }
    public static void main(String args []){
        int arr[]={44,5,6,2};
        array2.min(arr);

    }
    
}
