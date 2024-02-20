class Solution {
    public int missingNumber(int[] nums) {
       int  n=nums.length;
       int sumN= n*(n+1)/2;
    System.out.println(sumN);
       int sum=0;
       for(int k: nums) sum+=k;
        
    System.out.println(sum);
       return sumN-sum; 
    }
}