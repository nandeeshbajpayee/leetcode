class Solution {
    public void setZeroes(int[][] matrix) {
        int[] ari = new int[matrix.length];
        int[] arj = new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                     ari[i]=1;
                     arj[j]=1;
                    
                }   
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(ari[i]==1 || arj[j]==1) matrix[i][j]=0; 
            }
        }
    }
}