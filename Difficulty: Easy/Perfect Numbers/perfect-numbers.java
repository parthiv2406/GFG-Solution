class Solution {
    static boolean isPerfect(int n) {
        // code here
        int num =n;
        int res =1;
        
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                
                res = res +i+(n/i);
            }
        }
        if(n==res) return true;
        return false;
    }
};