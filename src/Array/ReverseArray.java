package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int n= arr.length;
        System.out.println(Arrays.toString(reverse(arr,n)));
    }
    static int[] reverse(int []arr,int n){
        int i=0;
        int j=n-1;
        while (i<j){
            arr[i]=arr[j]+arr[i];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];

            i++;
            j--;
        }
        return arr;
    }
}
