class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
         int n = arr.length;
        if(n==0) return 0;

        int longest = 1;
        Set<Integer> st = new HashSet<>();

        for(int i = 0 ; i < n ; i++){
            st.add(arr[i]);
        }
        for(int j : st){
            if(!st.contains(j-1)){
                int count = 1 ;
                int x = j;

                while(st.contains(x+1)){
                    x = x+1;
                    count = count + 1;
                }
                longest = Math.max(longest , count);
            }
        }
        return longest;
    }
}