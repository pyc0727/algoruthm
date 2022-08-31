package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/8 12:27
 * @Description:
 **/
public class Q419 {
    public int countBattleships(char[][] board) {
        int m = board.length;int n = board[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i>0 && board[i-1][j] == 'x') continue;
                if(j>0 && board[i][j-1] == 'x')continue;
                if(board[i][j] == 'x') ans++;
            }
        }
        return ans;
    }
}
