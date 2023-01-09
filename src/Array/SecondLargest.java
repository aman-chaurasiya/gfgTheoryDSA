package Array;

public class SecondLargest {

    public static void main(String[] args) {
        int []arr={1,2,15,4,5,16};
        System.out.println(secondL(arr));

    }
    static int secondL(int arr[]){ //O(N) complexity
        int n= arr.length;
        int largest=arr[0];
        int res=arr[0];
        for(int i=0;i<n ;i++){
            if (arr[i]>largest){
                res=largest;
                largest=arr[i];
            }
            if(arr[i]>res && arr[i]<largest){
                res=arr[i];
            }


        }
        return res;
    }
}
