package Array;

import java.util.Arrays;

public class ArrayLeftRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n= arr.length;
        System.out.println(Arrays.toString(arr));
      //  int[] rotateByOne = rotateByOne(arr, n);
      //  System.out.println(Arrays.toString(rotateByOne));
        int d=3;

        System.out.println("Rotate By "+d+" position");

      //  int[] leftRotateByD = leftRotateByD(arr, n,d );
      //  System.out.println(Arrays.toString(leftRotateByD));

        int[] leftRotateByd = leftRotateByd(arr, n, d);
        System.out.println(Arrays.toString(leftRotateByd));

    }
    // left rotate by One [O(n)]
    static int[] rotateByOne(int arr[],int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }

    // left rotate by d position [O(n*d)]
    static int[] leftRotateByD(int arr[],int n,int d){
        for(int i=0;i<d;i++){
            rotateByOne(arr,n);
        }
        return arr;
    }


    //leftRotate By D using extra space [Tc=O(n)/ extra space=O(n)]

    static int[] leftRotateByd(int arr[],int n,int d){
        int[] temp= new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
        return arr;

    }




}
