class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[n+1];
        dp[n]=0;
        for(int index=n-1;index>=0;index--){
        int len=0;
        int max=Integer.MIN_VALUE;
        int ans=Integer.MIN_VALUE;
        for(int i=index;i<Math.min(n,index+k);i++){
            len++;
            max=Math.max(max,arr[i]);
            int sum=max*len+dp[i+1];
            ans=Math.max(ans,sum);
        }
            dp[index]=ans;
        }
        return dp[0];
    }
}