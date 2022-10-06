package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/31 14:29
 * @Description:
 **/
public class Q8 {
    public static int myAtoi(String s) {
        boolean flag = true;
        int l = 0;
        while(l < s.length() && s.charAt(l) == ' ')l++;
        // 如果字符串类型全部为空格，返回0
        if(l == s.length())return 0;
        // 读取符号
        if(s.charAt(l) == '+'){
            l++;
        }else if(s.charAt(l) == '-'){
            flag = false;
            l++;
        }
        // 读取数字
        int r = l;
        while( r < s.length() && Character.isDigit(s.charAt(r))){
            r++;
        }
        // 去除前面的0
        while(l < s.length() && s.charAt(l) == '0'){
            l++;
        }
        // 截取数字
        if(l == r)return 0;
        String digit = s.substring(l,r);
        if(digit.length() > 10){
            return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        long res = Long.parseLong(digit);
        if(flag){
            // 如果是正数
            return res>Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.toIntExact(res);
        }else{
            return (-res) < Integer.MIN_VALUE?Integer.MIN_VALUE:Math.toIntExact(-res);
        }

    }

    public static void main(String[] args) {
        System.out.println(myAtoi("20000000000000000000"));
    }

}
