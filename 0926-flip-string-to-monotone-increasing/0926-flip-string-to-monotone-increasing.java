class Solution {
    public int minFlipsMonoIncr(String s) {
        int countflip=0,countone=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='1') countone++;
           else if(countone>0) countflip++;
           if(countflip>countone) countflip=countone; 
        }
        return countflip;
    }
}