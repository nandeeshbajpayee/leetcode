class Solution {
    Set<List<Integer>> res=new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        permutation(nums);
        return new ArrayList<>(res);
    }
    List<Integer> check=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public void permutation(int[] nums) {
     if(nums.length==list.size()){
         res.add(new ArrayList<>(list));
         return ;
     }
        for(int i=0;i<nums.length;i++){
            if(check.contains(i)) continue;
            check.add(i);
            list.add(nums[i]);
            permutation(nums);
            list.remove(list.size()-1);
            check.remove(check.size()-1);
        }
        return ;        
    }
    
}