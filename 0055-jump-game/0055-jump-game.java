class Solution {
    public boolean canJump(int[] nums) {
        int maxpos=0;
        for(int i=0; i<nums.length-1; i++){
            maxpos=Math.max(i+nums[i],maxpos);
            if(maxpos==i ) return false;
        }
        return maxpos>=nums.length-1;
    }
}
