package Array;

public class FreQuencyInSortedArray {
    public static void main(String[] args) {
        int []arr={10,20,30};
        int n= arr.length;
        printFerq(arr,n);

    }
    static void printFerq(int arr[],int n){
        int freq=1,i=1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+"->"+freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1]!= arr[n-2]){
            System.out.println(arr[n-1]+"->"+ 1);
        }
    }
}