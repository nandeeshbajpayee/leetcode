class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0,zerocount=0,i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0) zerocount++;
            while(zerocount>k){
                if(nums[i]==0) zerocount--;
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
        }
        return maxlen;
    }
}