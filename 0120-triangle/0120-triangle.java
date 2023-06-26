class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp=new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int min=Math.min(dp[j],dp[j+1]);
                dp[j]=triangle.get(i).get(j)+min;
            }
        }
        return dp[0];
    }
}