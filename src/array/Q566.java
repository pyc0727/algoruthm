package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/12 17:56
 * @Description:
 **/
public class Q566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length,n = mat[0].length;
        if ((m * n) != (r * c)) return mat;
        int r1 = 0, c1 = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(c1 == c) {
                    c1 = 0;
                    r1++;
                }
                res[r1][c1++] = mat[i][j];
            }
        }
        return res;
    }
}
