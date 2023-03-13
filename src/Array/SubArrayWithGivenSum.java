package Array;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={4,8,12,5};
        int n=arr.length;
        int sum=17;
        System.out.println(subarray_Sum(arr,n,sum));
        System.out.println(subarraySum(arr,n,sum));

    }
    static boolean subarraySum(int[]arr,int n,int sum){
        for(int i=0;i<n;i++){
            int curr=0;
            for(int j=i;j<n;j++){
                curr+=arr[j];
                if(curr == sum){

                    return true;
                }
            }
        }
        return false;
    }

    static boolean subarray_Sum(int[]arr,int n,int sum){
       int s=0;
       int curr=0;
       for(int i=0;i<n;i++){
           curr+=arr[i];
           while(sum<curr){
               curr-= arr[s];
               s++;
           }
           if(sum==curr)
               return true;
       }
       return false;
    }
}
