package Array;

public class LeadersElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int n= arr.length;
        leaders(arr,n);

    }
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
                System.out.println(arr[i]);
            }
        }
    }
}
