package Array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int []arr={0,0,0,0,5,2,3};
        int n= arr.length;
        System.out.println(Arrays.toString(arr));
        moveZero(arr,n);
        System.out.println(Arrays.toString(arr));

    }

    static void moveZero(int[]arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for (int j = i+1; j < n; j++) {
                    if(arr[j]!=0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;

                    }
                }

            }
        }
    }
}
