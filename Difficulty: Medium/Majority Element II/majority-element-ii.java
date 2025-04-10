//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n =nums.length;
        Integer ele1=null,ele2=null;
        int cnt1 =0, cnt2=0;
        List<Integer> newlist = new <Integer>ArrayList();
        
        // find two majority elements 
        for(int i=0; i<n; i++){
            
            if(ele1!=null &&    ele1 == nums[i])
                    cnt1++;
            else if(ele2 !=null && ele2==nums[i]){
                    cnt2++;
            }
            else if(cnt1==0 ){
                ele1 = nums[i];
                cnt1++;
            }
            else if(cnt2==0){
                ele2 = nums[i];
                cnt2++;
            }
           
                    
            else{
                    cnt1--;
                    cnt2--;
            }
                    
            
            
        }
        int freq1=0, freq2=0;
        // check frequency of majority elemnt
        for(int i=0; i<n; i++){
            if(nums[i]==ele1){
                freq1++;
            }
            else if(nums[i]==ele2){
                freq2++;
            }
        }
        
        // add newlist
        if(freq1>n/3){
            newlist.add(ele1);
        }
        if(freq2>n/3 && ele1!=ele2){
            newlist.add(ele2);
        }
        
        // correct position
        if(newlist.size()==2 && newlist.get(0)>newlist.get(1)){
            int temp = newlist.get(0);
            newlist.set(0,newlist.get(1));
            newlist.set(1,temp);
        }
        return newlist;
    }
}
