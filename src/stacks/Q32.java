package stacks;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/14 15:20
 * @Description:
 **/
public class Q32 {
    public int longestValidParentheses(String s) {
            Deque<Integer> deque = new LinkedList<>();
            int len = 0;
            deque.push(-1);
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '('){
                    deque.addLast(i);
                }else{
                    deque.pop();
                    if(deque.isEmpty()){
                        deque.push(i);
                    }
                    len = Math.max(len,i - deque.peek());
                }
            }
            return len;

    }
}
