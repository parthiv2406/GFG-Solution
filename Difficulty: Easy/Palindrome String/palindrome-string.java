class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuffer sb = new StringBuffer(s);
        if(s.equals(sb.reverse().toString())){
            return true;
        }
        else return false;
    }
}