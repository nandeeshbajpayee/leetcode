class Solution {
    public boolean repeatedSubstringPattern(String s) {
       int l=s.length();
        for(int n=l/2;n>=1;n--){
            if(l%n==0){
             String str=s.substring(0,n);
             StringBuilder sb=new StringBuilder();
             int times=l/n;   
                while(times-->0){
                    sb.append(str);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
    
}