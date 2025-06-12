// User function Template for Java

class Solution {
    // Function to find the days of buying and selling stock for max profit.
    int stockBuySell(int arr[]) {
        // code here
        
        int maxProfit = 0;
        for(int i = 1 ; i < arr.length ;i++){
            int cost = arr[i] - arr[i-1];
            maxProfit = Math.max(maxProfit , maxProfit + cost);
            
        }
        return maxProfit;
    }
}
