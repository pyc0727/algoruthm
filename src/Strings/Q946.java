package Strings;

import java.util.Stack;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/31 10:18
 * @Description:
 **/
public class Q946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.size() == 0;
    }
}
