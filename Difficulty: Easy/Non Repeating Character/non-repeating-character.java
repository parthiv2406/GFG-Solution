//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        int hash[] = new int[30];
        for(int i=0; i<s.length();i++){
            hash[(s.charAt(i)-'a')] +=1;
        }
        int j=0;
        while(j<s.length()){
            if((hash[s.charAt(j)-'a'])==1){
                return s.charAt(j);
            }
            j++;
        }
        return '$';
    }
}
