import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int start = 0;
        int end = 0;
        int len = 0;

        // Max-heap for the maximum values
        PriorityQueue<Integer> maxque = new PriorityQueue<>(Collections.reverseOrder());
        // Min-heap for the minimum values
        PriorityQueue<Integer> minque = new PriorityQueue<>();

        while (end < nums.length) {
            maxque.offer(nums[end]);
            minque.offer(nums[end]);

            // Get the current min and max values from the heaps
            int min = minque.peek();
            int max = maxque.peek();

            // Check the difference between the max and min
            int diff = Math.abs(max - min);

            // If the difference exceeds the limit, adjust the start pointer
            while (diff > limit) {
                // Remove the start value from both heaps
                maxque.remove(nums[start]);
                minque.remove(nums[start]);
                start++;

                // Recalculate the current min and max after the removals
                min = minque.peek();
                max = maxque.peek();
                diff = Math.abs(max - min);
            }

            // Calculate the length of the current window
            len = Math.max(len, end - start + 1);
            end++;
        }

        return len;
    }
}
