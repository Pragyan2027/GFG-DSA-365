// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
         HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        TreeSet<Character> tree = new TreeSet<>();

        for(int i=0;i<s1.length();i++){
            set1.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            set2.add(s2.charAt(i));
        }
        
        for(char ch:set1){
            if(!set2.contains(ch)){
                tree.add(ch);
            }
        }
        for(char ch:set2){
            if(!set1.contains(ch)){
                tree.add(ch);
            }
        }
        StringBuilder str = new StringBuilder();
        
        for(char ch:tree){
            str.append(ch);
        }
        return str.toString();
    }
}