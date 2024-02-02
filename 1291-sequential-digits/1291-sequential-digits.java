class Solution {
     List<Integer> res=new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
       
        for(int i=1;i<10;i++){
            helper(i,low,high,0);
        }
        
        Collections.sort(res);
        return res;
    }
    private void helper(int index,int low,int high,int num) {
        if(num>high || index==10){
                return ;
        }
        num=num*10+index;
        if(num>=low && num<=high){
            res.add(num);
        }
        helper(index+1,low,high,num);
    }
}