class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
        int ans=right;
        while(left<right){
            ans=right&(right-1);
            right=ans;
        }
        return ans;
    }
}