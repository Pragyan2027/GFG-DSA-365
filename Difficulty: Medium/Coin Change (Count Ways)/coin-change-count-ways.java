class Solution {
        // code here.
        private int helper(int[] arr,int ind,int target,int[][] dp){
        if(ind==0)return target%arr[0]==0?1:0;
        if(dp[ind][target]!=-1)return dp[ind][target];
        int notPick=helper(arr,ind-1,target,dp);
        int pick=0;
        if(arr[ind]<=target)pick=helper(arr,ind,target-arr[ind],dp);
        return dp[ind][target]=pick+notPick;
    }
    public int count(int coins[], int sum) {
        int n=coins.length;
        int[][] dp=new int[n][sum+1];
        for(int row[]:dp)Arrays.fill(row,-1);
        return helper(coins,coins.length-1,sum,dp);
    }
}