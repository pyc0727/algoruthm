package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/12 11:27
 * @Description:
 **/
public class Q59 {
    public int[][] generateMatrix(int n) {
        int top = 0,left = 0, right = n-1,down = n-1;
        int k = 1;
        int[][] res = new int[n][n];
        while(k <= n*n){
            for (int i = left; i<=right;i++,k++){
                res[top][i] = k;
            }
            top++;
            for(int i = top; i<=down; i++,k++){
                res[i][right] = k;
            }
            right--;
            for(int i = right; i>=left; i--,k++){
                res[down][i] = k;
            }
            down--;
            for(int i =down; i>= top;i--,k++){
                res[i][left] = k;
            }
            left++;
        }
        return res;
    }
}
