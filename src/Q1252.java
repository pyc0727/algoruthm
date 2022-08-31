/**
 * @Auther: buyunchuan
 * @Date: 2022/7/12 09:51
 * @Description:
 **/
public class Q1252 {

    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] column = new int[n];
        for (int[] index : indices) {
            row[index[0]]++;
            column[index[1]]++;
        }
        int rowCount = 0;
        for (int j : row) {
            if (j % 2 != 0) rowCount++;
        }
        int columnCount = 0;
        for (int j : column) {
            if (j % 2 != 0) columnCount++;
        }
        return rowCount * n + columnCount * m - rowCount * columnCount * 2;
    }
}
