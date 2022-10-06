package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/6 14:38
 * @Description:
 **/
public class Q828 {
    public int uniqueLetterString(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] l = new int[n];
        int[] r = new int[n];
        int[] cnts = new int[26];
        // 所有初始位置都为-1
        Arrays.fill(cnts,-1);
        for (int i = 0; i < n; i++) {
            int index = chars[i] - 'A';
            // 计算作该字母左边的数量
            l[i] = i - cnts[index];
            // 更新该字母的位置
            cnts[index] = i;
        }

        //右边所有位置都为n
        Arrays.fill(cnts,n);
        for (int i = n-1; i >= 0; i--) {
            int index = chars[i] - 'A';
            // 计算作该字母右边的数量
            r[i] = cnts[index] - i;
            // 更新该字母的位置
            cnts[index] = i;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (i-l[i])*(r[i] - i);
        }
        return ans;

    }
}
