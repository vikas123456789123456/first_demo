package Arrays;

public class jaggedarray {
    public static void main(String args[]){
        //declearing 2D array with different column
        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[2];
        int count=0;
        //INZILIZING VALUE TO A ARRAY
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            arr[i][j]=count++;
        }
        //PRINTING ELEMENT OF ARRAY
        for(int k=0;k<arr.length;k++){
            for(int j=0;j<arr[k].length;j++)
            System.out.print(arr[k][j]+" ");
            System.out.println();
        }


    }
    
}
