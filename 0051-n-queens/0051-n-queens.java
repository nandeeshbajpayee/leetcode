
class Solution {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        helper(n);
        return res;
    }
    List<String> list=new ArrayList<>();
    public void helper(int n){
        if(list.size()==n){
            res.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<n;i++){
            String str=maker(i,n);
            if(check(i)) list.add(str);
            else continue;
            helper(n);
            list.remove(list.size()-1);
        }
    }
    public String maker(int i,int n){
        String str="";
        for(int j=0;j<n;j++){
            if(j==i) str+="Q";
            else str+=".";
        }
        return str;
    }
      public boolean check(int J) {
        int I = list.size();
        int i = I;
        int j = J;
        i--;
        j--;
        while (i >= 0 && j >= 0) {
            if (list.get(i).charAt(j) == 'Q')
                return false;
            i--;
            j--;
        }

        i = I;
        j = J;
        i--;
        while (i >= 0) {
            if (list.get(i).charAt(j) == 'Q')
                return false;
            i--;
        }

        i = I;
        j = J;
        i--;
        j++;
        while (i >= 0 && j < list.get(i).length()) {
            if (list.get(i).charAt(j) == 'Q')
                return false;
            i--;
            j++;
        }
        return true;
    }
}
