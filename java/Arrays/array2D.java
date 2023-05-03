package Arrays;

public class array2D {
    public static void main(String[]args){

        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        //PRINTING 2D ELEMENT
       /*   for(int i=0;i<3;i++){       READING BY NORMAL FOR LOOP
            for(int j=0;j<3;j++)
             System.out.print(arr[i][j]+"  ");
             System.out.println();
        }*/
        for(int []i:arr){      //READING BY FOR-EACH LOOP
            for(int j:i)
            System.out.print(j+" ");
            System.out.println();
        }
    }
    
}
