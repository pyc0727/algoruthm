package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 15:17
 * @Description:
 **/
public class Q326 {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)return false;
        while(n != 1){
            if(n % 3 !=0)return false;
            n /= 3;
        }
        return true;
    }

    //换个思路

    public boolean isPowerOfThree1(int n){
            return n>0 && 1162261467%n == 0;
    }
}
