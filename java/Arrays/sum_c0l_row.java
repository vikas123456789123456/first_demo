package Arrays;

public class sum_c0l_row {
    public static void main(String []args){
        System.out.println("THIS PROGRAM RETURN THE SUM OF EACH ROW AND COLUMNS------");
        int sum;
        int arr[][]={{1,2,4,},{4,3,1},{6,3,5}};
        System.out.println("ELEMENT OF MATRIX IS=");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
             System.out.print(arr[i][j]+" ");
             System.out.println();
        }
        for(int i=0;i<3;i++){
            sum=0;
            for(int j=0;j<3;j++){
                sum=sum+arr[i][j];}
                System.out.println("sum of "+(i+1)+" rows= "+sum);
            

        }
        for(int i=0;i<3;i++){
            sum=0;
            for(int j=0;j<3;j++){
                sum=sum+arr[j][i];}
                System.out.println("sum of "+(i+1)+" column= "+sum);
            
            }
        
    }

}
