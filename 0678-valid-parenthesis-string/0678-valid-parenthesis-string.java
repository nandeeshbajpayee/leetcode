class Solution {
    public boolean checkValidString(String s) {
        int openmin=0;
        int openmax=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                openmin++;
                openmax++;
            }
            else if(s.charAt(i)==')'){
                openmin--;
                openmax--;
            }
            else {
                openmin--;
                openmax++;
            }
            
            if(openmax<0) return false;
            if(openmin<0) openmin=0;
        }
        return openmin==0;
    }
}