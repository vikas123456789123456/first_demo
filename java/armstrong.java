import java.util.Scanner;
public class armstrong {
    public static void main(String [] args){
        System.out.println("THIS PROGRAM WILL TELL THAT WHETHER GIVEN NUMBER IS ARMSTRONG OR NOT ");
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER=");
        int n=sc.nextInt();
        int z=n,count=0,sum=0,p;
        while (z>0){
            count++;
            z=z/10;       
        }
        z=n;
        while(z>0){
             p=1;
            int d=z%10;
            for(int i=1;i<=count;i++)
            p=p*d;
            sum=sum+p;
            z=z/10;
        }
        if(n==sum)
        System.out.println("GIVEN NUMBER  "+n+" IS ARMSTRONG");
        else
        System.out.println("given number "+n+" IS NOT ARMSTRONG");


    }
    
}
