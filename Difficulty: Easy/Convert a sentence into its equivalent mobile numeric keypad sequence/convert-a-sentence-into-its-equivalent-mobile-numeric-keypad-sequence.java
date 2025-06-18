// User function Template for Java
class Solution {
    String printSequence(String S) {
        // code here
        StringBuilder ans=new StringBuilder();
        int currnum=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)>='A' && S.charAt(i)<='O'){
                int currnum1=2+(S.charAt(i)-'A')/3;
                int freq=1+(S.charAt(i)-'A')%3;
                for(int j=0;j<freq;j++){
                    ans.append(currnum1);
                }
            }
            if(S.charAt(i)>='P' && S.charAt(i)<='S'){
                currnum=7;
                int freq=(S.charAt(i)-'P')%4+1;
                for(int j=0;j<freq;j++){
                    ans.append(currnum);
                }
            }
            if(S.charAt(i)>='T' && S.charAt(i)<='V'){
                currnum=8;
                int freq=(S.charAt(i)-'T')%3+1;
                for(int j=0;j<freq;j++){
                    ans.append(currnum);
                }
            }
            if(S.charAt(i)>='W' && S.charAt(i)<='Z'){
                currnum=9;
                int freq=(S.charAt(i)-'W')%4+1;
                for(int j=0;j<freq;j++){
                    ans.append(currnum);
                }
            }
            if(S.charAt(i)==' '){
                ans.append("0");
            }
        }
        return ans.toString();
    }
}