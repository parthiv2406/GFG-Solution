// User function Template for Java
class Solution {
    
    static boolean isPrime(int x){
        if(x<=1) return false;
        if(x<=3) return true;
        if(x%2==0 || x%3==0){
            return false;
        }
        for(int i=5 ; i*i<=x; i+=6){
            if(x%i==0 || x%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    static String isSumOfTwo(int n) {
        // code here
        for(int i=2; i<=n/2; i++){
            if(isPrime(i) && isPrime(n-i)){
                return "Yes";
            }
        }
        return "No";
    }
}