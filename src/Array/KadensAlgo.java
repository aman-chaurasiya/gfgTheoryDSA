package Array;

public class KadensAlgo {
    public static void main(String[] args) {
        int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n=arr.length;
        System.out.println(maxSumSubArray(arr,n));

    }
    static long maxSumSubArray(int[] arr,int n){
        long maxSum=Integer.MIN_VALUE;
        long curSum=0;
        for(int i=0;i<n;i++){
            curSum+=arr[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
}
