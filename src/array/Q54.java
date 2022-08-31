package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/12 10:32
 * @Description:
 **/
public class Q54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // 确定几层
        int count = (Math.min(matrix.length, matrix[0].length)+1)/2;
        List<Integer> list = new ArrayList<>(matrix.length * matrix[0].length);
        for (int i = 0; i < count; i++) {
            //从左到右
            for(int j = i;j < n-i ;j++){
                list.add(matrix[i][j]);
            }
            // 从上到下
            for(int j = i+1;j < m - i ;j++){
                list.add(matrix[j][n-i-1]);
            }
            //从右到左
            for(int j = n-i-2;j>=i && (2*i+1 != m);j--){
                list.add(matrix[m-i-1][j]);
            }
            //从下到上
            for(int j = m -i -2; j>i && (2 * i + 1 != n);j--){
                list.add(matrix[j][i]);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        new Q54().spiralOrder(matrix);
    }
}
