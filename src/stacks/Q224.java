package stacks;

import java.util.Stack;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/9 14:42
 * @Description:
 **/
public class Q224 {
    public static int calculate(String s) {
        int sign = 1;
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        stack.push(sign);
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == ' '){
                i++;
                continue;
            }
            if(s.charAt(i) == '+'){
                sign = stack.peek();
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -stack.peek();
                i++;
            } else if (s.charAt(i) == '(') {
                stack.push(sign);
                i++;
            }else if(s.charAt(i) == ')'){
                stack.pop();
                i++;
            }else{
                long num = 0;
                while(i < s.length() && s.charAt(i) > '0' && s.charAt(i) < '9'){
                    num = num*10 + (s.charAt(i) - '0');
                    i++;
                }
                ans += sign * num;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        calculate("2147483647");
    }
}
