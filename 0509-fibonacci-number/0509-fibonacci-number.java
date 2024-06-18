class Solution {
    public int fib(int n) {
      if(n<=1) return n;
      int prev=0;
      int curr=1;
      for(int i=2;i<=n;i++){
          int sum=curr+prev;
          prev=curr;
          curr=sum;
      } 
        return curr;
    }
}