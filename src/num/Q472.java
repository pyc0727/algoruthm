package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/8 14:19
 * @Description:
 **/
public class Q472 {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        int mid = (int)Math.sqrt(area);
        for (int i = mid; i>=1 ; i--) {
            if(area%i == 0){
                ans[0] = area%i;
                ans[1] = i;
                return ans;
            }
        }
        return ans;
    }
}
