class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(maxSum<sum){
                maxSum=sum;
            }
            while(sum<0&&j<=i){
                sum=sum-nums[j];
                j++;
            }
        }
        return maxSum;
    }
}