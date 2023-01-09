package Array;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] res= {7,2,3,5,16};
        System.out.println(largestele(res));

    }

    static int largestele(int []arr){ //(n)2 complexity
        int n= arr.length;
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                return arr[i];
            }


        }
        return -1;

    }


    static int largestEle(int []arr){ // nlogn complexity
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    static int LargestEle(int[] arr){  // O(n) complexity
        int n=arr.length;
        int result=0;
        for(int i=0;i<n ;i++){
            if(arr[i]>result){
                result=arr[i];
            }

        }
        return result;
    }
}
