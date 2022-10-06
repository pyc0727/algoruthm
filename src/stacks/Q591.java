package stacks;

import java.util.Stack;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/13 14:06
 * @Description:
 **/
public class Q591 {
    public static boolean isValid(String code) {
        int i = 0;
        int n = code.length();
        Stack<String> stack = new Stack<>();

        while (i < n) {
            if (i + 9 < n && code.startsWith("<![CDATA[", i)) {
                boolean flag = false;
                i += 9;
                while (i + 3 < n) {
                    if (code.startsWith("]]>",i)) {
                        i += 3;
                        flag = true;
                        break;
                    }else{
                        i++;
                    }
                }
                if (!flag) {
                    return false;
                }
            } else if (code.charAt(i) == '<') {
                if (i == n - 1) return false;
                boolean isEnd = code.charAt(i+1) == '/';
                if (isEnd) {
                    i += 2;
                } else {
                    i += 1;
                }
                int j = i;
                StringBuilder sb = new StringBuilder();
                while (j < n && code.charAt(j) != '>') {
                    if (code.charAt(j) <= 'Z' && code.charAt(j) >= 'A') {
                        sb.append(code.charAt(j));
                        j++;
                    } else {
                        return false;
                    }
                }
                if (sb.length() > 9) {
                    return false;
                }
                i = j + 1;
                if (isEnd) {
                    if (!stack.isEmpty() && !stack.pop().equals(sb.toString())) return false;
                    if(stack.isEmpty() && i<n){
                        return false;
                    }
                } else {
                    stack.push(sb.toString());
                }
            } else {
                if (i == 0) {
                    return false;
                }
                i++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        isValid(
                "<DIV> closed tags with invalid tag name  <b>123</b> </DIV>");
    }


}
