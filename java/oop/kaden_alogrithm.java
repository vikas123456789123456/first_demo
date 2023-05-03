package oop;

public class kaden_alogrithm {
    int maxSumSubArray(int a[]){

        int maxSum=0;
        int curSum=0;
        for(int i=0;i<a.length;i++){
            curSum= curSum+a[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        
        kaden_alogrithm aa=new kaden_alogrithm();
        int arr[]={5,-4,-2,6,-1};
        aa.maxSumSubArray(arr);

    
    }
    
}
