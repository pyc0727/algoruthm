package stacks;

import java.util.*;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/9 15:27
 * @Description:
 **/
public class Q636 {
    public static int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        int prev = 0;
        for (String log : logs) {
            String[] logInfo = log.split(":");
            if(log.contains("start")){
                int thread = stack.isEmpty()?Integer.parseInt(logInfo[0]):stack.peek();
                map.put(thread,map.getOrDefault(thread,0)+Integer.parseInt(logInfo[2])-prev);
                stack.push(Integer.parseInt(logInfo[0]));
                prev = Integer.parseInt(logInfo[2]);
            }else{
                map.put(stack.pop(),map.getOrDefault(Integer.parseInt(logInfo[0]),0)+Integer.parseInt(logInfo[2])-prev+1);
                prev = Integer.parseInt(logInfo[2])+1;
            }
        }
        int[] ans = new int[map.size()];
        map.forEach((k,v)->{
            ans[k] = v;
        });
        return ans;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("0:start:0");
        list.add("0:start:2");
        list.add("0:end:5");
        list.add("1:start:6");
        list.add("1:end:6");
        list.add("0:end:7");
        exclusiveTime(2,list);
    }
}
