import java .util.Scanner;
public class palindrome {
    public static void main(String[] args){
        System.out.println("THIS PROGRAM WILL TELL THAT GIVEN NUMBER IS PALINDROME OR NOT");
        Scanner sc =  new Scanner(System.in);
        while(true){
        System.out.print("enter the number=:");
        int n=sc.nextInt();
        int r=0;
        int z=n;
        while(n>0){
         r=(r*10)+n%10;
         n=n/10;
        }
        if (r==z)
           System.out.println("GIVEN NUMBER  " +z+ " IS A PALINDROME NUMBER");
        else
         System.out.println("GIVEN NUMBER " +z+ " IS NOT A PALINDROME NUMBER");
        System.out.print("Enter 1 for continue the programe and any other number  for exits=");
        int ch=sc.nextInt();
        if(ch!=1)
         break;
      }
    }
    
}
