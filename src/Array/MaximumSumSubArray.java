package Array;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr={5,8,-14,4,15,6};
        int n=arr.length;
        System.out.println(maxSumSubArray1(arr,n));
        System.out.println(maxSumSubArray(arr,n));

    }
    static int maxSumSubArray1(int arr[],int n){
        int res=arr[0];

        for(int i=0;i<n;i++){
           int curr=0;
            for (int j = i; j <n ; j++) {
                curr+=arr[j];
                res=Math.max(res,curr);

            }
        }
        return res;

    }static int maxSumSubArray(int arr[],int n){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;

    }
}
