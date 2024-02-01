import java.util.*;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;

        // Sort a copy of the array
        int[] sortedNums = Arrays.copyOf(nums, n);
        Arrays.sort(sortedNums);

        List<int[]> result = new ArrayList<>();
        int ptr = 0;

        while (ptr < n) {
            if ((sortedNums[ptr + 2] - sortedNums[ptr]) <= k) {
                int[] arr = new int[]{sortedNums[ptr], sortedNums[ptr + 1], sortedNums[ptr + 2]};
                result.add(arr);
                ptr += 3;
            } else {
                // If it's not possible to create a valid partition, return an empty array
                return new int[0][0];
            }
        }

        // Convert List to 2D array
        return result.toArray(new int[result.size()][]);
    }
}
