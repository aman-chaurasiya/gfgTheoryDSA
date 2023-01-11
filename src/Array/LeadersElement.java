package Array;

public class LeadersElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,60,50};
        int n= arr.length;
        leaders(arr,n);
        System.out.println();
        leaders2(arr,n);

    }

    // leaders in array in [O(N*N)] complexity
    static void leaders(int arr[],int n){
        for(int i=0;i<n;i++){
            boolean flag=false;
            for (int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if (flag==false){
                System.out.print(arr[i]+" ");
            }
        }
    }

    //  leaders in [O(n)] complexity
    static void leaders2(int arr[],int n){
        int curr_ldr=arr[n-1];
        System.out.print(curr_ldr+" ");
        for (int i=n-2;i>=0;i--){
            if(arr[i]>curr_ldr){
                curr_ldr=arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
}
