package Array;

public class MaxximumDifference {
    public static void main(String[] args) {
        int []arr={10,20,30,10,15,7,8};
        int n= arr.length;
        int maxDiff = maxdif(arr, n);
        System.out.println(maxDiff);
        int maxDiff1 = maxDiff(arr, n);
        System.out.println(maxDiff1);

    }
    static int maxDiff(int[] arr,int n){
        int res=arr[1]-arr[0];
        for (int i = 0; i < n-1; i++) {
            for(int j=i+1;j<n;j++){
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;

    }
    static int maxdif(int[] arr,int n){
        int res=arr[1]-arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            res=Math.max(res,arr[i]-min);
            min=Math.min(min,arr[i]);
        }
        return res;
    }
}
