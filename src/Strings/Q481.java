package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/31 17:26
 * @Description:
 **/
public class Q481 {
    public int magicalString(int n) {
            StringBuilder sb = new StringBuilder();
            sb.append("122");
            int l = 2;
            while(sb.length() <= n){
                char s = sb.charAt(sb.length()-1) == '1'?'2':'1';
                for (int i = 0; i <  sb.charAt(l++)-'0'; i++) {
                    sb.append(s);
                }
            }
            String ans = sb.substring(0,n);
            int res = 0;
            for (int i = 0; i < ans.length(); i++) {
                if(ans.charAt(i) == '1')res++;
            }
            return res;
        //统计1的个数

    }
}
