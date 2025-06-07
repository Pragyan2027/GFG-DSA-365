// User function Template for Java

class Solution {
    public long minValue(List<Integer> arr1, List<Integer> arr2) {
        // code here
        int n=arr1.size();
        int m=arr2.size();
        Collections.sort(arr1);
       Collections.sort(arr2, Collections.reverseOrder()); 
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=(arr1.get(i)*arr2.get(i));
        }
        return sum;
        
    }
}