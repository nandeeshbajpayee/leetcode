class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int prev=nums[0];
        int curr=nums[0]>nums[1]?nums[0]:nums[1];
        for(int i=2;i<nums.length-1;i++){
            int temp=curr;
            curr=Math.max(prev+nums[i],curr);
            prev=temp;
        }
        if(nums.length==2) return curr;
        int ans1=curr;
        prev=nums[1];
        curr=nums[1]>nums[2]?nums[1]:nums[2];
        for(int i=3;i<nums.length;i++){
            int temp=curr;
            curr=Math.max(prev+nums[i],curr);
            prev=temp;
        }
        if(curr>ans1) return curr;
        return ans1;
    }
}