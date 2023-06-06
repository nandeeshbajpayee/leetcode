class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combination(candidates,target,0);
        return res;
    }
    List<Integer> list =new ArrayList<>();
    public void combination(int[] candidates, int target,int i) {
        if(target==0){
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
                combination(candidates,target-candidates[i],i+1);
                list.remove(list.size()-1);
            }
            while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) i++;
            
            i++;
        }
        return ;
    }
}
