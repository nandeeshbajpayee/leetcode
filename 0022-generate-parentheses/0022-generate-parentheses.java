class Solution {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
    generate(n,"(",1,0);
        return res;
    }
    public void generate(int n,String str,int open,int close) {
        if(str.length()==2*n){
            res.add(str);
            return ;
        }
        if(open<n) generate(n,str+"(",open+1,close);
        if(close<open) generate(n,str+")",open,close+1);
    }
}