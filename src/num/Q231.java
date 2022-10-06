package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 14:59
 * @Description:
 **/
public class Q231 {
    public boolean isPowerOfTwo(int n) {
       if(n <= 0)return false;
       while(n != 0){
           if(n % 2 != 0)return false;
           n  /= 2;
       }
       return true;
    }

    //牛逼证法
    public boolean isPowerOfTwo1(int n) {
        return n>0 && ((n&(n-1)) == 0);
    }
}
