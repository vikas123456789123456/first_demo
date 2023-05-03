package recursion2;
import java.util.Scanner;
public class find_ele_array {
    static boolean sof(int [] arr,int idx,int tr){
        if(idx>=arr.length)
        return false;
        if(arr[idx]==tr)
        return true;
        return sof(arr,idx+1,tr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("this program  check the given number is it in given array ");
        int arr[]={4,5,2,7,8};
        System.out.print("enter element to be search=");
        int tr=sc.nextInt();
      if(  sof(arr,0,tr))
       System.out.println("yes found");
    else
    System.out.println("not found");
        
    }
    
}
