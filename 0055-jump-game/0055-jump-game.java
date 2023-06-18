class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        boolean flag=true;
        for(int i=0;i<nums.length&&flag;i++){
            if(nums[i]==0) flag=check(nums,i-1);
        }
        return flag;  
    }
    boolean check(int[] nums,int i){
        int k=1;
        while(i>=0){
            if(nums[i]>k || nums[i]+i==nums.length-1) return true;
            k++;
            i--;
        }
        return false;
    }
}