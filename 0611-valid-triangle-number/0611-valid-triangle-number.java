class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        
        
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
        int k=i-1;
        int j=0;
           while(j<k){ 
               if(nums[j]+nums[k]>nums[i]){
                count+=k-j;
                k--;
            }
            else{
                j++;
            }
            }
        }
        return count;
    }
}