class Solution {
    static int factorial(int n) {
        // code here
        int res = 1;
        for(int i=2; i<=n; i++){
            res = res * i;
        }
        return res;
    }
}