package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/6 16:49
 * @Description:
 **/
public class Q171 {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            ans += (columnTitle.charAt(n-1-i) - 'A' + 1) * Math.pow(26,i);
        }
        return ans;

    }
}
