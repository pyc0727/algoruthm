package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 18:04
 * @Description:
 **/
public class Q693 {
    public boolean hasAlternatingBits(int n) {
        int x = n & 1;
        for (int i = 1; 1<<i <=n; i++) {
            if(((n >> i) ^ x) != 1){
                return false;
            }
            x = n>>i;
        }
        return true;

    }
}
