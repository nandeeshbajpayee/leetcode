class Solution {
    public boolean isPalindrome(String s) {
        String str =s.toLowerCase();
        
        StringBuilder sb= new StringBuilder();
        
        for(char c : str.toCharArray()){
            if(c>='a' && c<='z' || c>='0' && c<='9')
            sb.append(c);
        }
        
        return check(sb);
    }
     private boolean check(StringBuilder sb) {
        int i = 0, j = sb.length() - 1;
        while (i < j) {
            if (sb.charAt(i++) != sb.charAt(j--)) return false;
        }
        return true;
    }
}