class Solution {
    Set<List<Integer>> res= new HashSet<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res.add(new ArrayList<>());
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
             Set<List<Integer>> temp= new HashSet<>();
            for(List<Integer> list : res ){
                List<Integer> newlist = new ArrayList<>(list);
                newlist.add(nums[i]);
                temp.add(newlist);
            }
            res.addAll(temp);
        }
        return new ArrayList<>(res);
    }
}