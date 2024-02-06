class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chararr1=s.toCharArray();
        char[] chararr2=t.toCharArray();
        
        Arrays.sort(chararr1);
        Arrays.sort(chararr2);
        
        return Arrays.equals(chararr1,chararr2);
        
    }
}