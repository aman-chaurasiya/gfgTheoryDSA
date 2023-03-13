package Array.SlidingWindow;

public class MaxSumOfKcOnsicutive {
    public static void main(String[] args) {

        int[] arr = {5,-10,6,90,3};
        int k = 2;
        int n = arr.length;
        System.out.println(maxSumEff(arr,k,n));
        System.out.println(maxSum(arr,k,n));

    }

    static int maxSum(int[] arr, int k,
                      int n) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int curr = 0;
            for (int j = 0; j < k; j++) {
                curr += arr[i + j];
            }
            if (curr > res) {
                res = curr;
            }
        }
        return res;


        // O(n*k)/O(1)
    }
    static int maxSumEff(int[] arr,int k,int n){
        int curr=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        for(int i=k;i<n;i++){
            curr=curr+arr[i]-arr[i-k];
            res=Math.max(res,curr);
        }
        return res;


        /////O(n)/O(1)
    }
}

