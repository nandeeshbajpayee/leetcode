class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int count=1;
        if(nums.length<2) return nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
