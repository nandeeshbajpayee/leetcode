class Solution {
    public String firstPalindrome(String[] words) {
        for(String str : words){
            if(ispalindrome(str)) return str;
        }
        return "";
    }
    private boolean ispalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)) return false;
        }
        return true;
    }
}