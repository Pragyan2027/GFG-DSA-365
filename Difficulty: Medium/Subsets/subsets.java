// User function Template for Java

class Solution {
    static void subSet(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list,int arr[],int start) {
        res.add(new ArrayList<>(list));
        for(int i = start;i<arr.length;i++) {
            list.add(arr[i]);
            subSet(res,list,arr,i+1);
            //BackTrack
            list.remove(list.size()-1);
        }
    }
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        subSet(res,list,arr,0);
        return res;
    }
}