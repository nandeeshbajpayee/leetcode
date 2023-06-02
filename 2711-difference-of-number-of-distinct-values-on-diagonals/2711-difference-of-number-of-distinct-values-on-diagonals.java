class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int[][] arr=new int[grid.length][grid[0].length];
       
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int a=before(i,j,grid);
                int b=after(i,j,grid);
                int c=Math.abs(a-b);
                arr[i][j]=c;
            }
        }
        return arr;
    }
    public int before(int x,int y,int[][] grid){
        x--;y--;
        Set<Integer> set= new HashSet<>();
        while(x>=0 && y>=0){
            set.add(grid[x][y]);
            x--; y--;
        }
        return set.size();
    }
    public int after(int x,int y,int[][] grid){
        x++;y++;
        Set<Integer> set= new HashSet<>();
        while(x<grid.length && y<grid[0].length){
            set.add(grid[x][y]);
            x++; y++;
        }
        return set.size();
    }
}