class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        else if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int prevMax = nums[0];
        int currMax = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int temp = currMax;
            currMax = Math.max(prevMax + nums[i], currMax);
            prevMax = temp;
        }

        return currMax;
    }
}
