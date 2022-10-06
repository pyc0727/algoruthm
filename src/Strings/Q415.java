package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/1 15:54
 * @Description:
 **/
public class Q415 {
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
