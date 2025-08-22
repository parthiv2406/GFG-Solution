class Solution {
    static boolean isPrime(int num){
        if(num<=3) return true;
        if(num%2==0 || num %3==0) return false;
        for(int i=5 ; i*i<=num; i+=6){
            if(num%i==0 || num%(i+2)==0)return false;
        }
        return true;
    }
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2; i<=n ; i++){
            if(isPrime(i)==true){
                if(n%i==0){
                    arr.add(i);
                }
            }
        }
        return arr;
    }
}