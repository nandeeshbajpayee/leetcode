class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder(number);
        
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == digit && i+1 < sb.length() && digit < sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                return sb.toString();
            }
        }
        
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == digit) {
                sb.deleteCharAt(i);
                return sb.toString();
            }
        }
        
        return sb.toString();
    }
}
