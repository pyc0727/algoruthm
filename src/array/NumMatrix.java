package array;

import java.util.Arrays;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/4 16:49
 * @Description:
 **/
public class NumMatrix {
    private int[][] ans;
    public NumMatrix(int[][] matrix) {
        ans = new int[matrix.length+1][matrix[0].length+1];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[i+1][j+1] = ans[i][j+1] + ans[i+1][j] + matrix[i][j] - ans[i][j];
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return ans[row2+1][col2+1] - ans[row1+1][col2] - ans[row2+1][col1] + ans[col1][row1];
    }

    public static void main(String[] args) {
        int[][] testArray = new int[][]{{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        NumMatrix numMatrix = new NumMatrix(testArray);
        System.out.println(numMatrix.sumRegion(2,1,4,3));
        System.out.println(numMatrix.sumRegion(1,1,2,2));
    }
}
