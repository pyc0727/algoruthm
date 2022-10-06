package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/8 14:44
 * @Description:
 **/
public class Q507 {
    public boolean checkPerfectNumber(int num) {
        int n = (int)Math.sqrt(num);
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            if(num % i == 0){
                ans+=i;
                if(num /i != i){
                    ans += num/i;
                }
            }
        }
        return ans == num;


    }

}
