// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required
    static int findPlatform(int arr[], int dep[]) {
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
        int count = 0, maxCount = 0;
        
        // Sort both arrival and departure arrays if not already sorted
        // (assuming input is sorted. If not, uncomment these)
        // Arrays.sort(arr);
        // Arrays.sort(dep);
        
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                count++;
                maxCount = Math.max(maxCount, count);
                i++;
            } else {
                count--;
                j++;
            }
        }
        return maxCount;
    }
}