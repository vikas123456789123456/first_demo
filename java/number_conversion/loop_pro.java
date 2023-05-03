package number_conversion;
import java.util.Scanner;
public class loop_pro {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(sc.hasNextInt()){
            System.out.println("Enter the number=");
            int n=sc.nextInt();
            
            if(n>=0)
                sum +=n;
            else{
                sum=-1;
                break;
                
            }
           
            System.out.println(sum);  
            
        }
        
    }
    
}
