class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
         int n = arr.length;

        // If k >= array size, reverse the entire array
        if (k >= n) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Reverse in groups of k
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            reverse(arr, left, right);
        }
    }

    // Helper method to reverse part of the array
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
}