class Solution {
    public void sortColors(int[] nums) {
        int var0=0;
        int var1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) var0++;
            else if(nums[i]==1) var1++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<var0) nums[i]=0;
            else if(i<var0+var1) nums[i]=1;
            else nums[i]=2;
        }
    }
}