package Arrays;

public class copyarr {
    public static void main(String args[]){
        int arr1[]={2,5,6,8,9,};
        int arr2[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        arr2[i]=arr1[i];
        System.out.println("ELEMENT OF ARR1 IS=");
        for(int j=0;j<arr1.length;j++)
        System.out.print(+arr1[j]+" ");
        System.out.println();
        System.out.println("ELEMENT OF ARR2 IS=");
        for(int j=0;j<arr1.length;j++)
        System.out.print(arr2[j]+" ");



        


        

    }
    
}
