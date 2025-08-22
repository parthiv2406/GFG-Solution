class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int arr[] = new int[3];
        int  n = a*b;
        while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        arr[0] = n/a;
        arr[1] = a;
        return arr;
    }
}