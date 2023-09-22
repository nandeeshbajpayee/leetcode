class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        do{
            fast=nums[nums[fast]];
            slow=nums[slow];
        }while(slow!=fast);
        fast=0;
        while(slow!=fast){
            fast=nums[fast];
            slow=nums[slow];
        }
        return fast;
    }
}