package POTD;

public class Toggle {
    public static void main(String[] args) {
        int arr[]={1,0,0,0,1};
        int n= arr.length;
        System.out.println(toggle(n,arr));

    }
    public static int toggle(int n, int[] a) {
        // code here
        int i = 0;
        int max = 0;
        int lone = 0;
        while(i < n){
            if(a[i] == 1){
                lone++;
                i++;
            } else{
                int zero = 0;
                int j = i;
                while(j < n && a[j] == 0){
                    zero++;
                    j++;
                }
                int rone = 0;
                i = j;
                while(j < n && a[j] == 1){
                    rone++;
                    j++;
                }
                max = Math.max(max, zero + lone + rone);
                lone = 0;
            }
        }
        max = Math.max(max, lone);
        return max;
    }
}
