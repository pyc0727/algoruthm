package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/8 11:02
 * @Description:
 **/
public class Q667 {
    public int[] constructArray(int n, int k) {
        int m = n - k;
        int[] ans = new int[n];
        for (int i = 0; i < m; i++) {
            ans[i] = i+1;
        }
        for (int i = m,a = m,b = n;i<n  ; ) {
            ans[i++] = b--;
            if(i<n)
            ans[i++] = a++;
        }
        return ans;

    }

}
