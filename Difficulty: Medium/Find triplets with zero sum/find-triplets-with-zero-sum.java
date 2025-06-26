/*Complete the function below*/

class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
         HashSet<Integer> set = new HashSet<>();
        int target = 0;
        
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(set.contains(target - (arr[i] + arr[j]))) {
                    return true;
                }
            }
            set.add(arr[i]);
        }
        return false;
    }
}