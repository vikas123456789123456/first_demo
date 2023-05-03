/*package Arrays;
import java.util.Scanner;
 
public class reading_row_c0l {
    static void printmatrix(int[][] matrix,int r){
        int toprow=0,leftcol=0,rightcol=r-1,bottomrow=r-1;

        int totele=0;
        while(totele<r*r){
            for(int i=leftcol;i<=rightcol && totele<r*r;i++){
            System.out.print(matrix[toprow][i]+" ");
            totele++;
            }
            toprow++;
            for(int i=toprow;i<=bottomrow && totele<r*r;i++){
                System.out.print(matrix[i][rightcol]+" ");
                totele++;

            }
            rightcol--;
            for(int i=rightcol;i<=leftcol && totele<r*r;i--){
                System.out.print(matrix[bottomrow][i]);
                totele++;
            }
            bottomrow--;
            for(int i=bottomrow;i<=toprow && totele<r*r;i--){
                System.out.print(matrix[i][leftcol]+" ");
                totele++;
            }
            leftcol++;

        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("THIS PROGRAM TAKE SQUARE MATRIX AND PRINT PRINT EACH ELEMENT ");
        System.out.print("enter number of row=");
        int row=sc.nextInt();
        int matx[][]=new int[row][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print("enter the element of matrix=");
                matx[i][j]=sc.nextInt();
             
            }
            System.out.println();


            
        }
        printmatrix(matx,row);

        


        
    }
    
}
*/