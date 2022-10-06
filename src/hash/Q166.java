package hash;

import sun.nio.cs.ext.MacHebrew;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/26 21:03
 * @Description:
 **/
public class Q166 {
    public static String fractionToDecimal(int numerator, int denominator) {
        long nl = numerator;
        long dl = denominator;
        StringBuilder sb = new StringBuilder();
        if((nl * dl<0)){
         sb.append("-");
        }
        Map<Long,Integer> map = new HashMap<>();
        long n = Math.abs(nl),d = Math.abs(dl);
        sb.append(n/d);
        if(n % d == 0){
            return sb.toString();
        }
        n %= d;
        sb.append(".");
        while(n != 0){
            map.put(n,sb.length());
            n *= 10;
            sb.append(n / d);
            n %= d;
            if(map.containsKey(n)) {
                int index = map.get(n);
                return String.format("%s(%s)", sb.subSequence(0, index), sb.substring(index));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        fractionToDecimal(-1,-2147483648);
    }
}
