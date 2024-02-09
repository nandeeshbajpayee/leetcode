class Solution {
    List<Integer> res;
    int[] dp;
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        res=new ArrayList<>();
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        helper(nums,0,1,new ArrayList<>());
        return res;
    }
    private void helper(int[] nums,int index,int prev,List<Integer> curr){
        if(curr.size()>res.size()){
            res =new ArrayList<>(curr);
        }
        for(int i=index;i<nums.length;i++){
            if( dp[i]<curr.size() && nums[i]%prev==0){
                dp[i]=curr.size();
                curr.add(nums[i]);
                helper(nums,i+1,nums[i],curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}