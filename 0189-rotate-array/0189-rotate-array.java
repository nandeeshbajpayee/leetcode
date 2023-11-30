class Solution {
    public void rotate(int[] nums, int k) {
        int size=nums.length;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[(i+k)%size]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}