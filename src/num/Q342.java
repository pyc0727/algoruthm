package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 15:09
 * @Description:
 **/
public class Q342 {
    public boolean isPowerOfFour(int n) {
        if(n <= 0)return false;
        while(n != 1){
            if(n % 4 != 0)return false;
            n  /= 4;
        }
        return true;
    }

    // 牛逼设计
    public boolean isPowerOfFour1(int n) {
        return n>0 &&(n * (n-1))== 0&& n% 3 == 1;
    }

}
