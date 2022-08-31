package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/20 14:10
 * @Description:
 **/
public class Q73 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean rowFlag = false,colFolg = false;
        for (int i = 0; i < m; i++) {
            if(matrix[i][0] == 0){
                colFolg = true;
                break;
            }
        }
        for(int i = 0; i < n; i++){
            if(matrix[0][i] == 0){
                rowFlag = true;
                break;
            }
        }

        for(int i = 1; i<m;i++){
            for(int j = 1;j < n;j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = 1; i<m;i++){
            for(int j = 1;j < n;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(rowFlag){
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
        if(colFolg){
            for (int i = 0; i < m;   i++) {
                matrix[i][0] = 0;
            }
        }


    }
}
