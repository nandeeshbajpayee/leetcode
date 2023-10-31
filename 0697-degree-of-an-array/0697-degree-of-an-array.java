class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int maxfrequency=0;
        int minlength=nums.length;
        Map<Integer,Integer> leftIndex= new HashMap<>();
        Map<Integer,Integer> rightIndex = new HashMap<>();
        Map<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!leftIndex.containsKey(nums[i])) {
                leftIndex.put(nums[i],i);
            }
            rightIndex.put(nums[i],i);
            count.put(nums[i],count.getOrDefault(nums[i], 0)+1);
            maxfrequency=Math.max(maxfrequency,count.get(nums[i]));
            
        }
        for(int num:count.keySet()){
            if(count.get(num)==maxfrequency){
                minlength=Math.min(minlength,rightIndex.get(num)-leftIndex.get(num)+1);
            }
        }
        return minlength;
    }
}