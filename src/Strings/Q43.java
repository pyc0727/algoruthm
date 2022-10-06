package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/1 16:16
 * @Description:
 **/
public class Q43 {
    public String multiply(String num1, String num2) {
        String ans = "0";

        for (int i = num1.length() ; i >= 0 ; i--) {
            int cur = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = num2.length(); j >= 0; j--) {
                int end = (num1.charAt(i) - '0') *(num2.charAt(j) - '0');
                end += cur;
                sb.append(end % 10);
                cur = end/10;
            }
            sb.append(cur == 0?"":cur);
            sb.reverse();
            for (int j = i; j < num1.length()-1; j++) {
                sb.append("0");
            }
            ans = addStrings(ans,sb.toString());
        }
        return ans;

    }


    public String addStrings(String num1, String num2) {
        int cur = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = num1.length()-1,j = num2.length()-1; i>=0 || j>=0 ; i--,j--) {
            int sum = 0;
            sum += i>=0?(num1.charAt(i) - '0'):0;
            sum += j>=0?(num2.charAt(j) - '0'):0;
            sum += cur;
            sb.append(sum % 10);
            cur = sum/10;
        }
        sb.append(cur == 0?"":cur);
        return sb.reverse().toString();

    }
}
