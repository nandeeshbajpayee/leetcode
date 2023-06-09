class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]) i+=3; 
            else break;
        }
        return nums[i-1];
    }
}