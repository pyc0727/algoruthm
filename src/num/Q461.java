package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 16:16
 * @Description:
 **/
public class Q461 {
    public int hammingDistance(int x, int y) {
        int b = x ^ y,res = 0;
        while ( b != 0){
            res ++;
            b &= b-1;
        }
        return res;
    }
}
