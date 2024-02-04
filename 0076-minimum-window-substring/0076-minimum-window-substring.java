class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        
        int anslen=Integer.MAX_VALUE;
        String ans="";
        int i=0,j=0;
        
         while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
            }

            while (check(map) && i <= j) {
                if (j - i + 1 < anslen) {
                    ans = s.substring(i, j + 1);
                    anslen = j - i + 1;
                }

                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }

                i++;
            }

            j++;
        }
        return ans;
    }

    private static Boolean check(Map<Character, Integer> map) {
        for (int value : map.values()) {
            if (value > 0) {
                return false;
            }
        }
        return true;
    }
}