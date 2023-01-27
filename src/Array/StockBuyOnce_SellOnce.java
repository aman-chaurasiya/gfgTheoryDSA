package Array;

import java.util.Arrays;

public class StockBuyOnce_SellOnce {
    public static void main(String[] args) {
            int[] price={3,1,4,8,7,2,5};

        System.out.println(maxprofit(price));

    }
    static int maxProfit(int []price){
        int max_profit=0;
        for(int i=0;i< price.length ;i++){
            for(int j=i+1;j< price.length;j++){
                max_profit=Math.max(max_profit, price[j]-price[i]);
            }
        }
        return max_profit;
    }
    static int maxProfit1(int[] price){
        int max_Profit=0;
        int[] pre=new int[price.length];
            pre[pre.length-1]=price[pre.length-1];
        for(int i=price.length-2;i>=0;i--){
            pre[i]=Math.max(pre[i+1],price[i]);
        }
        for(int i=0;i< price.length;i++){
            max_Profit=Math.max(max_Profit,pre[i]-price[i]);

        }
        return max_Profit;
    }


    static int maxprofit(int[]price){
      int  min=price[0];
        int maxProfit=0;
        for(int i=0;i< price.length ;i++){
            maxProfit=Math.max(maxProfit,price[i]-min);
            min=Math.min(min,price[i]);

        }
        return maxProfit;
    }
}
