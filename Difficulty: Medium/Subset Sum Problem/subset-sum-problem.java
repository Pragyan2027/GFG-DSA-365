class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
         boolean[][] dp = new boolean[n + 1][sum + 1];

        // Initialization: sum 0 can always be formed with empty subset
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the table in a bottom-up manner
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] > j) {
                    // Cannot include the ith element as it exceeds the sum
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Check if sum can be obtained by including or excluding the element
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
           
    }
     return dp[n][sum];
}
}