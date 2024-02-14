class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] temp=new int[nums.length];
        int i=0;
        int j=nums.length/2;
        for(int num : nums){
            if(num<0) temp[j++]=num;
            else temp[i++]=num;
        }
        int k=0;
        i=0;
        j=nums.length/2;
        boolean flag=false;
        while(k<nums.length){
            if(flag){
                nums[k++]=temp[j++];
                flag=false;
            }else{
                nums[k++]=temp[i++];
                flag=true;
            }
        }
        return nums;
    }
}