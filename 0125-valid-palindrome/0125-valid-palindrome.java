class Solution {
    public boolean isPalindrome(String s) {
        String str =s.toLowerCase();
        
        StringBuilder sb= new StringBuilder();
        
        for(char c : str.toCharArray()){
            if(c>='a' && c<='z' || c>='0' && c<='9')
            sb.append(c);
        }
        
        return check(sb.toString());
    }
    private boolean check(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)) return false;
        }
        return true;
    }
}