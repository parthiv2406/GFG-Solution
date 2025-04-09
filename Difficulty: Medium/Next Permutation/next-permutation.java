//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    static void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        // find the pivot element
        int pivot =-1;
        for(int i=n-2; i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        // if no pivot element found then reverse the whole array
        if(pivot ==-1){
            reverse(arr,0,n-1);
        }
       else{ 
           // find the right most element greater than pivot
            for(int i=n-1; i>=0; i--){
                if(arr[i]>arr[pivot]){
                    swap(arr,i,pivot);
                    break;
                }
            }
            // reverse after pivot element
            reverse(arr,pivot+1,n-1);
       }
    }
    //reverse
    public static void reverse(int arr[],int start,int end){
            while(start<end){
                swap(arr,start++,end--);
            }
        }
        //swaping method
    public static void swap(int arr[], int i,int j){
            int temp=arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
        }
}


//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends