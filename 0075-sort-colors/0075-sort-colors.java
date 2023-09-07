class Solution {
    public void sortColors(int[] nums) {
        int s=0;
        int l=nums.length-1;
        int m=0;
        while(m<=l){
            if(nums[m]==0){
                swap(nums,m,s);
                m++;
                s++;
            }
            else if(nums[m]==1){
                m++;
            }
            else {
                swap(nums,m,l);
                l--;
            }
        }
    }
    public void swap(int[] nums,int x,int y) {
        int temp=nums[y];
        nums[y]=nums[x];
        nums[x]=temp;
    }
}