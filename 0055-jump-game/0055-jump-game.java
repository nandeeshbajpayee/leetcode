class Solution {
    public boolean canJump(int[] nums) {
        int maxpos=0;
        for(int i=0; i<nums.length; i++){
            maxpos=Math.max(i+nums[i],maxpos);
            if(maxpos==i && i!=nums.length-1) return false;
        }
        return maxpos>=nums.length-1;
    }
}
