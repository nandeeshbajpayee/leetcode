class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] temp=new int[nums.length];
        int i=0;
        int j=1;
        for(int num : nums){
            if(num>=0){
                temp[i]=num;
                i+=2;
            }
            else{
                temp[j]=num;
                j+=2;
            }
        }
        return temp;
    }
}