class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        int e=n/3;
        Arrays.sort(nums);
        int[][] res=new int[e][3];
        int ptr=0;
        int ptr2=0;
        while(ptr2<e&& ptr<n){
            int[] arr=new int[3];
            if((nums[ptr+2]-nums[ptr])<=k){
                arr[0]=nums[ptr];
                arr[1]=nums[ptr+1];
                arr[2]=nums[ptr+2];
                res[ptr2]=arr;
            ptr+=3;
            ptr2++;
            }
            else{
                int ans[][] = new int[0][0];
                return ans;
            }
        }
    return res;    
    }
    
}