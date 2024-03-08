class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=-1;
        int maxfreq=-1;
        for(int n : map.values()){
            if(n>maxfreq) {
                maxfreq=n;
                ans=maxfreq;
            }
            else if(n==maxfreq){
                ans+=maxfreq;
            } 
        }
        return ans;
    }
}