class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                arr.add(i);
                while(n%i==0){
                    n = n/i;
                }
            }
        }
        if(n!=1) arr.add(n);
        return arr;
    }
}