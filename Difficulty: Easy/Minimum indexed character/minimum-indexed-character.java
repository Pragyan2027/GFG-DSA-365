// User function template for JAVA

class Solution {
    // Function to find the minimum indexed character.
    public static int minIndexChar(String s1, String s2) {
        // Your code here
         Set<Character> charsInS2 = new HashSet<>();      
        for (int i = 0; i < s2.length(); i++) {
            charsInS2.add(s2.charAt(i));
        }  
        for (int i = 0; i < s1.length(); i++) {
            if (charsInS2.contains(s1.charAt(i))) {
                return i;  
            }
        }        
        return -1;
    }
}