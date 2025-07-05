// User function Template for Java

class Solution {

    public ArrayList<String> generateParentheses(int n) {
        // code here
         ArrayList<String> result = new ArrayList<>();
         if(n % 2 != 0) return result;
         int pair = n / 2;
        generate(0,0,pair,"",result);
        return result;
    }
    private void generate(int open , int close , int n , String current ,ArrayList<String>result ){
        if(current.length() == n  *2){
            result.add(current);
            return;
        }
        if(open < n){
            generate(open+1 , close , n , current +'(' , result);
        }
        if(close < open){
            generate(open , close +1 , n , current +')' , result);
        }
}
}