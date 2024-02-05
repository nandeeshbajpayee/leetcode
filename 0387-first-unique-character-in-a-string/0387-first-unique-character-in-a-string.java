class Solution {
    public int firstUniqChar(String s) {
        int ans=-1;
        
        Map<Character,Integer> map=new HashMap<>();
        
        for(int i=s.length()-1;i>=0;i--){
          if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),i);
        }
        
        
        for(int i=0;i<s.length();i++){
            int index=map.get(s.charAt(i));
            if(index==i) return i;
             map.put(s.charAt(i),i);
        }
        return ans;
    }
}