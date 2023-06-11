class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if((board[i][j]==word.charAt(0)) && search(board,word,i,j,0)) return true;
            }
        }
        return false;
    }
    boolean search(char[][] board, String word,int i,int j,int ptr){
        if(ptr==word.length()) return true;
        if(i==-1||j==-1||i==board.length||j==board[0].length||word.charAt(ptr)!=board[i][j]) return false;
        char temp=board[i][j];
        board[i][j]='*';
        boolean valid= search(board,word,i,j+1,ptr+1)
            ||search(board,word,i,j-1,ptr+1)
            ||search(board,word,i+1,j,ptr+1)
            ||search(board,word,i-1,j,ptr+1);
        board[i][j]=temp;
        return valid;
        
    }
}