class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int ans=max;
        for(int i=1;i<nums.length;i++){
            int n=nums[i];
           int temp=Math.max(max*n,Math.max(n,min*n));
           min=Math.min(max*n,Math.min(n,min*n));
           max=temp; 
           ans=Math.max(max,ans); 
       }
        return ans;
    }
}