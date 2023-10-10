class Solution {
    public int maximumJumps(int[] nums, int target) {
       int[] arr = new int[nums.length];
       Arrays.fill(arr,-1);
        arr[0]=0;
        for(int i=0;i<nums.length;i++){
            if(arr[i]==-1) continue;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]<=target && nums[j]-nums[i]>=(-1*target)){
                    arr[j]=Math.max(arr[j],arr[i]+1);
                }
            }
        }
        return arr[nums.length-1];
    }
}