class Solution {
    int ans=0;
    public int totalNQueens(int n) {
        helper(n);
        return ans;
    }
    List<Integer> list=new ArrayList<>();
    public void helper(int n){
        if(list.size()==n){
            ans++;
            return ;
        }
        for(int i=0;i<n;i++){
            if(check(i)) list.add(i);
            else continue;
            helper(n);
            list.remove(list.size()-1);
        }
    }
    public boolean check(int i) {
        int I=i;
        for(int num: list)
            if(num==i) return false;
        int j=i;
        for(int k=list.size()-1;k>=0;k--)
            if((list.get(k)+1)==j) return false;
            else j=j-1;
        for(int k=list.size()-1;k>=0;k--)
            if((list.get(k)-1)==i) return false;
            else i=i+1;
        return true;
    }
    
}













































