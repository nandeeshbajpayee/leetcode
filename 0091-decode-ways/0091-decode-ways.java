class Solution {
    int[] dp;
    public int numDecodings(String s) {
        dp=new int[s.length()];
        for(int i=0;i<s.length();i++){
            dp[i]=-1;
        }
        return dumper(s,0);
    }
    int dumper(String s,int i){
        if(i>=s.length()) return 1;
        else if(s.charAt(i)=='0') return 0;
        else if(i==s.length()-1) return 1;
        else if(dp[i]!=-1) return dp[i];
        else if(s.charAt(i)=='1' || s.charAt(i)=='2' && s.charAt(i+1)>='0' && s.charAt(i+1)<='6')
            return dp[i]=dumper(s,i+1)+dumper(s,i+2);
        else return dp[i]=dumper(s,i+1);
    }
}