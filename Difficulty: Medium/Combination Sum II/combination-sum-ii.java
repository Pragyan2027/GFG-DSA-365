// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    static ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // add your code here
        Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>>result = new ArrayList<>();
        find(0 , arr , target , new ArrayList<>() , result);
        return result;
    }
    static void find(int index , int[]arr , int target , ArrayList<Integer>count ,ArrayList<ArrayList<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(count));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]){
                continue;
            }
            
            if(arr[i] > target){
                break;
            }else{
                count.add(arr[i]);
                find(i+1 , arr , target - arr[i] , count , result);
                count.remove(count.size() - 1);
            }
        }
    }
}