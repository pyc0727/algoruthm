package stacks;

import java.util.Stack;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/9 15:15
 * @Description:
 **/
public class Q20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')'){
                if(!stack.isEmpty() && stack.pop() == '('){
                    continue;
                }
                return false;
            } else if (s.charAt(i) == '}') {
                if(!stack.isEmpty() && stack.pop() == '{'){
                    continue;
                }
                return false;
            }else if (s.charAt(i) == ']') {
                if(!stack.isEmpty() && stack.pop() == '['){
                    continue;
                }
                return false;
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
