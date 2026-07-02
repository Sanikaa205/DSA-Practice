class Solution {
    public int maxProfit(int[] prices) {
        int minprice =prices[0];
        int maxprofit=0;

       for(int i = 0 ; i< prices.length ;i++)
       {
        int price = prices[i];
        if(price < minprice)
        {
            minprice = price;
        }
        else
        {
            int profit = price - minprice ;
            if(profit >maxprofit)
            {
                maxprofit = profit ;
            }
        }
       }
       return maxprofit;
    }
}