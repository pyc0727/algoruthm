package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/22 11:10
 * @Description:
 **/
public class Q289 {
    int m,n;
    int[][] rounds = new int[][]{{-1,0},{-1,1},{-1,-1},{0,1},{0,-1},{1,1},{1,0},{1,-1}};
    public void gameOfLife(int[][] board) {
        int m = board.length,n = board[0].length;
        this.m = m;this.n = n;
        //备注细胞周围情况
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                change(board[i][j],i,j,board);
            }
        }
        for(int i = 0;i < m;i ++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] % 10 == 1){
                    if(board[i][j] / 10 == 2 || board[i][j]/10 == 3){
                        board[i][j] = 1;
                    }else{
                        board[i][j] = 0;
                    }
                }else {
                    if(board[i][j] / 10 ==3){
                        board[i][j] = 1;
                    }else {
                        board[i][j] = 0;
                    }
                }

            }
        }

    }

    private void change(int num, int i,int j,int[][] board){
        if(num%10 == 0) return;
        for (int i1 = 0; i1 < rounds.length; i1++) {
            int l = i + rounds[i1][0];
            int r = j + rounds[i1][1];
            if(l<0 || l>=m || r<0 || r>=n) continue;
            board[l][r] += 10;
        }
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        new Q289().gameOfLife(test);
    }
}
