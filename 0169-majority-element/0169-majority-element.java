class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        
        int count=1;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(prev==nums[i]){
                count++;
            }
            else{
                if(count>(nums.length)/2) return prev;
                prev=nums[i];
                count=1;
            }
            
        }
        if(count>nums.length/2) return prev;
        return prev;
    }
}