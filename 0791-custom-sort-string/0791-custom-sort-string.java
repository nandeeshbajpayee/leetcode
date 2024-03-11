class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<order.length();i++){
            while(map.containsKey(order.charAt(i)) && map.get(order.charAt(i))>0) {
                sb.append(order.charAt(i));
                map.put(order.charAt(i),map.get(order.charAt(i))-1);
            }
        }
        for(char c : map.keySet()){
            while(map.get(c)>0){
                sb.append(c);
                map.put(c,map.get(c)-1);
            }
        }
        return sb.toString();        
    }
}