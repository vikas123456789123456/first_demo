package recursion2;
import java.util.*;
public class ret_idx_array {
    static ArrayList<Integer>rot(int arr[],int idx,int tar){
        if(idx >=arr.length)
        return new ArrayList<Integer>();
        ArrayList<Integer> ans= new ArrayList<Integer>();
        if(arr[idx]==tar)
        ans.add(idx);
         ArrayList<Integer> smallans=rot(arr,idx+1,tar);
        ans.addAll(smallans);
        return ans;


    }
    public static void main(String[] args) {
        System.out.println("This program return the all idx of target element ");
         int array[]={3,2,4,5,4,2,4};
         int tar=4;
        ArrayList<Integer> rest= rot(array,0,tar);
        for(int i:rest)
        System.out.println(i);

    }
    
}
