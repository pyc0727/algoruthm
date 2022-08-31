package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/12 17:01
 * @Description:
 **/
public class Q498 {

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length,n = mat[0].length;
        int[] res = new int[m*n];
        int addr = 0;
        boolean flag = true;
        for (int sum = 0; sum < m+n-2; sum++) {
            if(flag){
                for (int i = Math.min(sum,m - 1); i >=Math.max(0,sum-n+1); i--) {
                    res[addr++] = mat[i][sum-i];
                }
            }else{
                for(int i = Math.max(0,sum-n+1); i <= Math.max(m-1,sum);i++) {
                    res[addr++] = mat[i][sum - i];
                }
            }
            flag = !flag;
        }
            return res;
    }
}
