// User function Template for Java

class Solution {
    static String jumpingGeek(int N) {
        // code here
        int k=N%6;
       if(k==0 || k==1 || k==3){ return "yes"; }
       return "no";
    }
};