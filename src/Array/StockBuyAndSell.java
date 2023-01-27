package Array;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int pric[]={1,5,3,8,8,12,14,2};
        int start=0;
        int end= pric.length-1;
        System.out.println(maxProfit(pric,start,end));
        System.out.println(max_profit(pric));

    }

    //O(n^2)
    static int maxProfit(int price[],int start,int end){
        if(end<=start){
            return 0;
        }
        int profit=0;
        for (int i = start; i <end ; i++) {
            for (int j = i+1; j <= end; j++) {
                if (price[j]>price[i]){
                    int curr_profit=
                            price[j]-price[i]+
                            maxProfit(price,start,i-1)
                            +maxProfit(price,j+1,end);
                    profit=Math.max(profit,curr_profit);
                }

            }
            
        }
        return profit;
    }


    static int max_profit(int price[]){
        int max_profit=0;
        for (int i = 1; i < price.length; i++) {
            if(price[i]>price[i-1]){
                max_profit += price[i]-price[i-1];
            }
        }
        return max_profit;
    }

}
