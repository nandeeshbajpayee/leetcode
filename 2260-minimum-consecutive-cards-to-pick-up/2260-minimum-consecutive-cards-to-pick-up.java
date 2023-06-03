class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer,Integer> map=new HashMap<>();
        int minlength=Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            if(map.containsKey(cards[i])){
                int idx=map.get(cards[i]);
                if(i-idx<minlength) minlength=i-idx;
            }
            map.put(cards[i],i);
        }
        if(minlength==Integer.MAX_VALUE) return -1;
        return minlength+1;
    }
}