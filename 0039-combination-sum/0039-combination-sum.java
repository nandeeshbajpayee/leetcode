class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combination(candidates,target,0);
        return res; 
    }
    List<Integer> list=new ArrayList<>();
    public void combination(int[] candidates, int target,int i) {
        if(target==0) {
            res.add(new ArrayList<>(list));
            return ; 
        }
        else if(target<0){
            list.remove(list.size()-1);
            return ;
        }
        while(i<candidates.length){
            if(candidates[i]<=target){
                list.add(candidates[i]);
                combination(candidates,target-candidates[i],i);
                list.remove(list.size()-1);
            }
            i++;
        }
        return ;
    }
}