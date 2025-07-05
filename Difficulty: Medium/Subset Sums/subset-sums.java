// User function Template for Java//User function Template for Java
class Solution {
    private void solve(int index , int sum , int[] arr , ArrayList<Integer>ans){
        if(index == arr.length){
            ans.add(sum);
            return ;
        }
        solve(index + 1 , sum + arr[index] , arr , ans);
        solve(index + 1 , sum , arr , ans);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        solve(0 , 0 , arr , ans);
        return ans;
    }
}