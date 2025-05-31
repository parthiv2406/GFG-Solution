class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int j=1;
        for(int i=0 ; i<n ; i++){
            if(arr[i]!=j){
                return j;
            }
            else j++;
        }
        return j;
    }
}