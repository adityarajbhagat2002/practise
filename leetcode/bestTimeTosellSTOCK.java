class Solution {
    public int maxProfit(int[] prices) {
        int min= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i= 0;i<prices.length; i++){
            if(prices[i]<min)
                min=prices[i];
            else if(prices[i]-min > maxprofit)
                maxprofit=prices[i]-min;
            
        }
        
        return maxprofit;
        
        
    }
}