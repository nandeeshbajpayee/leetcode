class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        return helper(arr,k,0,dp);
    }
    private int helper(int[] arr, int k,int index,int[] dp) {
        int n=arr.length;
        if(n==index) return 0;
        if(dp[index]!=-1) return dp[index];
        int len=0;
        int max=Integer.MIN_VALUE;
        int ans=Integer.MIN_VALUE;
        for(int i=index;i<Math.min(n,index+k);i++){
            len++;
            max=Math.max(max,arr[i]);
            int sum=max*len+helper(arr,k,i+1,dp);
            ans=Math.max(ans,sum);
        }
        return dp[index]=ans;
    }
}