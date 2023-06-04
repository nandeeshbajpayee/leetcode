class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int ptr1=i+1,ptr2=nums.length-1;
            while(ptr1<ptr2){
                int qua=nums[i]+nums[ptr1]+nums[ptr2];
                if(Math.abs(qua - target) < Math.abs(sum - target)) sum=qua;
                if(qua<target) ptr1++;
                else if(qua>target) ptr2--;
                else return qua;
            }
        }
        return sum;
    }
}