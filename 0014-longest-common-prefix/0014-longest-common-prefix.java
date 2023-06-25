class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        String sk=strs[0];
        for(String kk:strs){
            if(kk.length()<sk.length()) sk=kk;
        }
        for (int i = 0; i < sk.length(); i++) {
            int j = 1;
            while (j < strs.length) {
                if (strs[j - 1].charAt(i) != strs[j].charAt(i))
                    break;
                j++;
            }
            if (j == strs.length)
                res.append(strs[0].charAt(i));
            else break;
        }
        return res.toString();
    }
}
