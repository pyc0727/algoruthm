package greedy;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/30 21:28
 * @Description:
 **/
public class Q121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int price : prices) {
            if(price < min)min = price;
            if(price > min)res = Math.max(price-min,res);
        }
        return res;
    }

}
