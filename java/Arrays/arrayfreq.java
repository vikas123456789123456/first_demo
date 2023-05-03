package Arrays;
import java.util.Scanner;
public class arrayfreq {
    public static void main(String args[]){
        System.out.println("THIS PROGRAM WILL FIND THE FREQUENCY OF GIVEN NUMBER");
        int []arr={2,3,2,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ELEMENT TO FIND=");
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(num==arr[i])
            count++;
        }
        System.out.println("FREQUENCY of  "+num+" IS="+count);
    }
    
}
