// User function Template for Java
class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
         int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        int prefixSum = 0 , count = 0;

        map.put(0,1);
        for(int i = 0 ; i < n ; i++){
            prefixSum += arr[i];

            int sumToRemove = prefixSum - k;
            count += map.getOrDefault(sumToRemove,0);

            map.put(prefixSum , map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}