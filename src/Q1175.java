import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: buyunchuan
 * @Date: 2022/6/30 10:21
 * @Description:
 **/
public class Q1175 {
    static int mode = (int)1e9+7;
    static int[] num = new int[101];

    static {
        int count = 1;
        for (int i = 2; i <= 100; i++) {
            boolean b = false;
            for (int j = 2; j * j <= i ; j++) {
                if (i % j == 0) {
                    b = true;
                    break;
                }
            }
                if (b) {
                    count++;
                }
                num[i] = count;
        }
    }

    public int numPrimeArrangements(int n) {
        long res = 1;
       int a = num[n],b = 100 - a;
        for (int i = 1; i <= a ; i++) {
            res = res * i % mode;
        }
        for (int i = 1; i <= b ; i++) {
            res = res * i % mode;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        new Q1175().numPrimeArrangements(5);
    }
}
