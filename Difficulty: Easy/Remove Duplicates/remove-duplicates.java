// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
         Set<Character> set = new LinkedHashSet<>();
        for(char c:s.toCharArray())
        {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c:set)
        {
            sb.append(c);
        }
        
        return sb.toString();
    }
}