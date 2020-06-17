class Solution {
    public void solve(char[][] board) {
        if(board.length == 1 || board.length == 0) return;
        
        if(board[0].length == 1 || board[0].length == 0) return;
        
        int i, j;
        for(i = 0; i < board.length; i++){
            for(j = 0; j < board[i].length; j++){
                 if((i == 0 || j == 0 || i == board.length-1 || j == board[i].length-1) && (board[i][j] == 'O'))
                 {
                     dfs(board, i, j);
                 }
            }
        }
        
        i = 0;
        j = 0;
        for(i = 0; i < board.length; i++)
            for(j = 0; j < board[i].length; j++)
                if(board[i][j] == 'O') board[i][j] = 'X';                
                
                else if(board[i][j] == '1') board[i][j] = 'O';
    }
    private void dfs(char b[][], int i, int j){
        if(i < 0 || j < 0 || i > b.length-1 || j > b[0].length-1) return;
        
        if(b[i][j] == 'O'){
            b[i][j] = '1';
            dfs(b, i-1, j);
            dfs(b, i+1, j);
            dfs(b, i, j-1);
            dfs(b, i, j+1);
        }
    }
}
/*
Technique       : Depth First Traversal
Time complexity : O(N*M)
Space complexity: O(1)
Useful link     : https://www.youtube.com/watch?v=FoVhnqN0B28
*/
