class Solution {
    public int fib(int n) {
      if(n<=1) return n;
        int[] dp=new int[n+1];
        if(dp[n]!=0) return dp[n];
        dp[n]=fib(n-1)+fib(n-2);
        return dp[n];
    }
}