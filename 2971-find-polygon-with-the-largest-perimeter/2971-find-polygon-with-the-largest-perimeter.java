class Solution {
    public long largestPerimeter(int[] nums) {
        long ans=-1;
        long sum=0;
        Arrays.sort(nums);
        sum=nums[0]+nums[1];
        for(int i=2;i<nums.length;i++){
            if(sum>nums[i]){
                ans=sum+nums[i];
            }
            sum+=nums[i];
        }
        return ans;
    }
}