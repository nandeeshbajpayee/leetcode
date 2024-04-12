class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxwater=Integer.MIN_VALUE;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            maxwater=Math.max(h*(j-i),maxwater);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxwater;
    }
}