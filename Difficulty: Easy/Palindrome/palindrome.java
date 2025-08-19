class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int num = n,rem;
        int res =0;
        while(num>0){
            rem = num%10;
            res = res *10+rem;
            num = num/10;
        }
        if(res == n){
            return true;
        }
        return false;
    }
}