class Solution {
    public char findTheDifference(String s, String t) {
        int ans = 0;
        for (char a : s.toCharArray()) {
            ans ^= a;
        }
        for (char a : t.toCharArray()) {
            ans ^= a;
        }
        return (char) ans;
    }
}
