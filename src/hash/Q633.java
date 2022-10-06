package hash;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/19 17:23
 * @Description:
 **/
public class Q633 {

    public static boolean judgeSquareSum(int c) {
        long l = 1;
        long r = (int)Math.sqrt(c);
        while(l <= r){
            long res = l*l + r*r;
            if(res > c){
                r--;
            }else if(res < c){
                l++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        judgeSquareSum(5);
    }
}
