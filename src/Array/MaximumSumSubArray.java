package Array;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr={5,8,-10,4,15,6};
        int n=arr.length;
        System.out.println(maxSumSubArray(arr,n));

    }
    static int maxSumSubArray(int arr[],int n){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;

    }
}
