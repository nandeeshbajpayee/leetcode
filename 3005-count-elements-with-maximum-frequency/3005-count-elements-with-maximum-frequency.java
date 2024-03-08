class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        int maxxi=-1;
        for(int n: arr){
            if(n>maxxi) maxxi=n;
        }
        int ans=0;
        for(int n : arr){
            if(n==maxxi) ans+=n;
        }
        return ans;
    }
}