class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> Si=new HashSet();
        Set<Integer> Sj=new HashSet();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                     Si.add(i);
                     Sj.add(j);
                }   
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(Si.contains(i) || Sj.contains(j)) matrix[i][j]=0; 
            }
        }
    }
}