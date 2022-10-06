package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/7 17:23
 * @Description:
 **/
public class Q233 {
    public static int countDigitOne(int n) {
        int ans = 0;
        //l为左边的数，r为右边的数，d为现在位数
        int m = 0;
        int l = 0,r = 0,d = 1;
        // 新增x确定轮寻范围

        int x = n;
        while(d <= n){
            // 获取右边的位数
            r = x%d;
            // 获取左边的位数
            l = x/(d*10);
            // 获取当前的位数
            m = (n - x/(d*10)*(d*10))/d;

            ans += l*d + (m < 2?0:m == 1?r+1:d);

            d*= 10;

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countDigitOne(911));
    }

}
