// User function Template for Java

class Solution {
    // Method to calculate the minimum moves to reach the nth stair
    public int moves(int n, int p, int q) {
        // Your code goes here
        int[] dp = new int[n + 1];
        Arrays.fill(dp , -1);

        dp[0] = 0;
        
        for(int i = 1 ; i <= n ; i++){
            int min = -1;
            
            if(i == p || i == q){
                min = 1;
            }else {
                if(i - p >= 0 && dp[i-p] != -1){
                    min = (min == -1) ? dp[i - p] + 1 : Math.min(min, dp[i - p] + 1);
                }
                if (i - q >= 0 && dp[i - q] != -1) {
                    min = (min == -1) ? dp[i - q] + 1 : Math.min(min, dp[i - q] + 1);
                }
            }
            dp[i] = min;
        }
        return dp[n];
    }
}