package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/8 10:53
 * @Description:
 **/
public class Q357 {
    private static int[] ans = new int[8];

    static {
        ans[0] = 10;
        for (int i = 1; i < 8; i++) {
            // a为当前数位不同的值
            // 首位取值范围1-9，第二位为0-9中除第一位，即数量为9*9*8*---
            int a = 9;
            int b = 9;
            for (int j = 0; j < i-1; j++) {
                a *= b--;
            }
            ans[i] = a + ans[i-1];
        }
    }

    public int countNumbersWithUniqueDigits(int n) {
        return ans[n-1];
    }
}
