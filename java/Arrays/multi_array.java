package Arrays;
import java.util.Scanner;
public class multi_array {
    public static void main(String []args){
        System.out.println("THIS PROGRAM RETURN THE MULTIFLICATION OF TWO MATRIX");
        int a1[][]=new int[3][3];
        int a2[][]=new int[3][3];
        int multi[][]=new int [3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ELEMENT FOR FIRST ARRAY=");
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print("enter the element=");
              a1[i][j]=sc.nextInt();
        }
        System.out.println();
       
     }
     System.out.println("ENTER ELEMENT FOR SECOND ARRAY=");
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print("enter the element=");
              a2[i][j]=sc.nextInt();
             
        }
        System.out.println();
       
     }
     System.out.println("element of array first=");
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print( a1[i][j]+" ");
              
        }
        System.out.println();
       
     }
     System.out.println("element of array second=");
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print( a2[i][j]+" ");
              
        }
        System.out.println();
       
     }
        int i,j,k;
        for(i=0;i<3;i++)
         for(j=0;j<3;j++){
            multi[i][j]=0;
            for(k=0;k<3;k++)
            multi[i][j]=multi[i][j]+a1[i][k]*a2[k][j];
         }

    
         System.out.println("multiflication");
         for(int y=0;y<3;y++){
            for(int a=0;a<3;a++)
            System.out.print(multi[y][a]+" ");
            System.out.println();
         }
    }
    
}
