package Arrays;

public class arrayadd {
    public static void main(String [] args){

        int a[][]={{1,2,3},{2,3,4}};
        int b[][]={{3,4,5},{5,6,7}};
        int c[][]=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j]+" ");}
            System.out.println();

        }
        
    }
    
    
    
}
