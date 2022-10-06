package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/28 08:55
 * @Description:
 **/
public class Q17Q09 {
    public int getKthMagicNumber(int k) {
        if(k == 1)return 1;
        int p1 = 1;int p2 = 1;int p3 = 1;
        int[] res = new int[k+1];
        res[1] = 1;
        for (int i = 2; i <= k; i++) {
            int num1 = res[p1] * 3;int num2 = res[p2]*5;int num3 = res[p3]*7;
            int num = Math.min(num1,Math.min(num2,num3));
            res[i] = num;
            if(num == num1)p1++;
            if(num == num3)p3++;
            if(num == num2)p2++;
        }
        return res[k];
    }
}
