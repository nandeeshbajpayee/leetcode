class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        helper(0,s,res,path);
        return  res;
    }
    private void helper(int index,String s,List<List<String>> res,List<String> path){
        if( index==s.length()){
            res.add(new ArrayList<>(path));
            return ;
        }
        for(int i=index;i<s.length();i++){
            if(palindrome(index,i,s)){
                path.add(s.substring(index,i+1));
                helper(i+1,s,res,path);
                path.remove(path.size()-1);
            }
        }
    }
    private boolean palindrome(int i,int j,String s){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }
}