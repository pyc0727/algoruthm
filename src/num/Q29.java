package num;

import com.sun.xml.internal.bind.v2.util.EditDistance;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/8 14:43
 * @Description:
 **/
public class Q29 {
    private int ans = 0;
    public int divide(int dividend, int divisor) {
        if(divisor == 1)return dividend;
        if(dividend == Integer.MIN_VALUE){
            if(divisor == -1){
                return Integer.MAX_VALUE;
            }else if(divisor == Integer.MIN_VALUE){
                return 1;
            }
        }
        if(divisor == Integer.MIN_VALUE){
            return 0;
        }
        // flag为true为正数
        boolean flag = (dividend ^divisor)>>>31 != 1;
        int d1 = Math.abs(dividend);
        int d2 = Math.abs(divisor);
        d(d1,d2);
        return flag?ans:-ans;
    }

    public void d(int d1,int d2){
        // 递归终结条件
        if(d2 > d1)return;
        if(d2 == d1){
            ans+=1;
            return;
        }
        int i = 0;
        while(d2 << i < d1){
            i++;
        }
        ans += 1<<i-1;
        d(d1 - (d2<<(i-1)),d2);
    }

    public static void main(String[] args) {
        new Q29().divide(7,-3);
    }

}
