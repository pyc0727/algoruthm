package hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/23 09:49
 * @Description:
 **/
public class Q202 {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            int ans = 0;
            set.add(n);
            while(n != 0){
                int d = n%10;
                n = n/10;
                ans += d*d;
            }
            n = ans;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        isHappy(2);
    }
}
