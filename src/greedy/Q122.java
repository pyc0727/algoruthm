package greedy;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/30 21:40
 * @Description:
 **/
public class Q122 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i+1]-prices[i]>0){
                res += (prices[i+1]-prices[i]);
            }
        }
        return res;
    }
}
