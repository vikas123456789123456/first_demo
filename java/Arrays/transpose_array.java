package Arrays;

public class transpose_array {
    public static void main(String[] args){
        System.out.println("THIS PROGRAM RETURN THE TRANSPOSE OF MATRIX");
        int arr[][]={{1,2,3},{4,7,2},{7,4,3}};
        int trns[][]=new int[3][3];
        System.out.println("Original array=");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
             System.out.print(arr[i][j]+" ");
             System.out.println();

        }
        for(int i=0;i<3;i++){
         for(int j=0;j<3;j++)
         trns[i][j]=arr[j][i];
        }
        System.out.println("Array after transpose=");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
             System.out.print(trns[i][j]+" ");
             System.out.println();
    }
       
    System.out.println("PRINTING TRANSPOSE OF MATRIX WITHOUT USING EXTRA SPACE=");
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
        System.out.print(arr[j][i]+" ");
        System.out.println();
       }
        
        
 }
    
}
