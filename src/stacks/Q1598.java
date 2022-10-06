package stacks;

import java.util.Stack;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/9 10:34
 * @Description:
 **/
public class Q1598 {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (String log : logs) {
            if (log.startsWith("../")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else if (!log.startsWith("./")) {
                stack.push(log);
            }
        }
        return stack.size();

    }
}
