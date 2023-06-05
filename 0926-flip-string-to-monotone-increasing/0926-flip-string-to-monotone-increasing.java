class Solution {
    public int minFlipsMonoIncr(String s) {
      int countf=0,count1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')count1++;
            else if(count1>0) countf++;
            if(count1<countf) countf=count1;
        }
        return countf;
    }
}