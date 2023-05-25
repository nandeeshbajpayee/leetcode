class Solution {
    public int maxArea(int[] height) {
        int ptr1=0,ptr2=height.length-1;
        int maxvol=0;
        while(ptr1<ptr2){
            int h1=height[ptr1];
            int h2=height[ptr2];
            int vol=(ptr2-ptr1)*Math.min(h1,h2);
            maxvol=Math.max(vol,maxvol);
            if(h1<h2) ptr1++;
            else ptr2--;
        }
        return maxvol;
    }
}