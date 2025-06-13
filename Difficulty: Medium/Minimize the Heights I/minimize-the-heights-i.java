// User function Template for Java
class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        
        if(n == 0 || n == 1) return 0;
        
        int ans = arr[n-1] -arr[0];
        int smallest = arr[0] + k ;
        int largest = arr[n-1] - k;
        
        for(int i = 0 ; i< n-1 ; i++){
            int min = Math.min(smallest , arr[i+1] -k);
            int max = Math.max(largest , arr[i] + k);
            
            ans = Math.min(ans , max - min);
        }
        return ans;
    }
}