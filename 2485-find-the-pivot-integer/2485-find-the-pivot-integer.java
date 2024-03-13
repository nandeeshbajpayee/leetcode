class Solution {
    public int pivotInteger(int n) {
        int tsum=n*(n+1)/2;
        System.out.print(tsum);
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            int sum2=tsum-sum+i;
            if(sum2==sum) return i;
        }
        return -1;
    }
}