class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low = 1 ;
        int high = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] > high){
                high = arr[i];
            }
        }
        int s = 0;
        while(low <= high){
             int mid = (low+high)/2;
            
            int hours = 0;
            for(int i:arr){
                hours += (int) Math.ceil((double) i / mid);
            }
            
            if(hours <= k){
                s = mid;
                high = mid - 1;
            }else{
                
                low = mid+1;
            }
            
        }
        return s;
        }
}
