package stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/8 17:31
 * @Description:
 **/
public class Q71 {
    public  static String simplifyPath(String path) {
        if(path.length() == 1)return path;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < path.length(); i++) {
            if(path.charAt(i) == '/' && path.charAt(i-1) == '/')continue;
            sb.append(path.charAt(i));
        }
        if(!sb.toString().equals("") && sb.charAt(sb.length()-1) == '/')sb.deleteCharAt(sb.length()-1);
        String[] strings = sb.toString().split("/");
        Stack<String> stack = new Stack<>();
        for (String s : strings) {
            if(s.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if(s.equals(".") || s.equals("..")){
            }else {
                stack.push(s);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            ans.append("/").append(stack.get(i));
        }
        if(stack.size() == 0)sb.append("/");
        return ans.toString();
    }

    public static void main(String[] args) {
        simplifyPath("/../");
    }

}
