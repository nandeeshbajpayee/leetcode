class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums){
            sum+=num;
            if(sum>maxsum) maxsum=sum;
            if(sum<0) sum=0;
        }
        return maxsum;
    }
}