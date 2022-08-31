package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/31 10:30
 * @Description:
 **/
public class Q38 {
    public static String countAndSay(int n) {
        String[] ans = new String[n];
        ans[0] = "1";
        for (int i = 1; i < n; i++) {
            String s = ans[i - 1];
            StringBuilder sb = new StringBuilder();
            s = s + " ";
            int left = 0,right = 0;
            while(right < s.length()-1){
                right++;
                if(s.charAt(right) != s.charAt(left)){
                    sb.append(String.valueOf(right-left)+s.charAt(left));
                    left = right;
                }
            }
            ans[i] = sb.toString();
        }
        return ans[n-1];
    }

    public static void main(String[] args) {
        countAndSay(5);
    }


}
