package Array;

public class MaxximumConsicutiveOne {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,1,0,1,1,1,1,1};
        int n= arr.length;
        System.out.println(maxxOne(arr,n));

    }
    static int maxOne(int arr[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            int cur=0;
            for(int j=i;j<n;j++){
                if(arr[j]==1)
                    cur++;
                else
                    break;

            }
            res=Math.max(cur,res);
        }
        return res;
    }

    static int maxxOne(int arr[],int n){
        int res=0,curr=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=1)
                curr=0;
            else {
                curr++;
                res = Math.max(curr, res);
            }

        }
        return res;
    }
}
