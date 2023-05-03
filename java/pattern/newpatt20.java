package pattern;
import java.net.SocketImpl;
import java.net.SocketPermission;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class newpatt20 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.err.print("ENTR THE NUMBER OF ROWS="); // TILL NOW THERE IS AN ERROR IN THIS PROGRAM 
        int n=sc.nextInt();
         
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            for(int k=1;k<=2*i-1;k++){
                if(k==1 || k==2*i-1 ||i==n )
                System.out.print(i);
                else
                 System.out.print(" ");

            }
            System.out.println();
        }
        
      
    }
}
    

