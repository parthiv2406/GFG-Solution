// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int num =n , rem;
        int count =0;
        while(num>0){
            rem = num%10;
            if(rem !=0 && n % rem ==0){
                count++;
            }
            num = num/10;
        }
        return count;
    }
}