class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0]; 
        int Max_profit  = 0 ; 

        for (int i = 0; i < prices.length; i++ ){ 
            if(min_price>prices[i]){
                min_price = prices[i];
            }
            if(Max_profit<prices[i]- min_price){
                Max_profit = prices[i]- min_price ; 
            }
        }
        return Max_profit; 
    }
}