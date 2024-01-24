class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Arrays.fill(arr, -1);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
            else if(nums[i]+nums[j]>target) j--;
            else i++;
        }
        return arr;
    }
}