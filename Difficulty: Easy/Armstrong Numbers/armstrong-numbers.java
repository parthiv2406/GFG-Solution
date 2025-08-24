// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int num = n ;
        int sum =0;
        while(num>0){
            int rem = num %10;
            sum += Math.pow(rem,3);
            num = num/10;
        }
        if(sum==n) return true;
        return false;
    }
}