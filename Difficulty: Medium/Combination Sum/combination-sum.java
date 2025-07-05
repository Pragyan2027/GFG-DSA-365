

class Solution {
    
    // Function to find all combinations that sum to target
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        Arrays.sort(arr); // Sorting helps in skipping duplicates
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        func(arr, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    // Static helper function for recursion
    public static void func(int[] arr, int index, int target, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = index; i < arr.length; i++) {
            // Skip duplicates
            if (i > index && arr[i] == arr[i - 1]) continue;
            
            if (arr[i] > target) break;
            
            temp.add(arr[i]);
            func(arr, i, target - arr[i], temp, ans);  // not i+1 because we can reuse same element
            temp.remove(temp.size() - 1); // backtrack
        }
    }
}
