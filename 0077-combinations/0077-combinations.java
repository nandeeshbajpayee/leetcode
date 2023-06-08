class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        com(n,k,1);
        return res;  
    }
    List<Integer> list=new ArrayList<>();
    public void com(int n, int k,int i) {
      if(list.size()==k){
          res.add(new ArrayList<>(list));
          return ;
      }
        while(i<=n){
            list.add(i);
            com(n,k,i+1);
            list.remove(list.size()-1);
            i++;
        }
        
    }
}