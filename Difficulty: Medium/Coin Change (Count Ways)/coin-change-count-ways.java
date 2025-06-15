

class Solution {
    public int help(int ind, int[] coins, int sum, int[][] dp) {
        if (sum == 0) return 1; // Found a valid combination
        if (ind == coins.length) return 0; // No coins left or sum not achieved
        
        if (dp[ind][sum] != -1) return dp[ind][sum]; // Return already computed state
        
        int choose = 0;
        if (sum >= coins[ind]) {
            choose = help(ind, coins, sum - coins[ind], dp);
        }
        int notChoose = help(ind + 1, coins, sum, dp);
        
        dp[ind][sum] = choose + notChoose;
        return dp[ind][sum];
    }
    
    public int count(int[] coins, int sum) {
        Arrays.sort(coins);
        int n = coins.length;
        int[][] dp = new int[n][sum + 1]; // Initialize DP array
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return help(0, coins, sum, dp);
    }
}