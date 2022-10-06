package stacks;

import java.util.Stack;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/8 17:20
 * @Description:
 **/
public class Q672 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < ops.length; i++) {
            if(ops[i].equals("+")){
                int s1 = stack.pop();
                int temp = (s1+stack.peek());
                stack.push(s1);
                stack.push(temp);
            }else if(ops[i].equals("D")){
                int temp =  stack.peek()<<1;
                stack.push(temp);
            } else if (ops[i].equals("C")) {
                stack.pop();
            }else {
                int temp = Integer.parseInt(ops[i]);
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        while (!stack.isEmpty()){
            ans += stack.pop();
        }

        return ans;

    }
}
