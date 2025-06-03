// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        boolean  hash[] = new boolean[256];
        StringBuilder result = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(!hash[ch])
            {
                hash[ch]=true;
                result.append(ch);
            }
        }
        return result.toString();
    }
}