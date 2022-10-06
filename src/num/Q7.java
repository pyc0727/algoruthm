package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 13:59
 * @Description:
 **/
public class Q7 {
    public int reverse(int x) {
        try {
            int ans = Integer.parseInt(new StringBuilder().append(Math.abs(x)).reverse().toString());
            return x>=0 ? ans : -ans;
        }catch (Exception e){
            return 0;
        }
    }

}

