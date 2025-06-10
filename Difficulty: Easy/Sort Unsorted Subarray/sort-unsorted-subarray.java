class Solution {
    public int[] printUnsorted(int[] arr) {
        // Code here
         int n = arr.length;
        int start = -1, end = -1;

        // Step 1: Find the first element out of sorting order from the left
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        // If no such element found, array is already sorted
        if (start == -1) {
            return new int[]{0, 0};
        }

        // Step 2: Find the first element out of sorting order from the right
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                end = i;
                break;
            }
        }

        // Step 3: Find min and max in the unsorted subarray
        int subMin = arr[start], subMax = arr[start];
        for (int i = start; i <= end; i++) {
            subMin = Math.min(subMin, arr[i]);
            subMax = Math.max(subMax, arr[i]);
        }

        // Step 4: Expand start to the left
        while (start > 0 && arr[start - 1] > subMin) {
            start--;
        }

        // Step 5: Expand end to the right
        while (end < n - 1 && arr[end + 1] < subMax) {
            end++;
        }

        return new int[]{start, end};
    }
}