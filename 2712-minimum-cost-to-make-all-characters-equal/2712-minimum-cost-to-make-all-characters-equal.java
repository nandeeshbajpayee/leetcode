class Solution {
    public long minimumCost(String s) {
        long cost=0;
        for(int i=0;i+1<s.length();i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                cost+=Math.min(i+1,s.length()-i-1);
            }
        }
        return cost;
    }
}