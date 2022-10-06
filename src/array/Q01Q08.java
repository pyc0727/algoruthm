package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/30 07:33
 * @Description:
 **/
public class Q01Q08 {
    public static void setZeroes(int[][] matrix) {
        boolean col = false;
        boolean row = false;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < n; i++) {
            if(matrix[0][i] == 0){
                row = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if(matrix[i][0] == 0){
                col = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            if(matrix[i][0] == 0){
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            if(matrix[0][j] == 0){
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(row) for (int i = 0; i < n; i++) {
            matrix[0][i] = 0;
        }
        if(col) for (int i = 0; i < m; i++) {
            matrix[i][0] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(test);
    }
}
