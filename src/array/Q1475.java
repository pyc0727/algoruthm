package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/1 10:05
 * @Description:
 **/
public class Q1475 {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j] <= prices[i]){
                    prices[i] = prices[i]-prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
