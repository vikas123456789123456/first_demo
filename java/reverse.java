import java .util.Scanner;
public class reverse {
    public static void main(String []args){
        System.out.println("program to find the reverse of the Enter number by user");
      
      Scanner sc =  new Scanner(System.in);
      while(true){
      System.out.print("enter the number=:");
      int n=sc.nextInt();
      int r=0;
      while(n>0){
       r=(r*10)+n%10;
       n=n/10;
      }
      System.out.println("Reverse number ="+r);
      System.out.print("Enter 1 for continue the programe and any other number  for exits=");
      int ch=sc.nextInt();
      if(ch!=1)
       break;
    }

    }
    
}
