package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/8 16:09
 * @Description:
 **/
public class Q50 {
    public double myPow(double x, int n) {
        if(n == 0)return 1;
        double res = 1;
        boolean flag = n>0;
        for (int i = 0; i < Math.abs(n); i++) {
            res *= x;
        }
        return flag?res:1/res;
    }
}
