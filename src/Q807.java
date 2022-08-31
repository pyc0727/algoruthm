/**
 * @Auther: buyunchuan
 * @Date: 2022/6/29 16:31
 * @Description:
 **/
public class Q807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if(grid.length == 0){
            return 0;
        }
        int max = 0;
        //
        int[] maxColumn = new int[grid[0].length];
        int[] maxRaw = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] > maxRaw[i]){
                    maxRaw[i] = grid[i][j];
                }
                if(grid[i][j] > maxColumn[j]) {
                    maxColumn[j] = grid[i][j];
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                max += Math.max(maxRaw[i],maxColumn[j]) - grid[i][j];
            }
        }
        return max;

    }
}
