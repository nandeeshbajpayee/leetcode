class Solution {
    public boolean validPalindrome(String s) {
      int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome( i + 1, j,s) || isPalindrome( i, j - 1,s);
            }
            i++;
            j--;
        }
        return true;
    }
    private boolean isPalindrome(int start, int end,String str){
        while(start<end){
            if(str.charAt(start++)!=str.charAt(end--)) return false;
        }
        return true;
    }
}
