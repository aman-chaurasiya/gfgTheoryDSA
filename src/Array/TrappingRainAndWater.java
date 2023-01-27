package Array;

import java.util.Arrays;

public class TrappingRainAndWater {
    public static void main(String[] args) {
        int[] arr={11,10,13};
        int water = rainWater(arr);
        System.out.println(water);

    }

    //O(n^2)
    static int rainAndWater(int[] arr){
        int res=0;
        for(int i=1;i<arr.length;i++){
            int lMax=arr[i];
            for(int j=0;j<i;j++){
                lMax=Math.max(lMax,arr[j]);
            }

            int rMax=arr[i];
            for (int j=i+1;j< arr.length;j++){
                rMax=Math.max(rMax,arr[j]);
            }
            res=res+(Math.min(lMax,rMax)-arr[i]);
        }
        return res;
    }

    static int rainWater(int[] arr){
        int n=arr.length;
        int res=0;
        int l_max[]=new int[n] ;
        int r_max[]=new int[n];

        l_max[0]=arr[0];
        for(int i=1;i<n;i++){
            l_max[i]=Math.max(l_max[i-1],arr[i]);
        }
        System.out.println(Arrays.toString(l_max));
        r_max[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            r_max[i]=Math.max(r_max[i+1],arr[i]);

        }
        System.out.println(Arrays.toString(r_max));
        for(int i=1;i<n-1;i++){
            res=res+(Math.min(l_max[i],r_max[i])-arr[i]);
        }
        return res;

    }



}
