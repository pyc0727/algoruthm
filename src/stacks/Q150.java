package stacks;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Stack;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/9 13:59
 * @Description:
 **/
public class Q150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if(token.equals("+")){
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a1+a2);
            } else if (token.equals("-")) {
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a2-a1);

            }else if (token.equals("*")) {
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a1*a2);
            }else if (token.equals("/")) {
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a2/a1);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
