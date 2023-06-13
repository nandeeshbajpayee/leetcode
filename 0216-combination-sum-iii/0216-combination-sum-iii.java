class Solution {
    List<List<Integer>> res=new ArrayList();
    List<Integer> list=new ArrayList();
    public List<List<Integer>> combinationSum3(int k, int n) {
        combination(k,n,1);
        return res;
    }
    void combination(int k,int n,int index){
        if(list.size()==k && n==0){
            res.add(new ArrayList(list));
        }
        if (n < 0 || list.size() > k) {
            return;
        }
        
        for(int i=index;i<10;i++){
            if(i<=n) list.add(i);
            else return ;
            combination(k,n-i,i+1);
            list.remove(list.size()-1);
        }
    }
}