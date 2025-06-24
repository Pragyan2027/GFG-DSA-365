class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
        // Your code here
        for(int i=0; i<txt.length();i++){
            int v = i;
            for(int y=0;y<pat.length();y++){
                if(v < txt.length() && txt.charAt(v) == pat.charAt(y)){
                   v++; 
                }else{
                    break;
                }
                if(y == pat.length() - 1){
                   return i;
                } 
            }
        }
        return -1;
    }
}