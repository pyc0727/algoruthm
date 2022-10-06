package num;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 15:25
 * @Description:
 **/
public class Q504 {
    static List<Integer> list = new ArrayList<>();
    static {
        int n = 1;
        while(n < 10000000){
            list.add(n);
            n *= 7;
        }
    }
    public static String convertToBase7(int num) {
        int x = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        for (int i = list.size()-1; i >= 0 ; i--) {
            sb.append(x / list.get(i));
            x = x%list.get(i);
        }
        int ans = Integer.parseInt(sb.toString());
        return num >=0?String.valueOf(ans):"-"+ans;

    }

    //升级写法
    public String convertToBase71(int num) {
        boolean flag = num>=0;
        int x = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        do{
            sb.append(x%7);
            x = x/7;
        }while (x!=0);
        sb.reverse();
        return flag?sb.toString():"-"+sb;
    }

    public static void main(String[] args) {
        convertToBase7(-10);
    }
}
