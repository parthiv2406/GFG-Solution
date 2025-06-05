class Solution {
      public static int minJumps(int[] arr) {
        int n = arr.length;
        
        // If array has only one element
        if (n <= 1) return 0;

        // If first element is 0, can't move anywhere
        if (arr[0] == 0) return -1;

        int maxReach = arr[0]; // The maximum index we can currently reach
        int steps = arr[0];    // Steps we can still take
        int jumps = 1;         // Number of jumps we have made

        for (int i = 1; i < n; i++) {
            // If we have reached the end of the array
            if (i == n - 1) return jumps;

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            // If no more steps left
            if (steps == 0) {
                jumps++; // Must do another jump

                // Check if current index is beyond maxReach
                if (i >= maxReach) return -1;

                // Reset steps for the next jump
                steps = maxReach - i;
            }
        }

        return -1; // If end is never reached
    }
}