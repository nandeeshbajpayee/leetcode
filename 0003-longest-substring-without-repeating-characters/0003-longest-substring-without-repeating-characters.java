class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list=new ArrayList<>();
        
        int maxans=0;
        int i=0,j=0;
        while(j<s.length()){
            
            
            while(list.contains(s.charAt(j))){
                list.remove(list.remove((Character) s.charAt(i)));
                i++;
            }
            
            list.add(s.charAt(j));
            
            maxans=Math.max(maxans,j-i+1);
            j++;
        }
        return maxans;
    }
}