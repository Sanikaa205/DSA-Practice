class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++)
        {
            int price = prices[i];
            if(min > price )
            {
                min = prices[i];
            }
            else 
            {
                int profit = price - min;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
        
    }
}

