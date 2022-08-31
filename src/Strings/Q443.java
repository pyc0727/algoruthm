package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/31 11:09
 * @Description:
 **/
public class Q443 {
    public static int compress(char[] chars) {
            int l = 0;int r = 0;int ans = 0;
            if(chars.length == 1)return 1;
            while (r < chars.length - 1){
                r ++;
                if(chars[r] != chars[l]){
                    int temp = r-l;
                    chars[ans] = chars[l];
                    ans ++;
                    if(temp != 1){
                        String val  = String.valueOf(temp);
                        for (int i = 0; i < val.length(); i++) {
                            chars[ans] = val.charAt(i);
                            ans ++;
                        }
                    }
                    l = r;
                }
                if(r == chars.length-1){
                    int temp = r-l+1;
                    chars[ans] = chars[l];
                    ans ++;
                    if(temp != 1){
                        String val  = String.valueOf(temp);
                        for (int i = 0; i < val.length(); i++) {
                            chars[ans] = val.charAt(i);
                            ans ++;
                        }
                    }
                }
            }
            return ans;
    }

    public static void main(String[] args) {
        compress("abbbbbbbbbbbb".toCharArray());
    }
}
