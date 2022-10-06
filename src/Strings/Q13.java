package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/31 14:59
 * @Description:
 **/
public class Q13 {
    public int romanToInt(String s) {
        // 结果范围为1到3999
        int ans = 0;
        // 不做异常处理
        s = s + " ";
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == 'V'){
                ans += 5;
            }else if(s.charAt(i) == 'L'){
                ans += 50;
            }else if(s.charAt(i) == 'D'){
                ans += 500;
            }else if(s.charAt(i) == 'M'){
                ans += 1000;
            }else if(s.charAt(i) == 'I'){
                if(s.charAt(i+1) == 'V'){
                    ans += 4;
                    i++;
                }else if(s.charAt(i+1) == 'X'){
                    ans += 9;
                    i++;
                }else {
                    ans += 1;
                }
            }else if(s.charAt(i) == 'X'){
                if(s.charAt(i+1) == 'L'){
                    ans += 40;
                    i++;
                }else if(s.charAt(i+1) == 'C'){
                    ans += 90;
                    i++;
                }else {
                    ans += 10;
                }
            }else{
                //合法罗马数字，最后为C
                if(s.charAt(i+1) == 'D'){
                    ans += 400;
                    i++;
                }else if(s.charAt(i+1) == 'M'){
                    ans += 900;
                    i++;
                }else {
                    ans += 100;
                }
            }

        }
        return ans;

    }
}
