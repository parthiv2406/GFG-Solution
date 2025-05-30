class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        ArrayList <Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=i; j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag = true;
                    break;
                }
            }
           if(!flag)
            res.add(arr[i]);
            
            
        }
        return res;
        
    }
}
