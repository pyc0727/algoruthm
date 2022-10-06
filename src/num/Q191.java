package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 16:09
 * @Description:
 **/
public class Q191 {
    public int hammingWeight(int n) {

        int res = 0;
        while (n != 0){
            res ++;
            n &= n-1;
        }
        return res;
    }
}
