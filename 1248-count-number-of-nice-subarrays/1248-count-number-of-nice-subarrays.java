class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[] nums, int k) {
        int i=0,ans=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==1) k--;
            while(k<0){
                if(nums[i]%2==1) k++;
                i++;
            }
            if(k>=0) ans+=j-i+1;
        }
        return ans;
    }
}