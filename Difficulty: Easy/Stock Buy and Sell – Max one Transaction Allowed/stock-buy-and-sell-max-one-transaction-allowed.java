// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
         int n = prices.length; 
        int maxProfit = 0;
        int low = prices[0];
        for(int i=0 ; i< n-1 ; i++) {
            if(low < prices[i+1]) {
                int sub = prices[i+1] - low;
                maxProfit = Math.max(maxProfit,sub);
            } else {
                low = prices[i+1];
            }
        }
        return maxProfit;
    }
}