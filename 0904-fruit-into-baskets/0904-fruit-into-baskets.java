class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> basket=new HashMap<>();
        int right=0,left=0,maxfruits=0;
        
        for(right=0;right<fruits.length;right++){
            
            basket.put(fruits[right],basket.getOrDefault(fruits[right],0)+1);
            
            while(basket.size()>2){
                int count=basket.get(fruits[left]);
                if(count==1) basket.remove(fruits[left]);
                else{
                    basket.put(fruits[left],count-1);
                }
                left++;
            }
            maxfruits=Math.max(maxfruits,(right-left+1));
        }
        return maxfruits;
    }
}