class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<a.length; i++) {
            set.add(a[i]);
        }
        
        int count = 0;
        
        for(int i=0; i<b.length; i++) {
            if(set.contains(b[i])) {
                count++;
                set.remove(b[i]);
            }
        }
        
        return count;
    }
}