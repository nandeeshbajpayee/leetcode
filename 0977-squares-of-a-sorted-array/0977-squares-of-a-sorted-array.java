class Solution {
    public int[] sortedSquares(int[] nums) {
     for(int i=0;i<nums.length;i++){
         nums[i]=nums[i]*nums[i];
         int n=nums[i];
         int j=i-1;
         while(j>=0 && nums[j]>n){
             nums[j+1]=nums[j];
                 j--;
         }
         j++;
         nums[j]=n;
     }
        return nums;
    }
}