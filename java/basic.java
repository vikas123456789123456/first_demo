import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class basic {
   public static void main(String[]args){
/* decleration of integers
    int x,y,;
x=5;
y=5;
System.out.println("value of x ="+x+ "value of y="+y);*/
// Find max  number  from user input
System.out.println("You are going to enter three number and Greater of three number from your input is display");
while( true){

int a,b,c,ch;
Scanner sc=new Scanner(System.in);
System.out.print("enter first number=");
a=sc.nextInt();
System.out.print("enter second number=");
b=sc.nextInt();
System.out.print("enter third number=");
c=sc.nextInt();
if(a>b &&a >c)
  System.out.println("max number="+a);
if(b>c && b>a)
  System.out.println("max number="+b);
else 
System.out.println("max number="+c);
System.out.print("enter 1 for continue and 2  for exit=");
ch=sc.nextInt();
if( ch==2)
 break;
}
   }
}

