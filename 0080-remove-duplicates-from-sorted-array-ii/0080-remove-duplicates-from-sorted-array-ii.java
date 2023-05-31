class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int j = 1; // index to track the new length of the modified array

        if (nums.length <= 2) return nums.length;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++; // increment the count for consecutive duplicates
            } else {
                count = 1; // reset the count for a new number
            }

            if (count <= 2) {
                nums[j] = nums[i]; // overwrite the element at index j with the current number
                j++; // increment the index j
            }
        }

        return j; // return the new length of the modified array
    }
}
