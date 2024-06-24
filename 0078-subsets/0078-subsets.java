class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        for(int len=0;len<=nums.length;len++){
            helper(0,len,nums,new ArrayList<Integer>());
        }
        return res;
    }
    public void helper(int idx,int len,int[] nums,List<Integer> list){
        if(len==list.size()){
            res.add(new ArrayList<>(list));
            return ;
        }
        for(int i=idx;i<nums.length;i++){
            list.add(nums[i]);
            helper( i+1,len,nums,list);
            list.remove(list.size()-1);
        }
    }
}