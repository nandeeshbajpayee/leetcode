import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<>();
        
        Map<String, ArrayList<String>> map = new HashMap<>();
        
        for(String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            if(map.containsKey(sortedStr)) {
                map.get(sortedStr).add(str);   
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr, list);
            }
        }
        for(ArrayList<String> list: map.values()) {
            res.add(list);
        }
        return res;   
    }
}
