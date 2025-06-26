// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        HashMap<Integer,Integer> hash = new HashMap<>();
        
        for(int num : arr) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }
        
        for(int num : arr) {
            if(hash.get(num) == 1) return num;
        }
        
        return 0;
    }
}
