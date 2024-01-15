class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmostsumofsubarray(nums,goal) -atmostsumofsubarray(nums,goal-1);
    }
    private int atmostsumofsubarray(int[] nums, int goal) {
        int i=0,ans=0,sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>goal && i<=j){
                sum-=nums[i];
                i++;
            }
            ans+=(j-i+1);
        }
        return ans;
    }
}