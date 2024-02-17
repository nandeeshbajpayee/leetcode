class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int i=0,diff=0;
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(i=0;i<heights.length-1;i++){
            diff=heights[i+1]-heights[i];
            if(diff<0) continue;
            
            bricks-=diff;
            pq.offer(diff);
            if(bricks<0){
                bricks+=pq.poll();
                ladders--;
            }
            if(ladders<0) break;
            
        }
        return i;
    }
}